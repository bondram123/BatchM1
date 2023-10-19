package testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexicut {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		
		String title = jse.executeScript("return document.title;").toString();
		String url = jse.executeScript("return document.URL;").toString();
		
		if(url.equals("https://www.instagram.com/accounts/login/"))
		{
			System.out.println("same url");
		}
		else
		{
			System.out.println("different title");
		}
		if(title.equals("Login.Instagram"))
		{
			System.out.println("same title");
		}
		else
		{
			System.out.println("different title");
		}
	}

}
