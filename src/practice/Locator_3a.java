package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_3a 
{

	public static void main(String[] args) throws Throwable
	{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    
    
    
    driver.manage().window().maximize();
    
    //tagname and id
    //WebElement tagnameandid = driver.findElement(By.cssSelector("input#email"));
     //WebElement tagnameandid = driver.findElement(By.cssSelector("#email"));
    
    //tagnameandid.sendKeys("pavan kalyan");
    
    //tagname and class
    //WebElement tagnameandclass = driver.findElement(By.cssSelector("input.inputtext"));
    WebElement tagnameandclass = driver.findElement(By.cssSelector(".inputtext"));
    tagnameandclass.sendKeys("gabbarsingh");
    
    WebElement tagnameandattr = driver.findElement(By.cssSelector("input[type=password]"));
    tagnameandattr.sendKeys("KGF");
    
    //WebElement tagnameclassandatt = driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]"));
    //tagnameclassandatt.sendKeys("kantara");
    
    
    Thread.sleep(10000);
    driver.quit();
    
	

	
		
	}

}
