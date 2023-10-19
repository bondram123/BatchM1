package testcases;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Currenttime {

	public static void main(String[] args) throws Throwable
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	Thread.sleep(3000);
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	
	  File tempFile=ts.getScreenshotAs(OutputType.FILE);
		  
	  String time = LocalDateTime.now().toString().replace(':','-');
	  System.out.println(time);
	 
	  File parmanent = new File("./Screenshot/Login"+time+".png");
	  FileHandler.copy(tempFile,parmanent);
	   		 

	}

}
