package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\91808\\Downloads\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
    

	}

}
