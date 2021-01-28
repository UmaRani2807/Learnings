package TestNextGeneration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionsTest {

WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void title()						
	{
		String title = driver.getTitle();
		System.out.println("The title is "+title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void CurrentUrl()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public void GoogleLogoTest()
	{
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@Test
	public void add()
	{
		int a;
		int b=20,c=10;
		a =b+c;
		System.out.println(a);
		
	}
	
	@AfterTest
	public void last()
	{
		System.out.println("test completed");
		driver.close();
	}
}
