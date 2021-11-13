package defaultpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

public class Login{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automationdriver\\chromedriver.exe");//setdriverpath
		WebDriver driver =new ChromeDriver(); //webdriver is implemented by remote webdriver which is parent class of chrome driver
//		driver.get("https://www.google.co.in/?gws_rd=ssl");
////		By locator = new By.ByCssSelector("input#lst-ib");//Object of By class
////		WebElement searchBox = driver.findElement(locator);
////		searchBox.sendKeys("Flipkart");
////		driver.close();
//		driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("flipkart");
		
		driver.manage().window().maximize();
		driver.get("https://duckduckgo.com/");

		WebElement searchTextBox= driver.findElement(By.id("search_form_input_homepage"));

		// retrieving html attribute value using getAttribute() method
		String typeValue=searchTextBox.getAttribute("type");
		System.out.println("Value of type attribute: "+typeValue);

		String autocompleteValue=searchTextBox.getAttribute("autocomplete");
		System.out.println("Value of autocomplete attribute: "+autocompleteValue);

		// Retrieving value of attribute which does not exist
		String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
		System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);
	}

}
