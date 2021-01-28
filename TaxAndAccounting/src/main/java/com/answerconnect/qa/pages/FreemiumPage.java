package com.answerconnect.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.answerconnect.qa.base.TestBase;

public class FreemiumPage extends TestBase {

	@FindBy(xpath="//a[contains(@class, 'wk-logo')]")
	WebElement wkLogo;
	
	@FindBy(xpath="//a[@contains(link(),'Login')]")
	WebElement LoginButton;
	
	
	//Initializing the page objects
		public FreemiumPage()
		{
			PageFactory.initElements(driver, this); //this refers to current class objects.
		}
		
	//Actions
		public String FreemiumPageTitle()
		{
			return driver.getTitle();
		}
		
		public boolean validateWKLogo()
		{
			return wkLogo.isDisplayed();
		}
		
		public IdpPage LoginButtonClick()
		{
			LoginButton.click();
			return new IdpPage();
		}
}
