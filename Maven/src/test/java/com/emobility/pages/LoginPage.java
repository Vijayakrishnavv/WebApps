package com.emobility.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "InputUsername")
	WebElement userName;

	@FindBy(css = "input[name*='InputPassword']")
	WebElement pass;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//input[@id='ButtonForgotPassword']")
	WebElement forgotPwd;

	@FindBy(css = "input[value*='Switch User']")
	WebElement switchUser;

	public void loginToCRM(String uname, String password) {

		userName.sendKeys(uname);
		pass.sendKeys(password);
		loginBtn.click();

	}

}
