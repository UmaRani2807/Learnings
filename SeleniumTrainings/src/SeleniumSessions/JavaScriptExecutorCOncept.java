package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorCOncept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("http://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("uma.pathakoty@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("Gnaneshwari40");
			WebElement login = driver.findElement(By.xpath("//button[contains(@type, 'submit')]"));
			flash(login,driver); //highlight the element
			login.click();
					
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0; i<100; i++) {
			changeColor("rgb(255,0,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor= '"+color+"'", element); 
		try { 						//executeScript -- to execute javascript code
			Thread.sleep(20);
		}
		catch(InterruptedException e) {
			
		}
	}
}
