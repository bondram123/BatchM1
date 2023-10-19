package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
				
				
				driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
				
				WebElement testershub=driver.findElement(By.xpath("//*[@id=\"menu-item-2822\"]/a"));
				driver.switchTo().frame(testershub);
				
				
				
				
				//WebElement HighTatras=driver.findElement(By.id("//iframe[@data-src='../../demoSite/practice/droppable/photo-manager.html']"));
				//WebElement trash=driver.findElement(By.id("trash"));
				//Actions action1 =new Actions(driver);
				
				//action1.dragAndDrop(HighTatras, trash).build().perform();
				

	}

}
