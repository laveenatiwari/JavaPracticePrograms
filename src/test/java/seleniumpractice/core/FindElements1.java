package seleniumpractice.core;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.className("dropdown"));
		System.out.println(elements.size());
		for(int i=0; i<elements.size();i++) {
			System.out.println(elements.get(i).getText());
		}
		driver.close();
	}
}
