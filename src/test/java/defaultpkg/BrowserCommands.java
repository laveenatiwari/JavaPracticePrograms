package defaultpkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String[] args) {
		
		String driverExecutablePath ="C:\\Automationdriver\\chromedriver.exe";
		System.setProperty ("webdriver.chrome.driver",driverExecutablePath);
		WebDriver driver = new ChromeDriver();
		String url = "https://www.shop.demoqa.com/";
		driver.get(url); //launch the tool qa website
		String title =driver.getTitle();
		System.out.println("Title of the page is : " + title + " and length of title is " + title.length());
		String actualURL = driver.getCurrentUrl();
		if(actualURL.equals(url)) {
			System.out.println("verification sucesful , URL is correct URL");
		}else {
			System.out.println("verification failed- an incorrect URL is opened");
		}
		
		System.out.println("actual url is "+actualURL);
		System.out.println("expected url is " +url);
		
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		System.out.println("total length of the page is : " +pageSourceLength);
		driver.close();
	}

}
