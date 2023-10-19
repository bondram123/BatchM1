package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator_1a {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.edge.driver","C:\\Users\\91808\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	EdgeDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsgzvpqb3838XXtuTb19nQQ5PJtPmfXwKwTqtFUIjJVc_KAAAAAQAAAABk0mnacmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Feu%2F%3Fref_%253Datv_auth_pre&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=262-2531894-7624922&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
	
	WebElement locatoridfield = driver.findElement(By.id("ap_email"));
	locatoridfield.sendKeys("good");

	}

}
