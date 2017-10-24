package org.eclipse.cmf.occi.googlejson.handlers.json;

import org.eclipse.cmf.occi.googlejson.handlers.json.data.KindData;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map.Entry;

public class KindsBuilder {

	public static KindData buildKind(JsonObject jsonKind) {
		final String id = jsonKind.get("id").getAsString();
		final String description = jsonKind.get("description") == null ? "" : jsonKind.get("description").getAsString();
		final String type = jsonKind.get("type").getAsString();
		final KindData currentKind = new KindData(id, description, type);
		if (jsonKind.get("properties") != null) {
			JsonObject properties = jsonKind.get("properties").getAsJsonObject();
			for (Entry<String, JsonElement> entry : properties.entrySet()) {
				currentKind.attributes
						.add(AttributeBuilder.buildAttribute(entry.getValue().getAsJsonObject(), entry.getKey()));
			}
		}
		return currentKind;
	}

}
