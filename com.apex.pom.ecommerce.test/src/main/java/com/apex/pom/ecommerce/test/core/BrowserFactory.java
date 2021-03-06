package com.apex.pom.ecommerce.test.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserFactory {

	public static WebDriver setup(String browser) throws Exception {
		WebDriver driver = null;
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("firefox")) {
		 return driver = new FirefoxDriver();
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver", "C:\\cDownload\\Selenium_browser_drivers\\Crossbrowser\\chromedriver.exe");
			// create chrome instance
			return driver = new ChromeDriver();
		}
		// Check if parameter passed as 'Edge'
		else if (browser.equalsIgnoreCase("Edge")) {
			// set path to Edge.exe
			System.setProperty("webdriver.edge.driver", "C:\\cDownload\\Crossbrowser\\MicrosoftWebDriver.exe");
			// create Edge instance
			return driver = new EdgeDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
