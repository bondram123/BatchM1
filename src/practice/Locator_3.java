package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_3 {

	public static void main(String[] args) throws Throwable 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=3016947592129617904&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062037&hvtargid=kwd-10573980&hydadcr=14453_2154373");
     
	driver.manage().window().maximize();
	//classname
	int countscrollingpictures = driver.findElements(By.className("a-carousel-card")).size();
	System.out.println(countscrollingpictures);
	
	//tagname
	int countlinks = driver.findElements(By.tagName("a")).size();
	System.out.println(countlinks);
	
	Thread.sleep(5000);
	
	driver.quit();
	
	}

}
