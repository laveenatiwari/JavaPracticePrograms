package seleniumpractice.core;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSibling {
	@Test
	public void testSiblingandParentinXpath() {
		WebDriver driver;
		String driverPath = "C:\\Automationdriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		List<WebElement> siblings = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent"
				+ "::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
			for(WebElement ele:siblings) {
				System.out.println(ele.getText());
			}
		
	}

}
