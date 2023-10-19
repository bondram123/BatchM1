package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1 {



	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	WebElement locatoreid = driver.findElement(By.id("email"));
	locatoreid.sendKeys("Shannu");
	


	
	
		
	}

}
