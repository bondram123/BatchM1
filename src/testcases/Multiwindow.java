package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindow {
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("C:\\Users\\91808\\Downloads\\MultipleWindow (1)(1).html");
		       
		    
		    driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		   
		    Thread.sleep(5000);
		    
		    
		    Set<String> allwindowId=driver.getWindowHandles();
		    
		    
		    for(String Wind:allwindowId)
		    {
		       Thread.sleep(10000);
		       System.out.println(Wind);
				//System.out.println(driver.switchTo().window(winId).getCurrentUrl());
		       if(driver.switchTo().window(Wind).getCurrentUrl().equals("https://www.giallozafferano.com/"))
		       {
		    	   driver.manage().window().maximize();
		       }
		       else
		       {
		    	   driver.quit();
		       }
		    	
		    }
		    

	}

}
