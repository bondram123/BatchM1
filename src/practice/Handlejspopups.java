package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlejspopups {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		/*driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(3000);
		Alert confermalert = driver.switchTo().alert();
		System.out.println("display confirm message"+" "+confermalert.getText());
		
		//confalert.accept();
		Thread.sleep(3000);
		confermalert.dismiss();*/
		
		/*driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert propt = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("display alert message" +propt.getText());
		
		propt .sendKeys("welcom");
		Thread.sleep(3000);
		propt .accept();*/

	}

}
