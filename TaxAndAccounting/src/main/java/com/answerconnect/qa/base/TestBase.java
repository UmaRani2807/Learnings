package com.answerconnect.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.answerconnect.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try { //how to read properties file:
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\M1023667\\MyJavaTrainings\\TaxAndAccounting"
					+ "\\src\\main\\java\\com\\answerconnect\\qa\\configuration\\config.properties");
		prop.load(ip);
		//We can get the file location by right clicking on config.properties file and click on properties, 
		//we can get the file location. Just copy paste it.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\M1023667\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
}
