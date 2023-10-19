package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tagnameandclassname {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		int imagessize = driver.findElements(By.className("kJjFO0")).size();
		System.out.println(imagessize);
		
		
		int Links = driver.findElements(By.tagName("a")).size();
		System.out.println(Links);
		
		driver.quit();

	}

}
