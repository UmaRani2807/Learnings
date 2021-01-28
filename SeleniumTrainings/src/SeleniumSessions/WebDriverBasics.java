package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//1. Firefox browser: gecko driver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\M1023667\\Driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver(); //Launch Firefox driver
		
		//2. Chrome browser:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Launch Chrome driver
		driver.get("http://google.com"); //enter url
		
		String title = driver.getTitle();
		System.out.println("The title of the page is: " +title);
		
		//validation point
		if(title.equals("Google"))
		{
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit();
	}
}
