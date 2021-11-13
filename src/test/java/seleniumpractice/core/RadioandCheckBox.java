package seleniumpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioandCheckBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//selecting radio buttons
		WebElement radioEle1 = driver.findElement(By.xpath("//*[@id='vfb-7-1']"));
		radioEle1.click();
		WebElement radioEle2 = driver.findElement(By.xpath("//*[@id='vfb-7-2']"));
		radioEle2.click();
		
		//clicking radio buttons
		WebElement radioB1 = driver.findElement(By.id("vfb-6-0"));
		radioB1.click();
		//checking if click is performed in radio button
		if(radioB1.isSelected()) {
			System.out.println("radio button1 is selected");}
		else System.out.println("radio button1 is not selected");
		driver.close();
	}
		
}

