package com.answerconnect.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.answerconnect.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - Object Repository
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(@class,'forgot-password-link optional')]")
	WebElement forgotPasswordLink;
	
	@FindBy(xpath="//img[contains(@class, 'wk-logo-large')]")
	WebElement wkLogo;
	
	//Initializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this); //this refers to current class objects.
	}
	
	//Actions
	public String loginPageTitle()
	{
		return driver.getTitle();
	}

	public boolean validateWKLogo()
	{
		return wkLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pw)
	{
		username.sendKeys(un);
		pwd.sendKeys(pw);
		loginBtn.click();
		return new HomePage();
	}
}
