package org.eclipse.cmf.occi.googlejson.handlers.json;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.cmf.occi.googlejson.handlers.json.data.API;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class APIBuilder {
	
	public static API buildAPI(String pathToJSON) {
		try {
			JsonObject object = new JsonParser().parse(new FileReader(pathToJSON)).getAsJsonObject();
			API api = new API(object.get("name").getAsString(),
					object.get("description").getAsString(),
					object.get("title").getAsString(), 
					object.get("id").getAsString()
			);
			JsonObject schemas = object.get("schemas").getAsJsonObject();
			for (Entry<String, JsonElement> entry : schemas.entrySet()) {
				api.kinds.add(KindsBuilder.buildKind(entry.getValue().getAsJsonObject()));
			}
			ActionReader.readAction(object, api, "");
			return api;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
