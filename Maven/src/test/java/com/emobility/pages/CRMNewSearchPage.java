package com.emobility.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CRMNewSearchPage 
{
	
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
	
	@FindBy(id="m_SearchBoxText")WebElement searchCustomer;
	
	@FindBy(id="m_SearchBoxSearchBtn")WebElement searchBtn;
	
	@FindBy(id="m_btnAddNewCustomer")WebElement addNewCustomerbtn;
	
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
	
	
	public void createNewCustomer()
	{
		
	}
	
	public void searchCustomer(String searchCRMCustomer)
	{
		searchCustomer.sendKeys(searchCRMCustomer);
		searchBtn.click();
		
		
		
	}
	
	
	
	
	
	
	
	

}
