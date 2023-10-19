package testcases;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class LanchingBrowser
{

	public static void main(String[] args)throws Throwable
	{
		System.setProperty("webdriver.edge.driver","./drivers/chromedriver.exe");
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
   
   
   String CurrentPageurl=driver.getCurrentUrl();
   System.out.println(CurrentPageurl);
  
   
   String TitleOfCurrentPage=driver.getTitle();
   System.out.println(TitleOfCurrentPage);
   
   
  
   
   Thread.sleep(5000);
   Options mang=driver.manage();
   Window win=mang.window();
   win.maximize();
   
   
   driver.manage().window().minimize();
   Thread.sleep(3000);
   driver.manage().window().fullscreen();
  // driver.close();
   Point pos=driver.manage().window().getPosition();
   int xcoordinate =pos.getX();
   int ycoordinate =pos.getY();
   System.out.println("the x co ordinates is - "+xcoordinate);
   System.out.println("the y co ordinates is - "+ycoordinate);
   
   Dimension dim=driver.manage().window().getSize();
   int width =dim.getWidth();
   int height =dim.getHeight();
   System.out.println("the width of window is - "+width);
   System.out.println("the hight of window is - "+height);
	}

}
