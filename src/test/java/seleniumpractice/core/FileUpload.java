package seleniumpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automationdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement uploadButton = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		//clicking of browse button not provided .webdriver automatically enters file path 
		//onto the file selection text boxs
		uploadButton.sendKeys("C:\\Users\\laveena\\Desktop\\sampleUpload.txt");
		driver.findElement(By.xpath("//*[@id='terms']")).click();
		driver.findElement(By.xpath("//*[@id='submitbutton']")).click();
		driver.close();	
		}
		catch(Exception e){
			System.out.println("Something went wrong. ");
		}	finally {
			System.out.println(" try catch is executed ");
		}
	}
}
