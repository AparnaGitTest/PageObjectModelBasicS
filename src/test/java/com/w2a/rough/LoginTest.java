package com.w2a.rough;



import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;


public class LoginTest extends Page {
//Using EGIT plugin
	//tesr//
	//again
	//again
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage home=new HomePage();
		LoginPage lp=home.goToLogin();
		ZohoAppPage Zp=lp.doLogin("aparna_acharya1989@yahoo.in", "thistimefinal");
		Zp.gotoCRM();
		AccountPage account=Page.menu.gotoAccounts();
		CreateAccountPage cap=account.gotoCreateAccounts();
		cap.CreateAccount("Aparna");
		
		
		
		
	
	}

}
