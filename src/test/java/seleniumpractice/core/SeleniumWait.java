package seleniumpractice.core;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/ajax.html";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//launches the url
		driver.get(url);
		//maximises the browser window
		driver.manage().window().maximize();
		String pageTitle =driver.getTitle();
		System.out.println("title of page is -" +pageTitle);
		String actualURL = driver.getCurrentUrl();
		if(actualURL.equals(url)) {
			System.out.println("verification sucessfull. the correct url is opened");
		}else
			{System.out.println("verification failed. the url launched is different than the one expecetd to launch");
		System.out.println("actual URL launched is - "+ actualURL);
		System.out.println("while the URL expected to launch is - " + url );}
		//click on no button  
		driver.findElement(By.xpath("//input[@id='no']"));
		//click on checkbutton
		driver.findElement(By.xpath("//input[@id='buttoncheck']"));
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("number of elements : " +elements.size());
		for(int i=0; i<elements.size();i++) {
			System.out.println("Radio button text : " + elements.get(i).getAttribute("value"));
		}
		driver.close();
	}
}
