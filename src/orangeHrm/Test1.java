package orangeHrm;


import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String currentpage = driver.getCurrentUrl();
		System.out.println(currentpage);
		String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(5000);
        
        Point possition = driver.manage().window().getPosition();
        int xcordinate=possition.getX();
        int ycoordinates=possition.getY();        
        System.out.println(xcordinate);
        System.out.println(ycoordinates);
        
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Dimension size = driver.manage().window().getSize();
        int height = size.getHeight();
        int width = size.getWidth();
        System.out.println(height);
        System.out.println(width);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        driver.quit();
	}

}
