package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
public static Properties ps;

public ConfigurationReader() throws IOException {
File f = new File("src\\test\\java\\com\\adactin\\helper\\Adactin.property");
FileInputStream fis =new FileInputStream(f);
 ps = new Properties();
ps.load(fis);
}


public String getBrowserName() {
	
	String browsername = ps.getProperty("BrowserName");
	//System.out.println(browsername);
	return browsername;
	
}

public String getUrl() {
	//Properties ps = null;
	String url= ps.getProperty("Url");
	//System.out.println(url);
	return url;
	
}



}
