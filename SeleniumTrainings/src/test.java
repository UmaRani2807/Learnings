import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1023667\\Driver\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		mydriver.navigate().to("http://www.google.co.in");
		System.out.println(mydriver.getTitle());
		System.out.println(mydriver.getCurrentUrl());
		mydriver.get("http://www.yahoo.in");
		mydriver.navigate().back();
		mydriver.navigate().forward();
		
	}

}
