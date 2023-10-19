package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Imaxblockpopus {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
    driver.get("https://www.imax.com/theatres/pvr-imax");

	}

}
