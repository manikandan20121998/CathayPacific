package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Configuration_Reader {
public static Properties p;

public Configuration_Reader() throws IOException {
	File loc=new File("C:\\Users\\MANI MADDY\\Desktop\\github project\\CathayPacific\\src\\main\\java\\org\\utility\\cathay.properties");
	FileInputStream f=new FileInputStream(loc);
	 p=new Properties();
	p.load(f);
	
	}
	public String geturl() {

	String property = p.getProperty("url");
	return property;
	}
}



