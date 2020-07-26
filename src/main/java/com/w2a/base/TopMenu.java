package com.w2a.base;


import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountPage;



public class TopMenu {
	//Top menu is a Page??
	//Home page has a TopMenu
	//other pages has a TopMenu
	//Page has a TopMenu
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void gotoHome()
	{
		
	}
	
	public void gotoLeads()
	{
		
	}
	
	public void gotoContacts()
	{
		
	}
	
	public AccountPage gotoAccounts()
	{
		Page.click("createAccountTab_XPATH");
		return new AccountPage();
	}
	
	public void gotoDeals()
	{
		
	}
	public void signOut()
	{
		
	}

}
