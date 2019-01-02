package org.eclipse.cmf.occi.google.handlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.google.handlers.syntacticparsingtree.LinkDefinition;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class GoogleCrawler extends AbstractHandler {

	// TODO must be configured
	public static final String PATH_TO_ROOT_PROJECT = "C:/Users/schallit/workspace-gcp/";
	
	public static final String OUTPUT_PATH = PATH_TO_ROOT_PROJECT + "/GCP-model/plugins/org.eclipse.cmf.occi.google/models/GCP.occie";
	
	public static final String SCHEME = "file:" + OUTPUT_PATH + "#";
	
	public static final String PATH_TO_ROOT_HTML = PATH_TO_ROOT_PROJECT + "GCP-model/plugins/org.eclipse.cmf.occi.google/snapshot-GCP/";
	
	private static final String ROOT_HTML_FILE = 
			"Supported Resource Types    Cloud Deployment Manager Documentation    Google Cloud Platform.html";
	
	public static Map<LinkDefinition, Link> linkDefinitionPerLink = new HashMap<>();
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		GCPCrawler cr = new GCPCrawler();
		try {
			
			Document doc = Jsoup
					.parse(new File(PATH_TO_ROOT_HTML + ROOT_HTML_FILE), "UTF-8");
					//.get();
			GCPCrawler.crawler(doc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// now that we have generate all the kind specification, we can define target and source for Link
		
		for (Kind k : GCPCrawler.extension.getKinds()) {
			System.out.println(k.getName());
		}
		
		rejected.forEach(System.out::println);
		
		linkDefinitionPerLink.keySet()
			.forEach(key -> 
				setTarget(key, linkDefinitionPerLink.get(key))
			);
		try {
			cr.saveOCCIResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<String> rejected = new ArrayList<>();
	
	public static void setTarget(LinkDefinition definition, Link link) {

	}

}
