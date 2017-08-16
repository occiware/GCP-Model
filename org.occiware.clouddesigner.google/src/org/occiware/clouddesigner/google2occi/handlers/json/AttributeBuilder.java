package org.occiware.clouddesigner.google2occi.handlers.json;

import org.occiware.clouddesigner.google2occi.handlers.json.data.AttributeData;
import org.occiware.clouddesigner.google2occi.handlers.json.data.EnumField;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Map.Entry;

public class AttributeBuilder {

	public static AttributeData buildAttribute(JsonObject jsonProperty, String property) {
		final AttributeData currentAttribute = new AttributeData(property,
				jsonProperty.get("description") != null ? jsonProperty.get("description").getAsString() : "",
				(jsonProperty.get("type") != null ? jsonProperty.get("type").getAsString()
						: jsonProperty.get("$ref").getAsString()));

		if (jsonProperty.get("$ref") != null) {
			currentAttribute.isAnotherKind = true;
		}

		if (jsonProperty.get("format") != null) {
			currentAttribute.format = jsonProperty.get("format").getAsString();
		}

		if (jsonProperty.get("enumDescriptions") != null && jsonProperty.get("enum") != null) {
			currentAttribute.enums = new ArrayList<>();
			JsonArray enumDescriptions = jsonProperty.get("enumDescriptions").getAsJsonArray();
			JsonArray enums = jsonProperty.get("enum").getAsJsonArray();

			for (int i = 0; i < enumDescriptions.size(); i++) {
				currentAttribute.enums
						.add(new EnumField(enums.get(i).getAsString(), enumDescriptions.get(i).getAsString()));
			}
		}
		
		if (jsonProperty.get("items") != null) {
			JsonObject items = jsonProperty.get("items").getAsJsonObject();
			currentAttribute.typeOfArray = (items.get("type") != null ? items.get("type").getAsString()
					: items.get("$ref").getAsString());
		}

		if (jsonProperty.get("additionalProperties") != null) {
			JsonObject additionalProperties = jsonProperty.get("additionalProperties").getAsJsonObject();
			StringBuilder additionalPropertiesString = new StringBuilder();
			for (Entry<String, JsonElement> entry : additionalProperties.entrySet()) {
				String key = entry.getKey();
				if ("enum".equals(key) && currentAttribute.enums == null) {
					currentAttribute.enums = new ArrayList<>();
					JsonArray enums = additionalProperties.get(key).getAsJsonArray();
					for (int i = 0; i < enums.size(); i++) {
						currentAttribute.enums.add(new EnumField(enums.get(i).getAsString(), ""));
					}
				} else if ("type".equals(key)) {
					currentAttribute.typeOfArray = additionalProperties.get(key).getAsString(); // TODO
					currentAttribute.type = "map"; // TODO
				} else if ("items".equals(key)) {
					// skip
				} else {
					additionalPropertiesString.append(key).append(":")
							.append(additionalProperties.get(key).getAsString()).append(" ");
				}
			}
			currentAttribute.additionalPropertiesString = additionalPropertiesString.toString();
		}
		return currentAttribute;
	}

}
