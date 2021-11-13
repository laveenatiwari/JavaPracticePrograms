package seleniumpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//input details-
		driver.findElement(By.name("firstName")).sendKeys("Hazel");;
		driver.findElement(By.name("lastName")).sendKeys("Busby");
		driver.findElement(By.name("phone")).sendKeys("9576904593");
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("xyz@gmail.com");

		Select sel = new Select(driver.findElement(By.name("country")));
		sel.selectByVisibleText("ASHMORE AND CARTIER ISLANDS");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("user");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("username");
		driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("username");
		
		driver.findElement(By.name("submit")).submit();
	}
}
