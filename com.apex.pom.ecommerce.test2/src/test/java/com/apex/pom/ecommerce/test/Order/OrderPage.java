package com.apex.pom.ecommerce.test.Order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apex.pom.ecommerce.test.core.EcommerceBasePage;


public class OrderPage extends EcommerceBasePage implements OrderConstants {
	@FindBy(xpath = OrderConstants.PRODUCTMENU_XPATH)
	WebElement prodctPageElemnt;
	@FindBy(xpath = OrderConstants.DELL_19R_XPATH)
	WebElement prodctSelectElemnt;
	@FindBy(xpath = OrderConstants.ADDCART_XPATH)
	WebElement addtoCartElemnt;
	@FindBy(className = OrderConstants.CHECKOUT_CLASSNAME)
	WebElement checkoutElemnt;
	@FindBy(xpath = OrderConstants.CONTINUE_XPATH)
	WebElement continueElemnt;
	@FindBy(xpath = OrderConstants.UPDATECONTINUE_XPATH)
	WebElement contiUpdateElemnt;
	@FindBy(xpath = OrderConstants.PAYMENT_CONTINUE_XPATH)
	WebElement contiPaymentElemnt;
	@FindBy(xpath = OrderConstants.CONTINUE_DISCOUNTCODE_XPATH)
	WebElement contiOnPayElemnt;
	@FindBy(name = OrderConstants.SECUREPAYMENT_NAME)
	WebElement securePaymentElemnt;
	@FindBy(xpath = OrderConstants.CONTI_PAGE3)
	WebElement contiPage3Elemnt;

	public OrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void orderProcess() throws Exception{
		prodctPageElemnt.click();
		Thread.sleep(2000);
		prodctSelectElemnt.click();
		Thread.sleep(2000);
		addtoCartElemnt.click();
		Thread.sleep(2000);
		checkoutElemnt.click();
		Thread.sleep(2000);
		continueElemnt.click();
		Thread.sleep(2000);
		contiUpdateElemnt.click();
		Thread.sleep(2000);
		contiPaymentElemnt.click();
		Thread.sleep(10000);
		contiPage3Elemnt.click();
		Thread.sleep(10000);
		contiOnPayElemnt.click();
		Thread.sleep(4000);
		securePaymentElemnt.click();
		Thread.sleep(2000);
	}
}
