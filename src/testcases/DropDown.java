package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
				
		WebElement Daydropdown= driver.findElement(By.id("day"));
		Select selectday=new Select(Daydropdown);
		boolean multiple = selectday.isMultiple();
		if(multiple=true) {
			System.out.println("the daydropdownselect is multiple select");
		}
		else
		{
			System.out.println("the daydropdownselect is single select");
		}
		selectday.selectByIndex(1);
		WebElement dayselectedoption = selectday.getFirstSelectedOption();
		System.out.println("the selected day"+" "+dayselectedoption.getText());
		
		
		WebElement Monthdropdown= driver.findElement(By.id("month"));
		Select selectmonth=new Select(Monthdropdown);
		selectmonth.selectByValue("1");
		WebElement monthselectedoption = selectmonth.getFirstSelectedOption();
		System.out.println("the selected month"+" "+monthselectedoption.getText());
		
		WebElement Yeardropdown= driver.findElement(By.id("year"));
		Select selectyear=new Select(Yeardropdown);
		selectyear.selectByVisibleText("1997");
		WebElement yearselectedoption = selectyear.getFirstSelectedOption();
		System.out.println("the selected year"+" "+yearselectedoption.getText());
		
		List<WebElement> alldaydropdownoptions = selectday.getOptions();
		int count=1;
		for(WebElement option:alldaydropdownoptions)
		{
			System.out.println("the " +count+ "option is" +" "+option.getText());
			count++;
		}
		
		

	}

}
