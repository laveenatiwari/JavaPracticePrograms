package seleniumpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickPractice {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Instantiate actions class
		Actions actions = new Actions(driver);
		//retrieve the web element to perform right click
		WebElement ele = driver.findElement(By.xpath("//*[@id='rightClickBtn']")) ;
		actions.contextClick(ele).perform();
		WebElement rightClkMsg = driver.findElement(By.xpath("//*[text(),'You have done a right click']"));
		if (rightClkMsg.isDisplayed()) {
			System.out.println("right click action got performed through context click");
				}
		else {
			System.out.println("context click didnt work through actions class");
		}
		WebElement ele2 = driver.findElement(By.xpath("//*[@id='doubleClickBtn']")) ;
		actions.contextClick(ele2).perform();
		WebElement doubleClkMsg2 = driver.findElement(By.xpath("//*[text(),'Double Click Me']"));
		if (doubleClkMsg2.isDisplayed()) {
			System.out.println("double performed through context click");
				}
		else {
			System.out.println("double didnt got performed  through actions class");
		}
		
		
	}
	

}
