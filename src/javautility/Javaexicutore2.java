package javautility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaexicutore2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		
		WebElement joinfree= driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
        
		Javaexicutore.flash(joinfree, driver);
	}

}
