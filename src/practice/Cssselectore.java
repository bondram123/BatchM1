package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectore {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("ramallu9999@gmail.com");
		
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("Ram@1234");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#loginbutton")).click();
		
		
		
		
	

	}

}
