package com.w2a.pages.crm.accounts;



import com.w2a.base.Page;

public class AccountPage extends Page {
	

	
	public CreateAccountPage gotoCreateAccounts()
	{
		//driver.switchTo().frame(nameOrId)
		click("createAccountlink_XPATH");
		return new CreateAccountPage();
	}
	public void gotoImportAccounts()
	{
		
	}
}
