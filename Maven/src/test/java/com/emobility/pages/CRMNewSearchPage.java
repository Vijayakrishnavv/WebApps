package com.emobility.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import com.emobility.utility.Helper;

public class CRMNewSearchPage {
	Helper help;

	WebDriver driver;

	public CRMNewSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "tabBtnName")
	WebElement searchByName;
	@FindBy(id = "tabBtnMobNum")
	WebElement searchByMobile;
	@FindBy(id = "tabBtnEmail")
	WebElement searchByEmail;
	@FindBy(id = "tabBtnStreet")
	WebElement searchByAddress;
	@FindBy(how = How.ID, using = "tabBtnNotes")
	WebElement searchByNotes;

	@FindBy(xpath = "//input[@id='m_SearchBoxText']")
	WebElement searchCustomer;

	@FindBy(id = "m_SearchBoxSearchBtn")
	WebElement searchBtn;

	@FindBy(xpath = "//button[@id='m_btnAddNewCustomer']")
	WebElement addNewCustomerbtn;

	@FindBy(how = How.ID, using = "m_ButtonCreateNewCustomer")
	WebElement createCustomerBtn;

	@FindBy(how = How.ID, using = "m_ButtonCancelNewCustomer")
	WebElement cancelCustomerBtn;

	@FindBy(how = How.ID, using = "FirstName")
	WebElement firstName;

	@FindBy(id = "LastName")
	WebElement lastName;
	@FindBy(id = "City")
	WebElement city;
	@FindBy(id = "Street")
	WebElement street;
	@FindBy(id = "House")
	WebElement houseNumber;
	@FindBy(id = "Email")
	WebElement email;
	@FindBy(id = "Phone")
	WebElement phoneNumber;
	@FindBy(id = "Comments")
	WebElement comment;
	@FindBy(id="CountryCode") 
	WebElement countrycode;

	// Verify Fields
	@FindBy(css = "span[id*='m_StatusCreateCustomer'][class*='SpanStatus']")
	WebElement firstNameVerify;
	@FindBy(css = "span[id*='m_StatusCreateCustomer'][class*='SpanStatus']")
	WebElement lastNameVerify;
	@FindBy(css = "span[id*='m_StatusCreateCustomer'][class*='SpanStatus']")
	WebElement cityVerify;
	@FindBy(css = "span[id*='m_StatusCreateCustomer'][class*='SpanStatus']")
	WebElement streetVerify;
	@FindBy(css = "span[id*='m_StatusCreateCustomer'][class*='SpanStatus']")
	WebElement houseNumberVerify;
	@FindBy(css = "span[id*='m_StatusCreateCustomer'][class*='SpanStatus']")
	WebElement mobileNumberVerify;

	@FindBy(id = "m_StatusCreateCustomer")
	WebElement checkCustomerStatus;
	
	@FindBy(css = "input[type='text'][id='CountryCode']")
	WebElement verifyCountryCode;
	

	public void createNewCustomer() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		createCustomerBtn.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String s1 = checkCustomerStatus.getText();

		System.out.println(s1);

		// Explicit wait for customer created text.

		WebDriverWait wait = new WebDriverWait(driver, 50);

		Boolean ele = wait.until(
				ExpectedConditions.textToBePresentInElement(checkCustomerStatus, "New customer created, please wait"));

		System.out.println(ele);

		System.out.println("Customer created");

	}

	public void searchCustomer(String searchCRMCustomer) {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		searchCustomer.sendKeys(searchCRMCustomer);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		searchBtn.click();

	}

	public void firstCustNameVerify(String customerfNameVerify, String customerFirstName) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		addNewCustomerbtn.click();

		createCustomerBtn.click();

		assertEquals(firstNameVerify.getText(), customerfNameVerify);

		firstName.sendKeys(customerFirstName);
	}

	public void lastCustNameVerify(String customerlNameVerify, String customerLastNaame) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		createCustomerBtn.click();

		assertEquals(lastNameVerify.getText(), customerlNameVerify);
		lastName.sendKeys(customerLastNaame);
	}

	public void CityNameVerify(String customerCityVerify, String customerCity) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		createCustomerBtn.click();

		assertEquals(cityVerify.getText(), customerCityVerify);
		city.sendKeys(customerCity);
	}

	public void StreetNameVerify(String customerStreetVerify, String customerStreet) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		createCustomerBtn.click();

		assertEquals(streetVerify.getText(), customerStreetVerify);
		street.sendKeys(customerStreet);
	}

	public void HouseNumber(String customerHouseNumberVerify, String customerHouseNumber) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		createCustomerBtn.click();

		assertEquals(houseNumberVerify.getText(), customerHouseNumberVerify);

		houseNumber.sendKeys(customerHouseNumber);

	}

	public void eMail_Notes(String customerEmail, String customerNotes) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		email.sendKeys(customerEmail);

		comment.sendKeys(customerNotes);

	}

	public void PhoneNumber(String customerPhoneNumberVerify, String customerPhoneNumber) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		createCustomerBtn.click();

		assertEquals(mobileNumberVerify.getText(), customerPhoneNumberVerify);
		phoneNumber.sendKeys(customerPhoneNumber);

	}
	
	public void countryCode(String verifyCountryCode , String customerContryCode) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		countrycode.click();
		
		countrycode.sendKeys(customerContryCode);
		
		
		
	}

}
