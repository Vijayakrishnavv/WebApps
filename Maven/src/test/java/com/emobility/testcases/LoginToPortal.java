package com.emobility.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.emobility.pages.BaseClass;
import com.emobility.pages.CRMHomePage;
import com.emobility.pages.LoginPage;
import com.emobility.utility.Helper;

public class LoginToPortal extends BaseClass {

	@Test(priority = 0)
	public void appLogin() 
	{

		LoginPage lpage = PageFactory.initElements(driver, LoginPage.class);
		
		lpage.loginToCRM(excel.getStringData("Login",0,0), excel.getStringData("Login",0,1));
		
	}
	
	
	@Test(priority = 1)
	
	public void homePaage()
	{
		
		CRMHomePage homepage = PageFactory.initElements(driver, CRMHomePage.class);
		
		homepage.navigateToModule();
		
		
		
	}

}