import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Payment {


		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		WebElement drop = driver.findElement(By.linkText("dropdown"));
		Select dd = new Select(drop);
		dd.selectByValue("xxx");
		
		driver.findElement(By.id("radio")).click();
		driver.findElement(By.id("checkbox")).click();
		
		WebElement Logo = driver.findElement(By.id("Logo"));
		
	
		
		driver.findElement(By.id("time")).isDisplayed();
		driver.findElement(By.id("date")).isDisplayed();
		
		driver.findElement(By.linkText("Payment")).click();
		System.out.println("Payment successful");
		

}
