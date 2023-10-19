package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.className("_30XB9F")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("pen");
		
		List<WebElement> autosegetion = driver.findElements(By.xpath("//input[@name='q']/../../..//ul/li/div"));
		System.out.println(autosegetion .size()+" is the size of autosuggetion ");
		int count=0;
		for(WebElement ele:autosegetion )
		{
			count++;
			String s1=ele.getAttribute("data-observerid-35c4a3b5-c699-495a-88c5-ee9f92983403");
			String s2=s1.substring(8);
			System.out.println(ele.getAttribute(s2 +" is the "+count+" autoseggetion"));
		}

	}

}
