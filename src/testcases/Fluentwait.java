package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.bcci.tv/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement internationalLink=driver.findElement(By.linkText("INTERNATIONAL"));
		internationalLink.click();
		
		
		FluentWait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(10))
	    .pollingEvery(Duration.ofSeconds(1)).withMessage("the element still not developed")
	    .ignoring(NoSuchElementException.class);
		
		
		driver.findElement(By.linkText("DOMESTIC")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[normalize-space(text())='Domestic Live Matches']"))));
		System.out.println("the element is clickable");
		driver.findElement(By.xpath("//a[normalize-space(text())='Domestic live Matches']")).click();
		
	 }

}
