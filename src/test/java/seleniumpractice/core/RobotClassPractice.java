package seleniumpractice.core;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassPractice {

	WebDriver driver;
	@Before
	
	public void setUp() {
	driver = new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	driver.manage().window().maximize();
	}
	
	@Test
	public void testWindowAlert() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("identifierId")).sendKeys("TestSelenium1607@gmail.com");
		
	}
}
