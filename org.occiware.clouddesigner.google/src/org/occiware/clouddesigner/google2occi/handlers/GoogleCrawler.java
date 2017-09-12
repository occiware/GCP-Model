package org.occiware.clouddesigner.google2occi.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.occiware.clouddesigner.google2occi.handlers.json.KindsBuilder;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class GoogleCrawler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		KindsBuilder.build();
		
//		GCPCrawler cr = new GCPCrawler();
//		try {
//			Document doc = Jsoup
//					.connect("https://cloud.google.com/deployment-manager/docs/configuration/supported-resource-types")
//					.get();
//			GCPCrawler.crawler(doc);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//		cr.saveOCCIResource();
//		} catch (Exception e) {
//					e.printStackTrace();
//	}
		return null;
	}

}
