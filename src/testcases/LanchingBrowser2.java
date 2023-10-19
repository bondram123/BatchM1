package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchingBrowser2 
{

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\91808\\Downloads\\MultipleWindow (1).html");
		
		
		String WindowIdOfCurrentWindow=driver.getWindowHandle();
		System.out.println("Current Window id before clicking"+WindowIdOfCurrentWindow);
		
		
		Set<String> AllWindowsIds=driver.getWindowHandles();
		System.out.println("All the Window ids before clicking");
		for(String ref:AllWindowsIds)
		{
			System.out.println(ref);
		}
		driver.findElement(By.tagName("input")).click();
		
		
		Thread.sleep(10000);
		String AfterclickWindowId=driver.getWindowHandle();
		System.out.println("current Window id after clicking  "+AfterclickWindowId);
		
		
		
		
		Set<String> ALlWindowAfterclicking= driver.getWindowHandles();
		System.out.println("all windows after clicking   "+ALlWindowAfterclicking);
		for(String ref1:ALlWindowAfterclicking)
		{
			System.out.println(ref1);
		}
		
		

	}

}
