package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hyrhandlepopups {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("--headless");
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.findElement(By.id("alertBox")).click();
	
	driver.switchTo().alert().accept();
	System.out.println("test case is pass");

	}

}
