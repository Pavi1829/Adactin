package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties pr;
	
	public ConfigurationReader() throws IOException {
			File f = new File("src\\test\\java\\com\\adactin\\property\\Adactin.property");
			FileInputStream fis  = new FileInputStream(f);
		    pr = new Properties();
			pr.load(fis);
	}
	public String getBrowserName() {
		String browsername = pr.getProperty("BrowserName");
		return browsername;

	}
	
	public String getUrl() {
		String Url = pr.getProperty("Url");
		return Url;

	}
	
	

}
