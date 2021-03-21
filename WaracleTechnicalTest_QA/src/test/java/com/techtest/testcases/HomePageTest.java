package com.techtest.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.techtest.base.TestBase;
import com.techtest.pages.HomePage;
import com.techtest.pages.RegisterPage;

public class HomePageTest extends TestBase{
	
HomePage homePage;
RegisterPage registerPage;
	
	public HomePageTest() throws IOException{
		super();   
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();		
	}
	
	@Test(priority=1)

	public void homePageTitleTest() {
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "QA Automation Testing - Just another WordPress site");
	}
	
	@Test(priority=2)
	public void waracleLogoTest() {
		boolean flag = homePage.validateWaracleLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void clickOnRegisterLinkTest() {
		homePage.register();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
