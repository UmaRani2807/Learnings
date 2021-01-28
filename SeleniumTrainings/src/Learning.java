import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("http://www.yahoo.co.in");
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
