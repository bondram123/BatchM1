package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocQ {

	public static void main(String[] args) throws Throwable
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=17011290905304185193&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062037&hvtargid=kwd-311187680635&hydadcr=5841_2362028");
	
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirts");
		
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	Thread.sleep(3000);
	
    driver.findElement(By.linkText("Men's Round Neck Half Sleeve Slim Fit Printed Cotton T-Shirt")).click();
    //driver.findElement(By.partialLinkText("Slim Fit Printed Cotton T-Shirt")).click();
 
 

	}

}
