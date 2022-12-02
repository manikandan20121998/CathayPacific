package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReport {
	public static  void jvmrep(String jsons) {

File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
		
		Configuration con=new Configuration(loc, "Cathay");
		
		con.addClassifications("Environment", "QA");
		con.addClassifications("Sprint", "20th");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Version", "107");
		con.addClassifications("Browser", "Chrome");
		
		
		List<String> json=new LinkedList<String>();
		json.add(jsons);
		
		ReportBuilder rep=new ReportBuilder(json, con);
		rep.generateReports();
		
	}
	

}
