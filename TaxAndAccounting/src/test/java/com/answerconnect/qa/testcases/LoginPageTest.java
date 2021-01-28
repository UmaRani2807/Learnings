package com.answerconnect.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.answerconnect.qa.base.TestBase;
import com.answerconnect.qa.pages.HomePage;
import com.answerconnect.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.loginPageTitle();
		Assert.assertEquals(title, "CCH AnswerConnect | Wolters Kluwer");
	}
	
	@Test(priority=2)
	public void wkLogoImageTest() {
		boolean flag = loginpage.validateWKLogo();
		Assert.assertTrue(flag);
	}
	
	/*@Test(priority=3)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}*/
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

// The super keyword refers to superclass (parent) objects. It is used to call superclass methods, 
// and to access the superclass constructor. The most common use of the super keyword is to 
// eliminate the confusion between superclasses and subclasses that have methods with the same name.