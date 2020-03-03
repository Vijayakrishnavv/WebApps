package com.emobility.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.emobility.utility.BrowserFactory;
import com.emobility.utility.ConfigDataProvider;
import com.emobility.utility.ExcelDataProvider;
import com.emobility.utility.Helper;

public class BaseClass 
{
	
	public WebDriver driver ;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite()
	{
		
		excel = new ExcelDataProvider();
		
		config = new ConfigDataProvider();
		
	}
	
	
	@BeforeClass
	public void setUp()
	{
		driver = BrowserFactory.startApplication(driver, config.getBroswer() , config.getStagingURL());
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			Helper.captureScreenshot(driver);
		}
		
		
	}
	
	
	

}
