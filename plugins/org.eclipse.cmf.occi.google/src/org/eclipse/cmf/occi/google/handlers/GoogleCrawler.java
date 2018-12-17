package org.eclipse.cmf.occi.google.handlers;

import java.io.File;
import java.io.IOException;

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
	public static final String PATH_TO_ROOT_HTML = 
			"";
	private static final String ROOT_HTML_FILE = 
			"Supported Resource Types    Cloud Deployment Manager Documentation    Google Cloud Platform.html";
	
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
		try {
			cr.saveOCCIResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
