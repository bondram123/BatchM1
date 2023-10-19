package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingpopupsusingautoit {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");	
		
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0,600).perform();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\91808\\OneDrive\\Documents\\Documents\\Res.exe");
	}

}
