package seleniumpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 WebElement link4home = driver.findElement(By.xpath("//*[contains(text(),'Home')]"));
		 WebElement backgrnd_Color = driver.findElement(By.xpath(("//tr[@class='mouseOut']")));
		 Actions builder = new Actions(driver);
		 Action mouseOverHome = builder.moveToElement(link4home).build();
		 String bg_Color = backgrnd_Color.getCssValue("background-color");
		 System.out.println("before hover :" + bg_Color);
		 mouseOverHome.perform();
		 bg_Color =  backgrnd_Color.getCssValue("background-color");
		 System.out.println("after  hover :" + bg_Color);
		 driver.close();
		 
	}
}
