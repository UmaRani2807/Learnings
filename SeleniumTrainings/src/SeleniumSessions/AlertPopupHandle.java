package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert popupAlert = driver.switchTo().alert();
		String alertMessage = popupAlert.getText();
		System.out.println(alertMessage);
		
		if(alertMessage.equals("Please enter a valid user name"))
		{
			System.out.println("Correct message");
		}
		else {
			System.out.println("Incorrect message");
		}
		
		popupAlert.accept();
		//popupAlert.dismiss();
	}

}
