package seleniumpractice.core;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AlertPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automationdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		try {
			//handling alert 1
			driver.findElement(By.xpath("//*[@id='alertButton']")).click();
			//we create a reference variable for Alert class and references it to the alert
			Alert alert = driver.switchTo().alert();
			//this command accepts the alert
			alert.accept(); 
			
			
			//handling prompt alert
			WebElement promptButton = driver.findElement(By.xpath("//*[@id='promtButton']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", promptButton);
			Alert alertprompt = driver.switchTo().alert();
			String alertText = alertprompt.getText();
			System.out.println(" text for prompt alert is -" +alertText );
			alertprompt.sendKeys("user:");
			alertprompt.accept();
			
			
			////handling confirmation alert
			WebElement confirmButton = driver.findElement(By.xpath("//*[@id='confirmButton']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click()",confirmButton);
			Alert confirmAlert = driver.switchTo().alert();
			String confirmAlertMessage = confirmAlert.getText();
			System.out.println(" text for prompt alert is - " +confirmAlertMessage);
			confirmAlert.accept();
			
			
			//handling alert associated with some wait
			driver.findElement(By.xpath("//*[@id='timerAlertButton']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.alertIsPresent());
			Alert timerAlert = driver.switchTo().alert();
			timerAlert.accept();
			System.out.println("timer alert accepted");
				
		}
		catch(Exception e) {
			 System.out.println(e);  
		}
		finally {
			System.out.println("try catch executed");
		}
		driver.close();
	}
}

