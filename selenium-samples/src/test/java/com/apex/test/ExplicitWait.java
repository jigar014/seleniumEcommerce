package com.apex.test;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
/*This Method will accept parameter of driver, locator, and timeout just fill it and have explicit 
 * wait for element to be clickable, you can change the inner methods or exception class as per 
 * your requirement. copy this method customize it and use it.
 * */

public class ExplicitWait {
@Test
public void testExplicitWait()
{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	WebElement locator = driver.findElement(By.xpath(".//*[@id='hptl']/a[2]")); 
	//locator.click();
	ExplicitWait.explicitWait(driver, locator, 20);



}


	public static void explicitWait(WebDriver driver, WebElement locator, int timeout) 
	{
	 new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
	 .until(ExpectedConditions.elementToBeClickable(locator));
	 
	 locator.click();
	}
}
