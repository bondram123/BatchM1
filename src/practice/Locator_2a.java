package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_2a {

	public static void main(String[] args) throws Throwable 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=6171200456135868736&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062037&hvtargid=kwd-10573980&hydadcr=14453_2154373");
	
	
	driver.manage().window().maximize();
	
	
	
	//locators id and name
	WebElement locatorid = driver.findElement(By.id("twotabsearchtextbox"));
	locatorid.sendKeys("T-shirt");
	
	
	WebElement locatorname = driver.findElement(By.id("nav-search-submit-button"));
	locatorname.click();
	
	
	
	Thread.sleep(5000);
	
	//WebElement locatorlinktext = driver.findElement(By.linkText("2714 Men's Super Combed Cotton Rich Solid Round Neck Half Sleeve"));
	//locatorlinktext.click();
	WebElement locatorepartiallinktext = driver.findElement(By.partialLinkText("Half Sleeve"));
	locatorepartiallinktext.click();
	
	//locatorlinktext.click();
	
	
	Thread.sleep(5000);
	
	driver.quit();
	}
	

}
