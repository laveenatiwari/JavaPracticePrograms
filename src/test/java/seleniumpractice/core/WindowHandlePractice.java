package seleniumpractice.core;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//*[contains(text(),'Click Here')]")).click();
		String MainWindow = driver.getWindowHandle();
		//to handle all newly opened windows
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> it = s1.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!MainWindow.equalsIgnoreCase(childWindow)) {
				//switching to child window
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("rajput123@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();   //closing the child window
			}
			driver.switchTo().window(MainWindow);
		}
		driver.close();   
	}
}
