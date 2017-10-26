package org.eclipse.cmf.occi.googlejson.handlers.json.data;

import java.util.List;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.googlejson.handlers.json.KindsBuilder;

public class AttributeData {

	public final String name;
	
	public final String description;
	
	public String type;

	public String format;

	public List<EnumField> enums;

	public String typeOfArray;

	public String additionalPropertiesString;

	public boolean isAnotherKind;

	public AttributeData(String name, String description, String type) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.isAnotherKind = false;
	}

	public Attribute toAttributeOcci(Extension extension) {
		final Attribute attribute = OCCIFactory.eINSTANCE.createAttribute();
		attribute.setName(this.name);
		attribute.setDescription(this.description);

		if (this.isAnotherKind && StringToDataType.map.get(this.type) == null) {
			DataType type = OCCIFactory.eINSTANCE.createEObjectType();
			type.setName(this.type);
			type.setDocumentation(this.description);
			StringToDataType.map.put(this.type, type);
			extension.getTypes().add(type);
		}
		
		if (this.enums != null) {
			EnumerationType enumType = OCCIFactory.eINSTANCE.createEnumerationType();
			enumType.setName(this.name);
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
