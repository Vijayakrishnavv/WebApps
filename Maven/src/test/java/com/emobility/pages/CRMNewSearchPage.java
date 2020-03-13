package com.emobility.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.emobility.utility.Helper;

public class CRMNewSearchPage 
{
	Helper help;
	
	WebDriver driver;
	
	public CRMNewSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="tabBtnName")WebElement searchByName;
	@FindBy(id="tabBtnMobNum")WebElement searchByMobile;
	@FindBy(id="tabBtnEmail")WebElement searchByEmail;
	@FindBy(id="tabBtnStreet")WebElement searchByAddress;
	@FindBy(how = How.ID , using ="tabBtnNotes") WebElement searchByNotes;
	
	@FindBy(xpath="//input[@id='m_SearchBoxText']")WebElement searchCustomer;
	
	@FindBy(id="m_SearchBoxSearchBtn")WebElement searchBtn;
	
	@FindBy(xpath="//button[@id='m_btnAddNewCustomer']")WebElement addNewCustomerbtn;
	
	@FindBy(how=How.ID, using = "m_ButtonCreateNewCustomer") WebElement createCustomerBtn;
	
	@FindBy(how=How.ID, using = "m_ButtonCancelNewCustomer") WebElement cancelCustomerBtn;
	
	@FindBy(how=How.ID,using = "FirstName") WebElement firstName;
	
	@FindBy(id="LastName")WebElement lastName;
	@FindBy(id="City")WebElement city;
	@FindBy(id="Street")WebElement street ;
	@FindBy(id="House")WebElement houseNumber;
	@FindBy(id="Email")WebElement email;
	@FindBy(id="Phone")WebElement phoneNumber;
	@FindBy(id="Comments")WebElement comment ;
	
	
	public void createNewCustomer(String cfn, String cln, String ccity , String cstreet , double chn , String cemail , double cph , String ccmts)
	{
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		addNewCustomerbtn.click();
		
	

		firstName.sendKeys(cfn);
		
		
		
		lastName.sendKeys(cln);
		
		city.sendKeys(ccity);
		
		street.sendKeys(cstreet);
		
		houseNumber.sendKeys(String.valueOf(chn));
		
		email.sendKeys(cemail);
		
		phoneNumber.sendKeys(String.valueOf(cph));
		
		comment.sendKeys(ccmts);
		
		createCustomerBtn.click();
		
	}
	
	public void searchCustomer(String searchCRMCustomer)
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		searchCustomer.sendKeys(searchCRMCustomer);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		searchBtn.click();
	
		
	}
	

	
	
	
	
	
	
	

}
