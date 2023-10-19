package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement emailTextField=driver.findElement(By.id("email"));
		
		emailTextField.sendKeys("hello");
		
		WebElement passwordTextfield=driver.findElement(By.id("pass"));
		passwordTextfield.sendKeys("Bye");
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();

	}

}
