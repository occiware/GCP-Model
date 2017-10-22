package org.eclipse.cmf.occi.google.handlers;

import java.io.File;
import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	private static final String LOCAL_URL = "snapshot-GCP/";

	private static final String BASE_URL = "https://cloud.google.com/";

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect(BASE_URL + "deployment-manager/docs/configuration/supported-resource-types")
					.get();
			String html = doc.html();
			Element table = doc.getElementsByTag("table").get(0);
			Elements as = table.getElementsByTag("a");
			for (int i = 0 ; i < as.size() ; i++) {
				Element a = as.get(i);
				String currentURL = a.attr("href");
				String newURL = currentURL.replace(BASE_URL, LOCAL_URL);
				html = html.replace(currentURL, newURL + ".html");
				readAndWriteDocumentHTML(currentURL);
			}
			FileWriter printer = new FileWriter(LOCAL_URL + doc.title().replace("|", "") +".html");
			printer.write(html);
			printer.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static void readAndWriteDocumentHTML(String URL) {
		Document doc = null;
		try {
			while (doc == null) {
				try {
					doc = Jsoup.connect(URL).get();
				} catch (Exception e) {
					doc = null;
				}
			}
			String newURL = URL.replace(BASE_URL, LOCAL_URL);
			if (!new File(newURL).exists()) {
				String [] newURLs = newURL.split("/");
				String pathToDirectories = newURL.substring(0, newURL.length() - newURLs[newURLs.length -1].length());
				new File(pathToDirectories).mkdirs();
			}
			FileWriter printer = new FileWriter(newURL + ".html", false);
			printer.write(doc.html());
			printer.close();
			System.out.println(URL + " saved");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
