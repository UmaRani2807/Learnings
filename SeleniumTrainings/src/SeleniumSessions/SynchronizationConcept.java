package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//implicitly wait -- is always applied globally -- is available for all the web elements
		
		driver.get("http://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
			//	email.sendKeys("uma.pathakoty@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
			//	password.sendKeys("Gnaneshwari40");
		driver.findElement(By.linkText("Log In")).click();
		
		sendKeys(driver, email, 10, "uma.pathakoty@gmail.com");
		sendKeys(driver, password, 5, "Gnaneshwari40");
		
		}
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
}
