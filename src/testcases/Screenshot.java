package testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.instagram.com/accounts/login/");
		   
		   
		   
		   Thread.sleep(3000);
		   
		   
		   File tempfile = driver.getScreenshotAs(OutputType.FILE);
		   File paramanentfile = new File("./Screenshot/firstScreenshot1.png");
		   FileHandler.copy(tempfile, paramanentfile);

	}

}
