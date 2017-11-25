package com.apex.pom.ecommerce.test.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class EcommerceBaseTest {
	protected WebDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		  driver = new FirefoxDriver();
		  driver.get("http://ecommerce.saipratap.net/");
		  
	}

	@AfterMethod
	public void cleanUp() {
		  driver.close();
	}
	
}
