package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot1 {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.shoppersstack.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  
	  driver.findElement(By.id("loginBtn")).click();
	  
	   	}

}
