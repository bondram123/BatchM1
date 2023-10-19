package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        
       driver.findElement(By.id("email")).sendKeys("Ram");
       
       Thread.sleep(3000);
       
       driver.findElement(By.id("email")).clear();
       
            
       driver.findElement(By.linkText("Forgotten password?")).click();
      
       driver.close();
       
       
       }
}
