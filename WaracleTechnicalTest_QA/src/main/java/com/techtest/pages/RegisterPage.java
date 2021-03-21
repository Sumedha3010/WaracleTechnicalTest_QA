package com.techtest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.techtest.base.TestBase;

public class RegisterPage extends TestBase{
	
	//PageFactory

		@FindBy(xpath="//input[@id='user_login']")
		WebElement username;
		
		@FindBy(xpath="//input[@id='user_email']")
		WebElement emailAddress;
		
		@FindBy(xpath="//input[@id='user_password']")
		WebElement password;
		
		@FindBy(xpath="//input[@id='wp-submit']")
		WebElement registerBtn;
		
		
		//Initialisation
		public RegisterPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		
		public String validateRegisterPageTitle() {
			return driver.getTitle();
		}
		
		public void registerUser(String un, String email, String pwd) {
			username.sendKeys(un);
			emailAddress.sendKeys(email);
			password.sendKeys(pwd);
		}
		
		public LoginPage clickRegister() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView()", registerBtn);
			return new LoginPage();
		}

}
