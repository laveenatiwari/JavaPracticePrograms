package seleniumpractice.core;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandlePractice2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id='qsb-keyword-sugg']")).sendKeys("testing");
		driver.findElement(By.xpath("//*[@id='qsb-location-sugg']")).sendKeys("pune");
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn']"));
		searchButton.click();
		String parentWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> it1 = s1.iterator();
		while(it1.hasNext()) {
			String childWindow = it1.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
									}
			driver.switchTo().window(parentWindow);
			driver.close();
		}
		}
} 
