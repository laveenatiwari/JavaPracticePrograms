package seleniumpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingImage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/identify?ctx=recover");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[contains(@class,'fb_logo')]")).click();
		String pageTitle = driver.getTitle();
	System.out.println("title of page is " +pageTitle );
	if(driver.getTitle().equals("Facebook – log in or sign up")) {
		System.out.println("we are back to Facebook – log in or sign up page after clicking facebook image on recover page");
	}
	else {
		System.out.println("login/home page not loaded");
	}
	driver.close();
	

}
}
