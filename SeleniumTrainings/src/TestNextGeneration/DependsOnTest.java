package TestNextGeneration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnTest {

WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test (dependsOnMethods = "CurrentUrl") //If the CurrentUrl method fails then this title method will be skipped. Title method will be executed
	public void title()						//only if CurrentUrl method gets pass.
	{
		String title = driver.getTitle();
		System.out.println("The title is "+title);
	}
	
	@Test
	public void CurrentUrl()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
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
