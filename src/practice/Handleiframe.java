package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleiframe {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		
		
		//1st frame name
		
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		driver.switchTo().defaultContent();//go back to the main page.
		Thread.sleep(3000);
		
		//2nd iframe using webelwment
		
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[13]/a/span")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		
		//3rd iframe
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
		
		}

}
