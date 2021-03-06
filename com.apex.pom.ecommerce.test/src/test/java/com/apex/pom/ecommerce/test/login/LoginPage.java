package com.apex.pom.ecommerce.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.pom.ecommerce.test.Inbox.InboxPage;
import com.apex.pom.ecommerce.test.core.EcommerceBasePage;

public class LoginPage extends EcommerceBasePage implements LoginConstants {
	@FindBy(xpath = LoginConstants.ACCOUNT_LOGIN_PAGE_LINK)
	WebElement loginPageElmnt;
	@FindBy(name = LoginConstants.EMAIL_BOX_NAME)
	WebElement emailIdElmnt;
	@FindBy(name = LoginConstants.PASSWORD_BOX_NAME)
	WebElement passwordElemnt;
	@FindBy(xpath = LoginConstants.LOGIN_BUTTON_XPATH)
	WebElement loginBtnElemnt;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public InboxPage clickOnLogin(String emailId, String password) throws Exception {
		
		//Thread.sleep(4000);
		loginPageElmnt.click();
		//Thread.sleep(4000);
		emailIdElmnt.sendKeys(emailId);
		//Thread.sleep(4000);
		passwordElemnt.sendKeys(password);
		//Thread.sleep(4000);
		loginBtnElemnt.click();
		//Thread.sleep(4000);
		return new InboxPage(driver);
		
	}

}
