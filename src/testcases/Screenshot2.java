package testcases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		  
		  //Thread.sleep(3000);
		   
		  //driver.manage().window().maximize();
		  		  	   
		  
		  TakesScreenshot ts=  (TakesScreenshot)driver;
		  		  
		  File tempFile=ts.getScreenshotAs(OutputType.FILE);
		  		  
		  String time = LocalDateTime.now().toString().replace(';','-').replace('.','-');
		  System.out.println(time);
		 
		  File parmanent = new File("./Screenshot/Login"+time+".png");
		  FileHandler.copy(tempFile,parmanent);
		   		 
    }
	
}
