package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&src=fpctx&pspid=97684142&.done=https%3A%2F%2Fin.yahoo.com&specId=yidReg&done=https%3A%2F%2Fin.yahoo.com");
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Uma");
		
		driver.findElement(By.name("lastName")).sendKeys("Rani");
		
		//driver.findElement(By.cssSelector("#usernamereg-yid")).sendKeys("umarani866");
		
		driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")).sendKeys("password@123");
		driver.findElement(By.name("phone")).sendKeys("1234567890");

		Select selectBirthMonth = new Select(driver.findElement(By.id("usernamereg-month")));
		selectBirthMonth.selectByValue("7");
		
		driver.findElement(By.id("usernamereg-day")).sendKeys("27");
		
		driver.findElement(By.cssSelector("#usernamereg-year")).sendKeys("1990");
		
		driver.findElement(By.name("freeformGender")).sendKeys("Female");
		
		//driver.findElement(By.linkText("Continue")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		
	}

}
