package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		/*driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
				
		Actions actionDrop = new Actions(driver);
		actionDrop.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();*/
		
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions action =new Actions(driver);
		action.clickAndHold(driver.findElement(By.linkText(" BANK "))).moveToElement(driver.findElement(By.id("bank"))).release().build().perform();
		
	}
}
