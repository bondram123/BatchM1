package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploadpdf {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://kitchen.applitools.com/ingredients/file-picker");	
		
		/*Actions actions = new Actions(driver);
		actions.scrollByAmount(0,600).perform();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();*/
		
		
		driver.findElement(By.id("photo-upload")).sendKeys("C:\\Users\\91808\\OneDrive\\Pictures\\Acer");

	}

}
