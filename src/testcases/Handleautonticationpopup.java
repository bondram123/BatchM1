package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handleautonticationpopup {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");	
		
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0,25000).perform();
		
		Thread.sleep(5000);
	
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[3]/article/div[1]/div[1]/div[2]/a[6]")).click();
		
		driver.switchTo().alert().accept();
		
		Runtime.getRuntime().exec("C:\\Users\\91808\\OneDrive\\Documents\\Documents\\AUT.exe");
			

	}

}
