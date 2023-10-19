package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws Throwable 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("\"C:\\Users\\91808\\Downloads\\MultipleWindow (1)(1).html\"");
	
	
	
	driver.findElement(By.xpath("/html/body/form/input")).click();
	
	//Thread.sleep(10000);

	}

}
