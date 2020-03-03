package com.emobility.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {
		File src = new File("./Config/Config.properties");

		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				System.out.println("File not found " + e.getMessage());
			}

		} catch (FileNotFoundException e) {

			System.out.println("File not found " + e.getMessage());
		}

	}

	public String getStagingURL() {
		return pro.getProperty("testURL");
	}

	public String getBroswer() {
		return pro.getProperty("broswer");
	}

	public String getDataFromConfig(String keySearch)

	{
		return pro.getProperty(keySearch);
	}

}
