package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clickable {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.bcci.tv/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement internationalLink=driver.findElement(By.linkText("INTERNATIONAL"));
	internationalLink.click();
	
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleContains("International matches | BCCI"));
	driver.findElement(By.linkText("DOMESTIC")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[normalize-space(text())='Domestic Live Matches']"))));
	System.out.println("the element is clickable");
	driver.findElement(By.xpath("//a[normalize-space(text())='Domestic Live Matches']")).click();
	}

}

