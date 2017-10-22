package org.eclipse.cmf.occi.googlejson.handlers.json;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.googlejson.handlers.json.data.API;
import org.eclipse.cmf.occi.googlejson.handlers.json.data.ActionData;
import org.eclipse.cmf.occi.googlejson.handlers.json.data.AttributeData;
import org.eclipse.cmf.occi.googlejson.handlers.json.data.KindData;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KindsBuilder {

	public static Extension extension;
	public static Kind resourceKind;
	public static Resource resource;

	public static void build() {
			init();
			File directory = new File("C:/Users/schallit/workspace-gcp/plugins/org.eclipse.cmf.occi.googlejson/out");
			List<API> apis = new ArrayList<>();
			for (File jsonFile : directory.listFiles()) {
				apis.add(buildAPI(jsonFile.getAbsolutePath()));
			}
			for (API api : apis) {
				for (KindData kind : api.kinds) {
					for (AttributeData attribute : kind.attributes) {
						if (attribute.isAnotherKind) {
							
						}
					}
					extension.getKinds().add(kind.toKindOcci());
				}
			}
			System.out.println("Saving...");
			try {
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static API buildAPI(String pathToJSON) {
		try {
			JsonObject object = new JsonParser().parse(new FileReader(pathToJSON)).getAsJsonObject();
			API api = new API(object.get("name").getAsString(), object.get("description").getAsString(),
					object.get("title").getAsString(), object.get("id").getAsString());
			JsonObject schemas = object.get("schemas").getAsJsonObject();
			for (Entry<String, JsonElement> entry : schemas.entrySet()) {
				api.kinds.add(buildKind(entry.getValue().getAsJsonObject()));
			}
			readAction(object, api);
			return api;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private static final Map<String, String> packageToKindName = new HashMap<>();
	
	static {
		packageToKindName.put("App", "Application");
	}
	
	public static void readAction(JsonObject object, API api) {
		if (object.get("resources") != null) {
			JsonObject resources = object.get("resources").getAsJsonObject();
			for (Entry<String, JsonElement> resource : resources.entrySet()) {
				JsonObject entries = resource.getValue().getAsJsonObject();
				for (Entry<String, JsonElement> entry : entries.entrySet()) {
					if (entry.getKey().equals("resources")) {
						readAction(entries, api);
					} else if (entry.getKey().equals("methods")) {
						JsonObject methods = entry.getValue().getAsJsonObject();
						for (Entry<String, JsonElement> method : methods.entrySet()) {
							JsonObject mapMethod = method.getValue().getAsJsonObject();
							String nameKind = resource.getKey();
							nameKind = nameKind.substring(0, nameKind.length()-1);
							nameKind = nameKind.substring(0, 1).toUpperCase() + nameKind.substring(1);
							if (packageToKindName.containsKey(nameKind)) {
								nameKind = packageToKindName.get(nameKind); 
							}
							KindData kind = api.getKindDataPerName(nameKind);
							if (kind == null) {
								throw new RuntimeException("["+api.id+"]Could not find " + nameKind + " from path in action : " + method.getKey());
							}
							kind.actions.add(new ActionData(method.getKey(), mapMethod.get("description").getAsString()));
						}
					}
				}
			}
		}
	}

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

	public static void init() {
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI.createURI("file:/C:/Users/schallit/runtime-EclipseApplication31072017/json_model/GCP2.occie");
		resource = resSet.createResource(modelURI);

		extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription("Mon extension GCP");
		extension.setScheme("http://gcp/json/occi#");
		extension.setName("GCP");
		resource.getContents().add(extension);

		Extension coreExtension = OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#");
		if (coreExtension == null) {
			throw new RuntimeException("Cannot load OCCI core extension!");
		}
		System.out.println(coreExtension.getTypes());
		List<Kind> coreKinds = coreExtension.getKinds();
		for (Kind coreKind : coreKinds) {
			if (coreKind.getTerm().equals("resource")) {
				resourceKind = coreKind;
			}
		}
	}

}
