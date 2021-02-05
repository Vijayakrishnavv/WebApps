package com.emobility.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.emobility.pages.BaseClass;
import com.emobility.pages.CRMHomePage;
import com.emobility.pages.CRMNewSearchPage;
import com.emobility.pages.LoginPage;
import com.emobility.utility.Helper;

public class LoginToPortal extends BaseClass {

	@Test(priority = 0)
	public void appLogin() {

		LoginPage lpage = PageFactory.initElements(driver, LoginPage.class);

		lpage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		Assert.assertEquals(driver.getTitle(), "Portal's Home");

	}
	
	
	@Test(priority = 1, dependsOnMethods = "appLogin")

	public void homePaage() {

		CRMHomePage homepage = PageFactory.initElements(driver, CRMHomePage.class);

		homepage.countModulesForUser();

		homepage.navigateToModule();

	}

	@Test(priority = 3)
	public void createNewCustomer() {

	}

	@Test(priority = 2)
	public void verifyFirstName() {
		CRMNewSearchPage verifyFname = PageFactory.initElements(driver, CRMNewSearchPage.class);

		verifyFname.firstCustNameVerify(excel.getStringData("NewCustomer", 0, 8),
				excel.getStringData("NewCustomer", 0, 0));

	}

	@Test(priority = 3)
	public void verifyLastName() {
		CRMNewSearchPage verifyLname = PageFactory.initElements(driver, CRMNewSearchPage.class);

		verifyLname.lastCustNameVerify(excel.getStringData("NewCustomer", 1, 8),
				excel.getStringData("NewCustomer", 0, 1));
	}

	@Test(priority = 4)
	public void verifyCitytName() {
		CRMNewSearchPage verifyCity = PageFactory.initElements(driver, CRMNewSearchPage.class);

		verifyCity.CityNameVerify(excel.getStringData("NewCustomer", 2, 8), excel.getStringData("NewCustomer", 0, 2));
	}

	@Test(priority = 5)
	public void verifyStreettName() {
		CRMNewSearchPage verifyStreet = PageFactory.initElements(driver, CRMNewSearchPage.class);

		verifyStreet.StreetNameVerify(excel.getStringData("NewCustomer", 3, 8),
				excel.getStringData("NewCustomer", 0, 3));
	}

	@Test(priority = 6)
	public void verifyHouseNumber() {
		CRMNewSearchPage verifyHouseNumber = PageFactory.initElements(driver, CRMNewSearchPage.class);

		verifyHouseNumber.HouseNumber(excel.getStringData("NewCustomer", 4, 8),
				excel.getStringData("NewCustomer", 0, 4));
	}

	@Test(priority = 8)
	public void verifyPhoneNumber() {
		CRMNewSearchPage verifyPhoneNumber = PageFactory.initElements(driver, CRMNewSearchPage.class);

		verifyPhoneNumber.PhoneNumber(excel.getStringData("NewCustomer", 5, 8),
				excel.getStringData("NewCustomer", 0, 6));
	}

	@Test(priority = 7)
	public void eMailNotes() {
		CRMNewSearchPage emailNotes = PageFactory.initElements(driver, CRMNewSearchPage.class);

		emailNotes.eMail_Notes(excel.getStringData("NewCustomer", 0, 5), excel.getStringData("NewCustomer", 0, 7));
	}

	// click on create customer button
	@Test(priority = 9)
	public void addNewCustomer() {
		CRMNewSearchPage addCustomer = PageFactory.initElements(driver, CRMNewSearchPage.class);

		addCustomer.createNewCustomer();

	}
	
	@Test(priority = 10)
	public void addCountryCode() {
		CRMNewSearchPage addCountryCode = PageFactory.initElements(driver, CRMNewSearchPage.class);

		addCountryCode.countryCode(excel.getStringData("NewCustomer", 6, 8),
				excel.getStringData("NewCustomer", 0, 9));
		
	}
	

	// Search customer
	@Test(priority = 11)
	public void search_Add_CustomerPage() {

		CRMNewSearchPage searchAddPage = PageFactory.initElements(driver, CRMNewSearchPage.class);

		searchAddPage.searchCustomer(excel.getStringData("SearchCustomer", 0, 0));

	}

}
