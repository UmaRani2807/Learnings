import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("http://www.amazon.in");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-link-accountList")).click();		
		//driver.close();
		//driver.quit();
	}

}
