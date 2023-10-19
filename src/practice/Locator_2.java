package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_2 
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver drivers = new ChromeDriver();
	drivers.get("https://www.facebook.com/");
	
	
	 WebElement locatorid = drivers.findElement(By.name("email"));
	locatorid.sendKeys("good");
	
	
	
	

	}

}
