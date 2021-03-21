package com.techtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.techtest.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath = "//input[@id='user_login']")
	WebElement loginUser;
	
	@FindBy(xpath = "//input[@id='user_pass']")
	WebElement loginPassword;
	
	@FindBy(xpath = "//input[@id='wp-submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//input[@id='rememberme']")
	WebElement rememberMe;
	
	
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	
	
	

	
}
