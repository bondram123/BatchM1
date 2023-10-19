package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement selectcountrydropdown = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select countrydropdown=new Select(selectcountrydropdown);
	   // countrydropdown.selectByVisibleText("American Samoa");
		//countrydropdown.selectByValue("ATG");
		countrydropdown.selectByIndex(4);
		WebElement countryfirstsel = countrydropdown.getFirstSelectedOption();
		System.out.println("the select country" +" "+countryfirstsel.getText());
		boolean multipleorsingleelement=countrydropdown.isMultiple();
		if(multipleorsingleelement==false)
		{
			System.out.println("the selected element is single select");
		}
		else
		{
			System.out.println("the selected element is multiple select");
		}
		
		
		
		List<WebElement> allcountryoptions= countrydropdown.getOptions();
		for(WebElement option:allcountryoptions) {
			int count=1;
			System.out.println("the "+count+" option is"+option.getText());
			count++;
		}
		
		
		
				

	}

}
