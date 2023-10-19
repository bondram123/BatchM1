package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws Throwable
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	
	WebElement ebookslink = driver.findElement(By.xpath("//a[contains(text(),'Free Ebooks')]"));
	
	Actions action=new Actions(driver);
	action.moveToElement(ebookslink).perform();
	
	
	WebElement cheatsheetlink= driver.findElement(By.xpath("//*[@id=\"menu-item-6898\"]/a"));
	action.contextClick(cheatsheetlink).perform();
	
	
	action.scrollByAmount(0,1000).perform();
	
	//Thread.sleep(3000);
	//action.moveByOffset(1280,76).perform();
	

	}

}
