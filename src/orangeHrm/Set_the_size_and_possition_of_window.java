package orangeHrm;

 

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_the_size_and_possition_of_window {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 Point point = new Point(100,200);
		 driver.manage().window().setPosition(point);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Dimension dimention = new Dimension(300,400);
		 driver.manage().window().setSize(dimention);
		 
		 Thread.sleep(3000);
		 String windowid = driver.getWindowHandle();
		 System.out.println(windowid);
		 
		 driver.close();
		

	}

}
