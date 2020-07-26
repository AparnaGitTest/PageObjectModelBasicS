package com.w2a.utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	private static ExtentReports extent;
	public static ExtentReports getInstance()
	{
		if(extent==null)
		{
			extent=new ExtentReports("C:\\Users\\Aparna\\eclipse-workspace\\LiveProjects\\PageObjectModelBasic\\target\\surefire-reports\\html\\extent.html",true,DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File("C:\\Users\\Aparna\\eclipse-workspace\\LiveProjects\\PageObjectModelBasic\\src\\test\\resources\\com\\w2a\\extentconfig\\ReportsConfig.xml"));
		}
		return extent;
	}
	
	

}
