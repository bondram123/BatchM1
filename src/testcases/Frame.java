package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		
		
		driver.findElement(By.id("iFrame")).click();
		
		
		Thread.sleep(3000);
	    WebElement frame=driver.findElement(By.xpath("//iframe[@name='globalSqa']"));

	}

}
