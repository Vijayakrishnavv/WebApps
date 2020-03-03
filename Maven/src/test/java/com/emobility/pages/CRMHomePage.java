package com.emobility.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CRMHomePage 
{
	
	WebDriver driver ;
	String count = null;
	
	
	public CRMHomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	@FindBy(css = "span[class*='SpanPortalHome center']") WebElement homePageHeading;
	
	@FindBy(css="a[class*='DivBox']") WebElement modulesCount;
	
	@FindBy(how=How.CSS, using = "a[class*='DivBox'][href*='Admin.aspx']") WebElement adminModule;


	
	public void countModulesForUser()
	{
		
		System.out.println("Number of modules are " +count);
		
	}
	
	public void navigateToModule()
	{
		
		adminModule.click();
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void homeVerify()
	{
		
	}
	

}
