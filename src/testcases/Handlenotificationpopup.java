package testcases;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlenotificationpopup {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.puma.com/in/en?utm_source=GGL-SEA&utm_medium=BS&utm_aud=OTH&utm_obj=OLC&utm_campaign=BS_GGL_IN_BS_GGL_SEA_TXT_Brand-Exact_agency_1000067495857508873&gclid=Cj0KCQjwxuCnBhDLARIsAB-cq1ookkK7cto3ZSIzl-DNdTGpOqMQXJnsbmDcBdhud4lyfWxmWj7fd3QaAigAEALw_wcB");
       
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		/*Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);*/
		
		
		
		
		
	}

}
