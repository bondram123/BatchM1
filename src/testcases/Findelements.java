package testcases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Findelements
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://facebook.com/");
	
	
	System.out.println("By findElement");
	WebElement firstelement=driver.findElement(By.tagName("input"));
	System.out.println(firstelement.getAttribute("name"));
	
	
	//WebElement secoundelement=driver.findElement(By.id("value of id Attribute"));
	//System.out.println(secoundelement.getAttribute("id"));
	
	
	System.out.println("By findElement");
	List<WebElement> Allelements=driver.findElements(By.tagName("input"));
	for (WebElement ref:Allelements)
	{
		String namevalue=ref.getAttribute("name");
		System.out.println(namevalue);
		
	}
	driver.close();

	}

}
