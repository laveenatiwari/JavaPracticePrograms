package seleniumpractice.core;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://Automationdriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement chk1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		chk1.click();
		Assert.assertTrue(chk1.isSelected());

		chk1.click();
		Assert.assertEquals(false, false, "Checkbox 1 is unselected");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(checkboxes.size());
		driver.close();
	}
}
