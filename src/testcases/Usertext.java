package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usertext {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		
		
		WebElement inputUserTextField=driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		
		inputUserTextField.sendKeys("alpha");
	}

}
