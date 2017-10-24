package org.eclipse.cmf.occi.googlejson.handlers.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.cmf.occi.googlejson.handlers.json.data.API;
import org.eclipse.cmf.occi.googlejson.handlers.json.data.ActionData;
import org.eclipse.cmf.occi.googlejson.handlers.json.data.KindData;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ActionReader {
	
	private static final String pathToMappingFile = "C:\\Users\\schallit\\workspace-gcp\\plugins\\org.eclipse.cmf.occi.googlejson\\mapping.csv"; 
	
	private static final Map<String, String> packageToKindName = initMapping();
	
	public static void readAction(JsonObject object, API api, String parent) {
		List<String> unmappedPackages = new ArrayList<>();
		if (object.get("resources") != null) {
			JsonObject resources = object.get("resources").getAsJsonObject();
			for (Entry<String, JsonElement> resource : resources.entrySet()) {
				JsonObject entries = resource.getValue().getAsJsonObject();
				for (Entry<String, JsonElement> entry : entries.entrySet()) {
					if (entry.getKey().equals("resources")) {
						readAction(entries, api,
								parent.isEmpty() ? resource.getKey() : parent + "." + resource.getKey());
					} else if (entry.getKey().equals("methods")) {
						JsonObject methods = entry.getValue().getAsJsonObject();
						for (Entry<String, JsonElement> method : methods.entrySet()) {
							JsonObject mapMethod = method.getValue().getAsJsonObject();
							String nameKind = resource.getKey();
							if (packageToKindName.containsKey(nameKind)) {
								nameKind = packageToKindName.get(nameKind); 
							} else {
								nameKind = nameKind.substring(0, nameKind.length()-1);
								nameKind = nameKind.substring(0, 1).toUpperCase() + nameKind.substring(1);
							}
							KindData kind = api.getKindDataPerName(nameKind);
							if (kind != null) {
								kind.actions.add(new ActionData(method.getKey(), mapMethod.get("description").getAsString()));
							} else if (!unmappedPackages.contains(parent.isEmpty() ? resource.getKey() : parent + "." + resource.getKey())) {
								unmappedPackages.add(parent.isEmpty() ? resource.getKey() : parent + "." + resource.getKey());
								//throw new RuntimeException("["+api.id+"]Could not find " + nameKind + " from path in action : " + method.getKey());
							}
						}
					}
				}
			}
		}
		//writeUnmappedPackages(unmappedPackages);
	}
	
	private static Map<String, String> initMapping() {
		Map<String, String> mapping = new HashMap<>();
		try {
			File fileDir = new File(pathToMappingFile);
			BufferedReader buffer = new BufferedReader(
					   new InputStreamReader(
			                      new FileInputStream(fileDir), "UTF8"));
			String line = null;
			while((line = buffer.readLine()) != null) {
				String[] splitted = line.split(";");
				if (splitted.length > 1 && !splitted[1].isEmpty()) {
					mapping.put(splitted[0], splitted[1]);
				}
			}
			buffer.close();
			return mapping;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private static void writeUnmappedPackages(List<String> unmappedPackages) {
		try {
			FileWriter writer = new FileWriter(new File(pathToMappingFile), true);
			String nl = System.getProperty("line.separator");
			for (String unmappedPackage : unmappedPackages) {
				writer.write(unmappedPackage + ";" + nl);
			}
			writer.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
