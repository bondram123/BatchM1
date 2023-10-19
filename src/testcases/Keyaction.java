package testcases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyaction {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
				
				
				driver.get("https://www.facebook.com/");
				WebElement forgetpss=driver.findElement(By.linkText("Forgotten password?"));
				
				
				String CurrentWindowsBeforeClicking=driver.getWindowHandle();
				Actions action=new Actions(driver);
	            action.keyDown(Keys.CONTROL).click(forgetpss).keyUp(Keys.CONTROL).perform();
	            
	            
	            Set<String> allwindowsAfterClicking=driver.getWindowHandles();
	            allwindowsAfterClicking.remove(CurrentWindowsBeforeClicking);
	            
	            
	            for(String ref: allwindowsAfterClicking) {
	            	driver.switchTo().window(ref);
	            }
	            driver.findElement(By.id("did_submit")).click();
	            
	            Thread.sleep(3000);
	            
	            driver.findElement(By.linkText("Cancel")).click();
	            
	}

}
