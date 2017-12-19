package org.eclipse.cmf.occi.googlejson.handlers.json.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.googlejson.handlers.json.KindsBuilder;
import org.eclipse.emf.ecore.EObject;

public class AttributeData {

	public final String name;

	public final String description;

	public String type;

	public String format;

	public List<EnumField> enums;

	public String typeOfArray;

	public String additionalPropertiesString;

	public boolean isAnotherKind;
	
	public static Map<Kind, String> linkKindToTermOfTarget = new HashMap<>();

	public AttributeData(String name, String description, String type) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.isAnotherKind = false;
	}
	
	public boolean shouldSkip(Kind kind) {
		if (kind == null || kind.getParent() == null) {
			return false;
		}
		Kind currentParent = kind.getParent();
		while (currentParent != null) {
			for (Attribute parentAttribute : currentParent.getAttributes()) {
				if (parentAttribute.getName().endsWith(this.name)) {
					// the attribute is already in the parent kind
					return true;
				}
			}
			currentParent = currentParent.getParent();
		}
		return false;
	}

	public Attribute toAttributeOcci(Kind kind, Extension extension) {
		if (shouldSkip(kind)) {
			return null;
		}
		
		final Attribute attribute = OCCIFactory.eINSTANCE.createAttribute();
		
		attribute.setName(this.name.replaceAll("_", "."));
		attribute.setDescription(this.description);

		if (this.isAnotherKind && StringToDataType.map.get(this.type) == null) {
			Kind kindLink = OCCIFactory.eINSTANCE.createKind();
			try {
				OcciHelper.getKindByTerm(extension, this.type.toLowerCase() + "link");
				kindLink.setName(kind.getName() + this.type + "Link");
			} catch (Exception e) {
				kindLink.setName(this.type + "Link");
			}
			kindLink.setTitle(this.description);
			kindLink.setParent(
					OcciHelper.getKindByTerm(OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#"), "link")
			);
			kindLink.setScheme(extension.getScheme());
			kindLink.setSource(kind);
			try {
				kindLink.setTarget(OcciHelper.getKindByTerm(extension, this.type.toLowerCase()));	
			} catch (Exception ignored) {
				linkKindToTermOfTarget.put(kindLink, this.type.toLowerCase());
			}
			extension.getKinds().add(kindLink);
			return null;
			/*
			 * EObjectType type = OCCIFactory.eINSTANCE.createEObjectType();
			 * type.setName(this.type); type.setDocumentation(this.description);
			 * type.setInstanceClassName(type.getName());
			 * StringToDataType.map.put(this.type, type); extension.getTypes().add(type);
			 */
		} else {
			if (this.enums != null) {
				EnumerationType enumType = OCCIFactory.eINSTANCE.createEnumerationType();
				boolean nameHasBeenSet = false;
				for (Kind otherKind : extension.getKinds()) {
					for (Attribute attributeOfKind : otherKind.getAttributes()) {
						if (attributeOfKind.getName().equals(this.name.replaceAll("_", "."))) {
							String correctedName = this.name.replaceAll("_", ".");
							enumType.setName((kind == null ? "" : kind.getName()) +
									Character.toUpperCase(correctedName.charAt(0)) + correctedName.substring(0).toLowerCase());
							nameHasBeenSet = true;
							break;
						}
					}
					if (nameHasBeenSet) {
						break;
					}
				}
				if (!nameHasBeenSet) {
					enumType.setName(this.name.replaceAll("_", "."));
				}
				enumType.setDocumentation(this.description);
				for (EnumField field : this.enums) {
					enumType.getLiterals().add(field.toOcci(enumType));
				}
				StringToDataType.map.put(this.type, enumType);
				extension.getTypes().add(enumType);
			}

			attribute.setType(StringToDataType.map.get(this.type));
			attribute.setMutable(true);
			attribute.setRequired(true);
			return attribute;
		}

	}
}
