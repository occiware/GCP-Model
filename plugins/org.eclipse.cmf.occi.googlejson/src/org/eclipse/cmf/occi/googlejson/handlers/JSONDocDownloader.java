package org.eclipse.cmf.occi.googlejson.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class JSONDocDownloader {

	// will read links from the csv file ("in" folder) to download JSON docs (into "out"" folder)
	public static void run() {
		try {
			System.out.println("Starting download...");
			File fileDir = new File("C:\\Users\\schallit\\workspace-gcp\\plugins\\org.eclipse.cmf.occi.googlejson\\in\\GCP-APIs.csv");
			BufferedReader buffer = new BufferedReader(
					   new InputStreamReader(
			                      new FileInputStream(fileDir), "UTF8"));
			String line = null;
			while((line = buffer.readLine()) != null) {
				String[] splitted = line.split(";");
				if (splitted.length > 5) {
					String urlToDownload = splitted[5];
					if (urlToDownload.startsWith("https://")) {
						System.out.println("Download " + urlToDownload);
						String apiName = splitted[1].trim().replaceAll("[^a-zA-Z0-9]+", "");
						URL website = new URL(urlToDownload);
						ReadableByteChannel rbc = Channels.newChannel(website.openStream());
						FileOutputStream fos = new FileOutputStream("C:\\Users\\schallit\\workspace-gcp\\plugins\\org.eclipse.cmf.occi.googlejson\\out\\" + apiName + ".json");
						fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
						fos.close();
					}
				}
			}
			buffer.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		System.out.println("Ending download...");
	}
	
}
