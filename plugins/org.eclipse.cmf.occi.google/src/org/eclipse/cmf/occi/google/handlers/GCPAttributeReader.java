package org.eclipse.cmf.occi.google.handlers;

import static org.eclipse.cmf.occi.google.handlers.GCPCrawler.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.NumericTypeEnum;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.RecordField;
import org.eclipse.cmf.occi.core.RecordType;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GCPAttributeReader {
	
	private static Document currentKindDoc;

	public static StringBuilder readAttributes(final Document kindDoc, final String kind, final String filter,
			StringBuilder enumStr, List<Attribute> attributesModel, List<EnumerationType> enumsModel) {
		StringBuilder attribute = new StringBuilder();
		currentKindDoc = kindDoc;
		Elements attributesFilters = kindDoc.select(filter);
		for (Element attributeElt : attributesFilters) {
			List<Element> rows = attributeElt.select("tr");
			for (int j = 0; j < rows.size(); j++) { // could start at 1 because
													// the 1st row is the header
													// of the table
				// for (Element attributeRow : attributeElt.select("tr")) {
				Element attributeRow = rows.get(j);
				Elements attributeInfos = attributeRow.select("td");
				String currentAttributeDescription = getAttributeDescription(attributeInfos);
				if (!currentAttributeDescription.isEmpty()) {
					String currentAttributeName = "";
					String currentAttributeType = "";
					Element attributeName = attributeInfos.get(0);
					Element attributeType = attributeInfos.get(1).select("code").get(0);
					// To parse the description in case of only 2 <tds>
					// and a sequence of <p>
					currentAttributeName = attributeName.text();
					currentAttributeType = attributeType.text();
					System.out.println("AttributeKind:" + kind + ", AttributeName:" + currentAttributeName + ", Type:"
							+ currentAttributeType + ", Description:" + currentAttributeDescription);
					attribute.append(attributecsv(kind, currentAttributeName, currentAttributeType,
							currentAttributeDescription));
					StringBuilder enumString;
					if (currentAttributeType.startsWith("enum")) {
						enumString = readEnums(kindDoc, currentAttributeType, attributeType, kind);
						if (enumString.toString().isEmpty()) {
							throw new RuntimeException("Should not be empty !");
						}
						enumStr.append(enumString);
					} else {
						enumString = new StringBuilder();
					}

					// parameter url to know where to go in case of object(
					DataType typeModel = buildType(kindDoc.baseUri(), currentAttributeName, currentAttributeDescription,
							currentAttributeType, enumString);

					if (typeModel instanceof ArrayType && j + 1 < rows.size()) {
						String nextName = rows.get(j + 1).select("td").get(0).text();
						if (nextName.startsWith(currentAttributeName)) {
							RecordType recordType = OCCIFactory.eINSTANCE.createRecordType();
							recordType.setName(currentAttributeName + "Record");
							((ArrayType) typeModel).setType(recordType);
							if (!extension.getTypes().contains(recordType)) {
								extension.getTypes().add(recordType);
							}
							if (!extension.getTypes().contains(typeModel)) {
								extension.getTypes().add(typeModel);
							}
						}
					}

					Attribute at = OCCIFactory.eINSTANCE.createAttribute();
					at.setName(currentAttributeName.replace("[]", ""));
					at.setDescription(currentAttributeDescription);

					switchOnModifiers(at, currentAttributeDescription);
					switchOnAccess(at, currentAttributeDescription);

					if (currentAttributeType.contains("#")) {
						at.setDefault(currentAttributeType);
					}

					if (typeModel != null && currentAttributeName.endsWith("[]")) {
						DataType typeOfArray = complexDatatypes.get(currentAttributeName + "Array");
						if (typeOfArray == null) {
							typeOfArray = OCCIFactory.eINSTANCE.createArrayType();
							typeOfArray.setName(currentAttributeName.replace("[]", "") + "Array");
							typeOfArray.setDocumentation(currentAttributeDescription);
							((org.eclipse.cmf.occi.core.ArrayType) typeOfArray).setType(typeModel);
							complexDatatypes.put(currentAttributeName.replace("[]", "") + "Array", typeOfArray);
							extension.getTypes().add(typeOfArray);
							at.setType(typeOfArray);
						}
						if (!extension.getTypes().contains(typeModel)) {
							extension.getTypes().add(typeModel);
						}
					} else if (typeModel != null) {
						if (!extension.getTypes().contains(typeModel)) {
							extension.getTypes().add(typeModel);
						}
						at.setType(typeModel);
					}
					// add to the main list of attributes kind.
					if (typeModel == null) {
						throw new RuntimeException("typeModel == null " + currentAttributeType + " " + kind);
					}
					//if (!"RecordField".equals(typeModel.getDocumentation()))
					attributesModel.add(at);
				}
			}
		}
		return attribute;
	}

	private static String getAttributeDescription(Elements attributeInfos) {
		String currentAttributeDescription = "";
		if (attributeInfos == null || attributeInfos.isEmpty())
			return currentAttributeDescription;
		int i = 0;
		// To parse the description in case of only 2 <tds> and a
		// sequence of <p>
		if (attributeInfos.size() >= 2) {
			Elements attributeDescriptions = attributeInfos.get(1).select("p");
			if (attributeDescriptions.isEmpty()) {
				return getAttributeDescription2(attributeInfos);
			}
			attributeDescriptions.addAll(attributeInfos.get(1).select("li"));
			for (Element attributeDescriptionTmp : attributeDescriptions) {
				if (i != 0) {
					if (attributeDescriptionTmp.getElementsByClass("apitype").isEmpty()) {
						currentAttributeDescription += attributeDescriptionTmp.text() + " ";
					}
				}
				i++;
			}
		} else if (attributeInfos.size() > 1) {
			Element attributeDescription = attributeInfos.get(2);
			currentAttributeDescription = attributeDescription.text().isEmpty() ? noneToken
					: attributeDescription.text();
		}
		return currentAttributeDescription;
	}
	
	private static String getAttributeDescription2(Elements attributeInfos) {
		Elements tds = attributeInfos.select("td");
		String description = "";
		for (Element td : tds) {
			description += td.text() + ":";
		}
		return description;
	}

	private static DataType buildType(String url, String currentAttributeName, String currentAttributeDescription,
			String currentAttributeType, StringBuilder enumString) {
		RecordType recordType = null;
		int sizeInCommon = Integer.MIN_VALUE;
		String selectionnedNameRecordType = "";
		for (DataType type : complexDatatypes.values()) {
			String nameOfRecordType = type.getName().substring(0, type.getName().length() - "Record".length());
			if (type instanceof RecordType && currentAttributeName.startsWith(nameOfRecordType + ".")
					&& (nameOfRecordType + ".").length() > sizeInCommon) {
				sizeInCommon = (nameOfRecordType + ".").length();
				recordType = (RecordType) type;
				selectionnedNameRecordType = nameOfRecordType;
			}
		}
		if (recordType != null) {
			RecordField recordField = OCCIFactory.eINSTANCE.createRecordField();
			recordField.setName(currentAttributeName.substring((selectionnedNameRecordType + ".").length()));
			recordField.setDescription(currentAttributeDescription);
			DataType type;
			if (currentAttributeName.endsWith("[]")) {
				type = OCCIFactory.eINSTANCE.createArrayType();
			} else {
				type = getType(url, currentAttributeName, currentAttributeDescription, currentAttributeType,
						enumString);
			}
			switchOnModifiers(recordField, currentAttributeDescription);
			switchOnAccess(recordField, currentAttributeDescription);
			recordType.getRecordFields().add(recordField);
			if (type == null) {
				type = OCCIFactory.eINSTANCE.createEObjectType();
				type.setName(currentAttributeName);
			}
			recordField.setType(type);
			type.setDocumentation("RecordField");
			return type;
		}
		return getType(url, currentAttributeName, currentAttributeDescription, currentAttributeType, enumString);
	}

	private static DataType getType(String baseUrl, String currentAttributeName, String currentAttributeDescription,
			String currentAttributeType, StringBuilder enumString) {
		DataType typeModel = switchOnBasic(currentAttributeType, currentAttributeDescription);
		if (typeModel != null) {
			return typeModel;
		} else {
			return switchOnComplex(baseUrl, currentAttributeType, currentAttributeName, currentAttributeDescription,
					enumString);
		}
	}

	private static void buildObject(String baseUrl, String currentAttributeType, String currentAttributeName,
			String currentAttributeDescription, StringBuilder enumString) {
		boolean alreadyRegistered = false;
		currentAttributeType = currentAttributeType.substring("object(".length(), currentAttributeType.length() - 1);
		for (Kind registerKind : extension.getKinds()) {
			if (currentAttributeType.equals(registerKind.getName())) {
				alreadyRegistered = true;
				break;
			}
		}
		if (!alreadyRegistered) {
			Kind kindModel = OCCIFactory.eINSTANCE.createKind();
			kindModel.setName(currentAttributeType.replace(".", ""));
			kindModel.setScheme(extension.getScheme());
			kindModel.setParent(linkKind);
			extension.getKinds().add(kindModel);
			String url = baseUrl + "#" + currentAttributeType;
			String filter = "table*[id=" + currentAttributeType + ".FIELDS-table]";
			GCPCrawler.readResourcePage(currentKindDoc, currentAttributeType, enumString, url, filter);
		}
	}

	private static DataType switchOnComplex(String baseUrl, String currentAttributeType, String currentAttributeName,
			String currentAttributeDescription, StringBuilder enumString) {
		DataType typeModel = null;
		String[] typeCases = { "object(", "enum", "nested object", "object", "list", "etag", "map" };
		int l;
		for (l = 0; l < typeCases.length; l++) {
			if (currentAttributeType.startsWith(typeCases[l])) {
				break;
			}
		}
		switch (l) {
		case 0: // object;
			buildObject(baseUrl, currentAttributeType, currentAttributeName, currentAttributeDescription, enumString);
			typeModel = OCCIFactory.eINSTANCE.createEObjectType();
			typeModel.setName(currentAttributeType);
			typeModel.setDocumentation(currentAttributeDescription);
			break;
		case 1: // enum
			String enumstr = enumString.toString();
			String[] enumsLiterals = enumstr.toString().split(System.getProperty("line.separator"));
			String[] enumAsArray = enumsLiterals[0].split("" + separator);
			typeModel = complexDatatypes.get(enumAsArray[1] + "Enum");
			if (typeModel == null) {
				typeModel = OCCIFactory.eINSTANCE.createEnumerationType();
				typeModel.setName(enumAsArray[1] + "Enum");
				typeModel.setDocumentation(currentAttributeDescription);
				for (String enumLiteral : enumsLiterals) {
					String[] currentEnumLiteral = enumLiteral.split("" + separator);
					EnumerationLiteral el = OCCIFactory.eINSTANCE.createEnumerationLiteral();
					el.setEnumerationType((EnumerationType) typeModel);
					el.setName(currentEnumLiteral[2]);
					if (currentEnumLiteral.length >= 4)
						el.setDocumentation(currentEnumLiteral[3]);
					((EnumerationType) typeModel).getLiterals().add(el);
				}
				complexDatatypes.put(enumAsArray[1] + "Enum", typeModel);
			}
			break;
		case 2: // nested object
		case 3: // object
			typeModel = readRecordType(currentAttributeName, currentAttributeDescription);
			break;
		case 4: // list
			typeModel = complexDatatypes.get(currentAttributeName + "Array");
			if (typeModel == null) {
				typeModel = OCCIFactory.eINSTANCE.createArrayType();
				typeModel.setName(currentAttributeName.replace("[]", "") + "Array");
				typeModel.setDocumentation(currentAttributeDescription);
				((ArrayType) typeModel).setType(typeModelFloat);
				complexDatatypes.put(currentAttributeName.replace("[]", "") + "Array", typeModel);
				// TODO: Read description to set type of the array
			}
			break;
		case 5: // etag
			typeModel = typeModelEtag;
			typeModel.setName(currentAttributeName);
			break;
		case 6: // map
			typeModel = typeModelMap;
			typeModel.setName(currentAttributeName);
			break;
		}
		return typeModel;
	}

	/**
	 * Read the enum types of an attribute
	 * 
	 * @param doc
	 * @param currentAttributeType
	 * @param attributeType
	 * @param kind
	 * @return
	 */
	private static StringBuilder readEnums(Document doc, final String currentAttributeType, final Element attributeType,
			final String kind) {
		StringBuilder enumTypes = new StringBuilder();
		if (currentAttributeType.contains("enum")) {
			String enumType = attributeType.select("a").get(0).attr("href");
			if (enumType.length() > 0) {
				if (enumType.length() < 4)
					throw new RuntimeException("enum < 4");
				// enumType = doc.baseUri() + enumType.substring(1);
				//else if (!enumType.substring(0, 4).equals("http"))
				//	throw new RuntimeException("!enumType.substring(0, 4).equals(\"http\")"); TODO no need to check if this a link to another HTML page.
				// TODO we use now the snapshot, and the link to the definition of the Enum is now a local anchor
				// enumType = doc.baseUri() + enumType.substring(1);
				// To get the list of all literals from enumType
				String selectedAttributeType = currentAttributeType.substring("enum(".length(),
						currentAttributeType.length() - 1);

				if (!enumType.startsWith("#")) { // it is not a local anchor, we must connect to a new page...
					try {
						doc = Jsoup.parse(new File(GoogleCrawler.PATH_TO_ROOT_HTML + enumType.split("#")[0] + ".html"), "UTF-8");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				Element table = doc.getElementById(selectedAttributeType + ".ENUM_VALUES-table");
				if (table == null) {
					for (Element element : doc.getAllElements()) {
						if (element.id().endsWith(selectedAttributeType + ".ENUM_VALUES-table")) {
							table = element;
						}
					}
				}
				Elements rows = table.select("tr");
				rows.remove(0);// removing the header of the table
				for (Element row : rows) {
					String enumLiteral = row.select("td").get(0).text();
					String enumLiteralDescription = row.select("td").get(1).text();
					enumTypes.append(enumcsv(kind, selectedAttributeType, enumLiteral, enumLiteralDescription));
				}
			}
		}
		return enumTypes;
	}

	private static DataType switchOnBasic(String currentAttributeType, String currentAttributeDescription) {
		DataType typeModel = null;

		String[] basicType = new String[] { "string", "boolean", "integer", "unsigned integer", "number", "float",
				"long", "unsigned long", "double", "bytes", "datetime" };

		int j;
		for (j = 0; j < basicType.length; j++)
			if (currentAttributeType.startsWith(basicType[j]))
				break;

		switch (j) {
		case 0: // "string":
			// If in the description there is the tag, we consider this string as an email.
			if (currentAttributeDescription.toLowerCase().contains("email address of ")) {
				typeModel = typeModelEmail;
			} else {
				typeModel = typeModelString;	
			}
			//typeModel.setName("String");
			break;
		case 1: // "boolean":
			typeModel = typeModelBoolean;
			typeModel.setName("Boolean");
			break;
		case 2: // "integer":
		case 3: // "number":
			typeModel = typeModelInteger;
			typeModel.setName("Integer");
			((org.eclipse.cmf.occi.core.NumericType) typeModel).setType(NumericTypeEnum.INTEGER);
			break;
		case 4: // "unsigned integer":
			typeModel = typeModelUnsignedInteger;
			typeModel.setName("UnsignedInteger");
			((org.eclipse.cmf.occi.core.NumericType) typeModel).setType(NumericTypeEnum.INTEGER);
			((org.eclipse.cmf.occi.core.NumericType) typeModel).setMinInclusive("0");
			break;
		case 5: // "float":
			typeModel = typeModelFloat;
			typeModel.setName("Float");
			((org.eclipse.cmf.occi.core.NumericType) typeModel).setType(NumericTypeEnum.FLOAT);
			break;
		case 6: // "long":
			typeModel = typeModelLong;
			typeModel.setName("Long");
			((org.eclipse.cmf.occi.core.NumericType) typeModel).setType(NumericTypeEnum.LONG);
			break;
		case 7: // "unsigned long":
			typeModel = typeModelUnsignedLong;
			typeModel.setName("UnsignedLong");
			((org.eclipse.cmf.occi.core.NumericType) typeModel).setType(NumericTypeEnum.LONG);
			((org.eclipse.cmf.occi.core.NumericType) typeModel).setMinInclusive("0");
			break;
		case 8: // "double":
			typeModel = typeModelDouble;
			typeModel.setName("Double");
			((org.eclipse.cmf.occi.core.NumericType) typeModel).setType(NumericTypeEnum.DOUBLE);
			break;
		case 9: // "bytes":
			typeModel = typeModelByte;
			typeModel.setName("Bytes");
			((org.eclipse.cmf.occi.core.NumericType) typeModel).setType(NumericTypeEnum.BYTE);
			break;
		case 10: // "datetime":
			typeModel = typeModelDatetime;
			typeModel.setName("Datetime");
			// ((org.eclipse.cmf.occi.core.EObjectType)
			// typeModel).setInstanceClassName("org.joda.time.DateTime");
			break;
		}
		// kind bigquery#table The type of resource ID. in
		// https://cloud.google.com/bigquery/docs/reference/rest/v2/tables
		if (currentAttributeType.contains("#")) {
			typeModel = typeModelString;
			//typeModel.setName("String");
		}
		return typeModel;
	}

	private static DataType readRecordType(String currentAttributeName, String currentAttributeDescription) {
		DataType typeModel = complexDatatypes.get(currentAttributeName);
		if (typeModel == null) {
			typeModel = OCCIFactory.eINSTANCE.createRecordType();
			String nameOfNewRecordType = (currentAttributeName.endsWith("[]") ?
							currentAttributeName.replace("[]", "") : 
							currentAttributeName) + "Record";
			typeModel.setName(nameOfNewRecordType);
			typeModel.setDocumentation(currentAttributeDescription);
			complexDatatypes.put(nameOfNewRecordType, typeModel);
			if (currentAttributeName.equals("access[]Record")) {
				System.exit(-1);
			}
			if (!extension.getTypes().contains(typeModel)) {
				extension.getTypes().add(typeModel);
			}
		}
		return typeModel;

	}

	private static void switchOnModifiers(Attribute at, String currentAttributeDescription) {
		String[] requiredCases = { "[Optional]", "An optional", "[Required]", "default value is", "default is",
				"default and only option is", "This is always", "Always"};
		int j;
		for (j = 0; j < requiredCases.length; j++)
			if (currentAttributeDescription.contains(requiredCases[j]))
				break;

		switch (j) {
		case 0: // Optional
			at.setRequired(false);
			at.setDescription(currentAttributeDescription.substring("[Optional]".length()));
			break;
		case 1: // An optional
			at.setRequired(false);
			break;
		case 2: // Required
			at.setRequired(true);
			at.setDescription(currentAttributeDescription.substring("[Required]".length()));
			break;
		case 3: // default value is
			Pattern defaultPattern1 = Pattern.compile("default value is ([0-9a-zA-Z\\.\\_\\-]*)");
			Matcher defaultMatcher1 = defaultPattern1.matcher(currentAttributeDescription);
			if (defaultMatcher1.find()) {
				String defaultValue1 = defaultMatcher1.group(1);
				// .substring(0,
				// defaultMatcher1.group(1).lastIndexOf("."));
				at.setDefault(defaultValue1);
			}
			break;
		case 4: // default is
			Pattern defaultPattern2 = Pattern.compile("default is ([0-9a-zA-Z\\\\.\\-]*)");
			Matcher defaultMatcher2 = defaultPattern2.matcher(currentAttributeDescription);
			if (defaultMatcher2.find()) {
				String defaultValue2 = defaultMatcher2.group(1);
				// .substring(0,
				// defaultMatcher2.group(1).lastIndexOf("."));
				at.setDefault(defaultValue2);
			}
			break;
		case 5: // default and only option is
			Pattern defaultPattern3 = Pattern.compile("default and only option is ([0-9a-zA-Z\\_0-9a-zA-Z]*)");
			Matcher defaultMatcher3 = defaultPattern3.matcher(currentAttributeDescription);
			if (defaultMatcher3.find()) {
				at.setDefault(defaultMatcher3.group(1));
			}
			break;
		case 6: // This is always
			Pattern defaultPattern4 = Pattern.compile("This is always ([0-9a-zA-Z\\#0-9a-zA-Z]*)");
			Matcher defaultMatcher4 = defaultPattern4.matcher(currentAttributeDescription);
			if (defaultMatcher4.find()) {
				at.setDefault(defaultMatcher4.group(1).replace(".", ""));
				at.setMutable(false);
			}
			break;
		case 7: // Always
			Pattern defaultPattern6 = Pattern.compile("always ([0-9a-zA-Z\\#0-9a-zA-Z]*)");
			Matcher defaultMatcher6 = defaultPattern6.matcher(currentAttributeDescription);
			if (defaultMatcher6.find()) {
				at.setDefault(defaultMatcher6.group(1));
				at.setMutable(false);
			}
		}
	}

	private static void switchOnAccess(Attribute at, String currentAttributeDescription) {
		String[] mutableCases = { "Output-only", "Output Only", "Output only", "read only", "Input-only",
				"Input Only" };
		int k;
		for (k = 0; k < mutableCases.length; k++)
			if (currentAttributeDescription.contains(mutableCases[k]))
				break;
		switch (k) {
		case 0: // Output-only
		case 1: // Output Only
		case 2: // Output only
			at.setMutable(false);
			at.setDescription(currentAttributeDescription.substring("[Output-only]".length()));
			break;
		case 3: // read only
			at.setMutable(false);
			break;
		case 4: // Input-only
		case 5: // Input Only
			at.setMutable(true);
			at.setDescription(currentAttributeDescription.substring("[Input-only]".length()));
			break;
		}
	}

}
;