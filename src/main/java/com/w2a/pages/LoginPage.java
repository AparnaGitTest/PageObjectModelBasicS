package com.w2a.pages;

import com.w2a.base.Page;

public class LoginPage extends Page {
	
	
	public ZohoAppPage doLogin(String username, String password)
	{
		type("email_XPATH",username);
		click("next_XPATH");
		type("password_XPATH",password);
		click("signbtn_XPATH");
		return new ZohoAppPage();
	}
	public void goToSalesandMarketing(String username, String password)
	{
		
	}
	public void goToFinance()
	{
		
	}
}
