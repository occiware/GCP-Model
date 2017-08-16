package org.occiware.clouddesigner.google2occi.handlers.json.data;

import java.util.List;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.occiware.clouddesigner.google2occi.handlers.json.KindsBuilder;

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

	public Attribute toAttributeOcci() {
		final Attribute attribute = OCCIFactory.eINSTANCE.createAttribute();
		attribute.setName(this.name);
		attribute.setDescription(this.description);

		if (this.isAnotherKind && StringToDataType.map.get(this.type) == null) {
			DataType type = OCCIFactory.eINSTANCE.createEObjectType();
			type.setName(this.type);
			type.setDocumentation(this.description);
			StringToDataType.map.put(this.type, type);
			KindsBuilder.extension.getTypes().add(type);
		}
		
		attribute.setType(StringToDataType.map.get(this.type));
		attribute.setMutable(true);
		attribute.setRequired(true);
		return attribute;
	}
}
