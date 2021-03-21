package com.techtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.techtest.base.TestBase;

public class HomePage extends TestBase{

	//PageFactory

	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement registerLink;

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot password')]")
	WebElement forgotPassword;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logout;
	
	@FindBy(xpath = "//a[contains(text(),'Standard contact')]")
	WebElement StandardContact;
	
	@FindBy(xpath = "//a[contains(text(),'File Upload (PDF under 1mb)')]")
	WebElement fileUpload;

	@FindBy(xpath = "//a[contains(text(),'CTA’s – ID & No ID')]")
	WebElement generalContent;

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;

	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	WebElement aboutUs;
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	WebElement contactUs;
	
	@FindBy(xpath = "//img[contains(@class,'header-image is-logo-image')]")
	WebElement WLogo;
	
	
	//Initialisation
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateWaracleLogo() {
		return WLogo.isDisplayed();
		
	}
	
	public void register() {
		registerLink.click();
	}
	












}
