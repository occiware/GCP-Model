package org.eclipse.cmf.occi.googlejson.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.googlejson.handlers.json.APIBuilder;
import org.eclipse.cmf.occi.googlejson.handlers.json.data.API;
import org.eclipse.cmf.occi.googlejson.handlers.json.data.StringToDataType;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class Main extends AbstractHandler {

	public static Kind RESOURCE_KIND;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//JSONDocDownloader.run();
		build();
		return null;
	}
	
	private static void build() {
		initResourceKindFromCoreExtension();
		File directory = new File("C:/Users/schallit/workspace-gcp/plugins/org.eclipse.cmf.occi.googlejson/out");
		List<API> apis = new ArrayList<>();
		for (File jsonFile : directory.listFiles()) {
			String nameOfFile = jsonFile.getName().substring(0, jsonFile.getName().length() - 5);
			apis.add(APIBuilder.buildAPI(jsonFile.getAbsolutePath(), nameOfFile));
		}
		for (API api : apis) {
			StringToDataType.initMap();
			api.toExtensionOcci();
		}
	}
	
	private static void initResourceKindFromCoreExtension() {
		Extension coreExtension = OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#");
		if (coreExtension == null) {
			throw new RuntimeException("Cannot load OCCI core extension!");
		}
		List<Kind> coreKinds = coreExtension.getKinds();
		for (Kind coreKind : coreKinds) {
			if (coreKind.getTerm().equals("resource")) {
				RESOURCE_KIND = coreKind;
			}
		}
	}
	
}
