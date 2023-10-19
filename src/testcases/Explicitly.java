package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.bcci.tv/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement INTERNATIONALlINK= driver.findElement(By.linkText("INTERNATIONAL"));
		INTERNATIONALlINK.click();
		
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//wait.until(ExpectedConditions.urlToBe("https://www.bcci.tv/international/fixtures"));
		//wait.until(ExpectedConditions.urlContains("/international/fixtures"));
		
		//wait.until(ExpectedConditions.titleIs("Cricket Schedule - International matches | BCCI"));
		wait.until(ExpectedConditions.titleContains("International matches | BCCI"));
		driver.findElement(By.linkText("DOMESTIC")).click();

	}

}
