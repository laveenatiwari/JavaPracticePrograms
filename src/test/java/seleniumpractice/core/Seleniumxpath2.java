package seleniumpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumxpath2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/login.html";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//launches the url
		driver.get(url);
		//maximises the browser window
		driver.manage().window().maximize();
		WebElement emailId = driver.findElement(By.xpath("//*[@id='email']"));
		emailId.sendKeys("xyz@gmail.com");
		WebElement passwrd = driver.findElement(By.xpath("//*[@id='passwd']"));
		emailId.sendKeys("madeinheaven");
		System.out.println("text fields are set");
		
		//deleting values 
		emailId.clear();
		passwrd.clear();
		System.out.println(" text field cleared ");
		
		//finding the submit button
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		
		//using click method to submit form
		emailId.sendKeys("gloucesterabc@gmail.com");
		passwrd.sendKeys("madeinheaven");
		login.click();
		System.out.println("login done with cick");
		System.out.println("Login Done with Submit");
}
}
