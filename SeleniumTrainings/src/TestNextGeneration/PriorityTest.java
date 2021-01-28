package TestNextGeneration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTest {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test (priority=2)
	public void title()
	{
		String title = driver.getTitle();
		System.out.println("The title is "+title);
	}
	
	@Test (priority=1)
	public void CurrentUrl()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
