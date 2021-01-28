package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.in");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java");
		
		//customized xpath
		driver.findElement(By.xpath("//input[contains(@id, 'twotabsearchtextbox')]")).sendKeys("Java");
		
		//dynamic input:id
		//id = test_123
		//By.id("test_123")
		//starts with
		//id = test_456
		//id = test_789
		//id = test_test_677_test
		//ends with
		//id = 123_test_t
		//id = 456_test_t
		//id = 789_test_t
				
		//driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Java");
		
		//for links: custom xpath
		//all the links will be represented by <a> html tag.
		driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")).click();
		}

}
