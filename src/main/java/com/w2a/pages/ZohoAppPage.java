package com.w2a.pages;

import org.openqa.selenium.By;


import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	
	
	public void gotoChat()
	{
		
	}
	public CRMHomePage gotoCRM()
	{
		click("crmLink_XPATH");
		return new CRMHomePage();
	}
	public void gotoSalesIQ()
	{
		click("salesIQLink_XPATH");
		driver.findElement(By.xpath("")).click();
		
	}

}
