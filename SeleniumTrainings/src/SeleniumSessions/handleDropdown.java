package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&src=fpctx&pspid=97684142&.done=https%3A%2F%2Fin.yahoo.com&specId=yidReg&done=https%3A%2F%2Fin.yahoo.com");
		
		Select selectBirthMonth = new Select(driver.findElement(By.id("usernamereg-month")));
		selectBirthMonth.selectByValue("7");
		//selectBirthMonth.selectByIndex(6);
		//selectBirthMonth.selectByVisibleText("April");
	}

}
