package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgetpassword {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		
		
		WebElement Reletivetextfield=driver.findElement(By.xpath("//a[@class='_6ltj']"));
		
		Reletivetextfield.click();
		

	}

}
