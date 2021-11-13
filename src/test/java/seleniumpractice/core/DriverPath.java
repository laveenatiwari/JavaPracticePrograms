package seleniumpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverPath {

	static WebDriver driver;
	
	public static void setChromeDriverProperty() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		

//	public static WebDriver setup(String browser) throws Exception {
//		if (browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//		else {
//			throw new Exception("browser is not correct");
//		}
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		return driver;
	}
}

