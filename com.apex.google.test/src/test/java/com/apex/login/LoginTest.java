package com.apex.login;
import com.apex.Inbox.InboxPage;
import com.apex.test.core.ApexBaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ApexBaseTest implements LoginConstants {
	@Test
	public void testSucessfulLogin() throws Exception {
		LoginPage page = new LoginPage(driver);
		InboxPage inboxpage = page.clickOnLogin("apex123testyou@gmail.com", "1212");
		Assert.assertEquals(inboxpage.getUrl(), "https//google.com");
		Assert.assertEquals(inboxpage.getTitle(), "googleInbox");

	}
	// @Test
	// public void testBlankLogin() throws Exception
	// {LoginPage page = new LoginPage(driver);
	// page.clickOnLogin("", "");
	// }

}