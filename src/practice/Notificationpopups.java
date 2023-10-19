package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIt46j6dWXgQMV2BSDAx014QvXEAAYASAAEgKALfD_BwE");

	}

}
