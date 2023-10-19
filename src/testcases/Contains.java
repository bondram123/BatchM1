package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		
		
		WebElement userTextField=driver.findElement(By.xpath("//input[contains(@aria-label,'Email address')]"));
		userTextField.sendKeys("ram");
		
		
		WebElement Forgettextfield=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		Forgettextfield.click();
		
		
		
	   Thread.sleep(5000);
	   WebElement loginbutton=driver.findElement(By.partialLinkText("Log"));
	   loginbutton.click();

	}

}
