package testcases;

import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91808\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.codeverse.com/");
		
		
		String ref = driver.getPageSource();
		System.out.println(ref);

	}

}
