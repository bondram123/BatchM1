package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestionsforgoogledropdown {

	public static void main(String[] args) throws Throwable 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	
	Thread.sleep(3000);
	
	List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"ERWdKc\"]/div[1]/span"));
	System.out.println("list of auto suggestions is:"+ list.size());
	
	for(WebElement listitems:list)
	{
		if(listitems.getText().contains(" interview questions"))
		{
			listitems.click();
		}
	}
	

	}

}
