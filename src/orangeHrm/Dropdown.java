package orangeHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.linkText("Login"));
		element.click();
		
		driver.findElement(By.id("Email")).sendKeys("ramallu9999@gmail.com");
		driver.findElement(By.xpath("Password")).sendKeys("Ram@1234");
		driver.findElement(By.linkText("Login")).click();
		
		
		
//		WebElement dropdownelement = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
//		Select select = new Select(dropdownelement);
//		select.selectByValue("About");

	}

}
