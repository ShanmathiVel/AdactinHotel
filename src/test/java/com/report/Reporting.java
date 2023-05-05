package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass{
	/**
	 * 
	 * @param jsonFile
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see  Method used to provide destination path and details to generate JVM reports
	 */
	public static void generatesJvmReport(String jsonFile) throws FileNotFoundException, IOException {
		File file = new File (System.getProperty("user.dir")+getPropertyFileValue("Jvmpath"));
		
	Configuration con = new Configuration(file,"Adactin Hotel");
	con.addClassifications("Browser", "Chrome");
	con.addClassifications("BrowserVersion", "105");
	con.addClassifications("os", "WIN10");
	con.addClassifications("Testing", "reg");
	List<String> jsonfiles = new ArrayList<String>();
	jsonfiles.add(jsonFile);
	
	ReportBuilder bulider = new ReportBuilder(jsonfiles,con);
	
	bulider.generateReports();
	

}
}
