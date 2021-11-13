package seleniumpractice.core;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioandCheckBox2 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/facebook.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//performing checkbox tests
		WebElement chkBox = driver.findElement(By.id("persist_box"));
		for(int i =0; i<2; i++) {
			chkBox.click();
			System.out.println("checkbox status in facebook.html page is - " + chkBox.isSelected());
		}
		driver.close();
	}
}
