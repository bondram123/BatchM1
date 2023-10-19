package javautility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javaexicutore
{
public static void flash(WebElement element,WebDriver driver) {
	
	
   String bgcolor = element.getCssValue("bagroundcolor");
   
   for(int i=0;i<500;i++) {
	   changeColor("#000000",element,driver);
	   changeColor(bgcolor,element,driver);
	   
   }
}
public static void changeColor(String color,WebElement element,WebDriver driver) 
{
	JavascriptExecutor jse=((JavascriptExecutor)driver);
	jse.executeScript("arguments[0].style.bagroundcolor= '"+ color +"'",element);
	
	try
	{
		Thread.sleep(3000);
	}
	catch (InterruptedException e) {
	
		
	}
	
}


}
