package org.occiware.google.gcp.popup.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.BooleanType;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.NumericTypeEnum;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.RecordField;
import org.eclipse.cmf.occi.core.RecordType;
import org.eclipse.cmf.occi.core.StringType;

public class FixRecord {
	
	public final static StringType typeModelString = OCCIFactory.eINSTANCE.createStringType();
	public final static BooleanType typeModelBoolean = OCCIFactory.eINSTANCE.createBooleanType();
	public final static NumericType typeModelByte = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelDouble = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelFloat = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelInteger = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelLong = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelShort = OCCIFactory.eINSTANCE.createNumericType();
	public final static EnumerationType typeEnum = OCCIFactory.eINSTANCE.createEnumerationType();
	public final static ArrayType typeArray = OCCIFactory.eINSTANCE.createArrayType();
	public final static RecordType typeRecord = OCCIFactory.eINSTANCE.createRecordType();
	
	public final static ArrayType typeArrayRecord = OCCIFactory.eINSTANCE.createArrayType();
	
	public final static EObjectType typeModelMap = OCCIFactory.eINSTANCE.createEObjectType();
	
	private Extension extension;
	
	public FixRecord(Extension extension){
		this.extension = extension;
		typeModelByte.setType(NumericTypeEnum.BYTE);
		typeModelByte.setName("byte");
		typeModelDouble.setType(NumericTypeEnum.DOUBLE);
		typeModelByte.setName("double");
		typeModelFloat.setType(NumericTypeEnum.FLOAT);
		typeModelByte.setName("float");
		typeModelInteger.setType(NumericTypeEnum.INTEGER);
		typeModelByte.setName("integer");
		typeModelLong.setType(NumericTypeEnum.LONG);
		typeModelByte.setName("long");
		typeModelShort.setType(NumericTypeEnum.SHORT);
		typeModelByte.setName("short");
		
		typeModelBoolean.setName("boolean");
		typeModelString.setName("string");
		typeEnum.setName("enum");
		typeArray.setName("array");
		typeArrayRecord.setName("array");
		typeRecord.setName("record");
		typeArrayRecord.setType(typeRecord);
		
		typeModelMap.setName("map");
		
		extension.getTypes().add(typeModelString);
		extension.getTypes().add(typeModelBoolean);
		extension.getTypes().add(typeModelByte);
		extension.getTypes().add(typeModelDouble);
		extension.getTypes().add(typeModelFloat);
		extension.getTypes().add(typeModelInteger);
		extension.getTypes().add(typeModelLong);
		extension.getTypes().add(typeModelShort);
		extension.getTypes().add(typeEnum);
		extension.getTypes().add(typeArray);
		extension.getTypes().add(typeRecord);
		extension.getTypes().add(typeModelMap);
	}
	
	public void fix() {
		List<Kind> kinds = extension.getKinds();
		for (Kind kind : kinds) {
			List<Attribute> tmp = new ArrayList<>(kind.getAttributes());
			for (Attribute attribute : kind.getAttributes()) {
				if (attribute.getType().getName().endsWith("Array")){
					fixArray(kind, tmp, attribute);
				} else if (attribute.getType().getName().endsWith("Record")) {
					List<Attribute> attributeToBeChangedIntoRecordField = new ArrayList<>();
					for (Attribute attribute2 : kind.getAttributes()) {
						if (attribute2.getName().startsWith(attribute.getName() + ".")) {
							tmp.remove(attribute2);
							attributeToBeChangedIntoRecordField.add(attribute2);
						}
					}
					List<RecordField> fields = listAttributeToListRecordField(attributeToBeChangedIntoRecordField);
					RecordType newRecordType = OCCIFactory.eINSTANCE.createRecordType();
					newRecordType.setName(attribute.getName() + "Record");
					newRecordType.getRecordFields().addAll(fields);
					extension.getTypes().add(newRecordType);
					attribute.setType(newRecordType);
				}
			}
			kind.getAttributes().clear();
			kind.getAttributes().addAll(tmp);
		}
	}
	
	private void fixArray(Kind kind, List<Attribute> tmp, Attribute attribute) {
		List<Attribute> attributeToBeChangedIntoRecordField = new ArrayList<>();
		for (Attribute attribute2 : kind.getAttributes()) {
			if (attribute2.getName().startsWith(attribute.getName() + ".")) {
				tmp.remove(attribute2);
				attributeToBeChangedIntoRecordField.add(attribute2);
			}
		}
		List<RecordField> fields = listAttributeToListRecordField(attributeToBeChangedIntoRecordField);
		ArrayType newTypeArray = OCCIFactory.eINSTANCE.createArrayType();
		newTypeArray.setName("array");
		RecordType newRecordType = OCCIFactory.eINSTANCE.createRecordType();
		newRecordType.setName(attribute.getName() + "Record");
		newRecordType.getRecordFields().addAll(fields);
		newTypeArray.setType(newRecordType);
		extension.getTypes().add(newTypeArray);
		extension.getTypes().add(newRecordType);
		attribute.setType(newTypeArray);
	}
	
	private List<RecordField> listAttributeToListRecordField(List<Attribute> attributeToBeChangedIntoRecordField) {
		List<RecordField> fields = new ArrayList<>();
		for (Attribute current : attributeToBeChangedIntoRecordField) {
			RecordField field = OCCIFactory.eINSTANCE.createRecordField();
			field.setName(current.getName());
			field.setDescription(current.getDescription());
			field.setMutable(current.isMutable());
			field.setRequired(current.isRequired());
			field.setType(current.getType());
			field.setDefault(current.getDefault());
			fields.add(field);
		}
		return fields;
	}
	
}
