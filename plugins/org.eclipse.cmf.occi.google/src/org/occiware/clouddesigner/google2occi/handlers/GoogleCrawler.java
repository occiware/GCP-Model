package org.occiware.clouddesigner.google2occi.handlers;

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

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		GCPCrawler cr = new GCPCrawler();
		try {
			Document doc = Jsoup
					.connect("https://cloud.google.com/deployment-manager/docs/configuration/supported-resource-types")
					.get();
			GCPCrawler.crawler(doc);
		} catch (IOException e) {
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
