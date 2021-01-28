package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindow = it.next();
		System.out.println("The parent window id is : "+parentWindow);
		
		String childWindow = it.next();
		System.out.println("The child window id is: "+childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println("child window popup title is: "+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("parent window popup title is: "+driver.getTitle());
	}

}
