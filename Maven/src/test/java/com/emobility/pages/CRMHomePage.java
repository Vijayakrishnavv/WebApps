package com.emobility.pages;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CRMHomePage {

	WebDriver driver;
	int count = 0;

	public CRMHomePage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(css = "span[class*='SpanPortalHome center']")
	WebElement homePageHeading;

	@FindBy(xpath = "//a[@class='ButtonLinkMenu']")
	List<WebElement> modulesCount;

	@FindBy(xpath = "//a[@class='ButtonLinkMenu']")
	WebElement modulesNames;

	@FindBy(how = How.CSS, using = "a[class*='DivBox'][href*='Admin.aspx']")
	WebElement adminModule;

	@FindBy(xpath = "//a[@class='DivBox'][@href='CRMNew.aspx']")
	WebElement crmModule;

	public void countModulesForUser() {

		// Identify the number of Link on webpage and assign into Webelement List

		List<WebElement> links = modulesCount;

		// Count the total Link list on Web Page

		int count = modulesCount.size();

		// Print the total count of links on webpage

		System.out.println("Total Number of link count on webpage = " + count);

		
		
		/* this is to get the module name
		 * Select dropdown = new Select(modulesNames); List<WebElement> dd =
		 * dropdown.getOptions(); System.out.println(dd.size()); // Loop to print one by
		 * one for (int j = 0; j < dd.size(); j++) {
		 * System.out.println(dd.get(j).getText());
		 */

	

	/* this is to get al the webElement list
	 * List<WebElement> allElements = driver.findElements(By.xpath("//*"));
	 * //Identify all the elements on web page
	 * 
	 * int elementsCount = allElements.size(); //Count the total all element on web
	 * page
	 * 
	 * System.out.println("Total Number of All Element on webpage = " +
	 * elementsCount); //Print the total count of all element on webpage
	 */

	}

	public void navigateToModule() {

		crmModule.click();
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void homeVerify() {

	}

}
