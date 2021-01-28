package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver.chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.xxxx.com");
	WebElement user = driver.findElement(By.id("username"));
	user.sendKeys("Uma");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("xxxx");
	driver.findElement(By.linkText("Login")).click();
	
	}
}
