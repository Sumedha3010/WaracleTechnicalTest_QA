package com.techtest.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrialTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://waracle:qaonly!@automation.waracle.net");
		System.out.println("link launched");
//		driver.switchTo().frame("nav_menu-2");
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

	}

}
