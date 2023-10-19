package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlepopup {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/91808/OneDrive/Documents/index1.html");
		
		
		driver.findElement(By.xpath("/html/body/div[3]/button")).click();
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("hhhhhghgh");
		//Thread.sleep(3000);
		alert.dismiss();
		
		
		
		
		
		/*driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(alert.getText());
		alert.dismiss();*/
		
		

	}

}
