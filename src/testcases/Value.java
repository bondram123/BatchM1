package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Value {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		
		WebElement emailTextField=driver.findElement(By.name("username"));
		
		
		String email="Ramanjineya";
		jse.executeScript("arguments[0].value=arguments[1];",emailTextField,email);
			

	}

}
