package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Blocknotificationpopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://in.puma.com/in/en?utm_source=GGL-SEA&utm_medium=BS&utm_aud=OTH&utm_obj=OLC&utm_campaign=BS_GGL_IN_BS_GGL_SEA_TXT_Brand-Exact_agency_1000067495857508873&gclid=Cj0KCQjwxuCnBhDLARIsAB-cq1ookkK7cto3ZSIzl-DNdTGpOqMQXJnsbmDcBdhud4lyfWxmWj7fd3QaAigAEALw_wcB");
		

	}

}
