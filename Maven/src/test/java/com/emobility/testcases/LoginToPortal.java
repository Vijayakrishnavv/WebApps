package com.emobility.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.emobility.pages.BaseClass;
import com.emobility.pages.CRMHomePage;
import com.emobility.pages.CRMNewSearchPage;
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
		
		homepage.countModulesForUser();
		
		homepage.navigateToModule();
		
	}
	
	@Test(priority = 3)
	public void search_Add_CustomerPage()
	{
		
		CRMNewSearchPage searchAddPage = PageFactory.initElements(driver, CRMNewSearchPage.class );
		
		searchAddPage.searchCustomer(excel.getStringData("SearchAddCustomer",0,0));
		
		
		
	}
	
 	@Test(priority = 2)
	public void createNewCustomer()
	{
		
		CRMNewSearchPage createCustomer = PageFactory.initElements(driver, CRMNewSearchPage.class);
		
		createCustomer.createNewCustomer(excel.getStringData("NewCustomer", 0, 0), excel.getStringData("NewCustomer", 0, 1) , excel.getStringData("NewCustomer", 0, 2), excel.getStringData("NewCustomer", 0, 3) , excel.getNumericData("NewCustomer", 0, 4) , excel.getStringData("NewCustomer", 0, 5) , excel.getNumericData("NewCustomer", 0, 6) ,excel.getStringData("NewCustomer", 0, 7) );
	}
	

}
