package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {

	static WebDriver driver;
	static String nodeUrl;

	public static void main(String[] args) {

		try {
			nodeUrl = "http://192.168.43.96:18991/wd/hub";
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(new URL(nodeUrl), capability);
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WINDOWS);
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			driver.get("http://www.amazon.in");
			driver.findElement(By.linkText("Today's Deals")).click();
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}

	}

}
