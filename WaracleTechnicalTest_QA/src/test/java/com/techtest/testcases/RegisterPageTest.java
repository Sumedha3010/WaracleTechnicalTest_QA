package com.techtest.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.techtest.base.TestBase;
import com.techtest.pages.HomePage;
import com.techtest.pages.LoginPage;
import com.techtest.pages.RegisterPage;

public class RegisterPageTest extends TestBase{
	
	RegisterPage registerPage;
	LoginPage loginPage;
	HomePage homePage;
	
	public RegisterPageTest() throws IOException{
		super();   
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		registerPage = new RegisterPage();		
	}
	
	@Test
	public void registerUserTest() {
		homePage.register();
		registerPage.registerUser(prop.getProperty("username"), prop.getProperty("emailaddress"), prop.getProperty("password"));
		loginPage = registerPage.clickRegister();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
