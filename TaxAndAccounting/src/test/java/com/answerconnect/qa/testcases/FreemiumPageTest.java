package com.answerconnect.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.answerconnect.qa.base.TestBase;
import com.answerconnect.qa.pages.FreemiumPage;
import com.answerconnect.qa.pages.IdpPage;

public class FreemiumPageTest extends TestBase {

	IdpPage idpPage;
	FreemiumPage freemiumPage;
	
	public FreemiumPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		freemiumPage = new FreemiumPage();
		}
		
		@Test(priority=1)
		public void freemiumPageTitleTest() {
			String title = freemiumPage.FreemiumPageTitle();
			Assert.assertEquals(title, "CCH AnswerConnect | Wolters Kluwer");
		}
		
		@Test(priority=2)
		public void wkLogoImageTest() {
			boolean flag = freemiumPage.validateWKLogo();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=3)
		public void loginTest() {
		idpPage = freemiumPage.LoginButtonClick();
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
