package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest extends BrowserFactory {
public static void main(String[] args) throws InterruptedException {
	openbrowsers();
	Thread.sleep(3000);
	 
	  KiteLoginPage1 login1 = new KiteLoginPage1(driver);
	  login1.setKiteLoginPageUN("DV1510");
	  Thread.sleep(2000);
	  login1.setKiteLoginPagePWD("Pass@123");
	  Thread.sleep(2000);
	  login1.ClickKiteLoginPageLOGIN();
	  
	  Thread.sleep(2000);
	KiteLoginPage2 login2 = new KiteLoginPage2(driver);
	login2.setKiteLoginPagePIN("959594");
	
	login2.clickKiteLoginPagecontinue();
	 
	
	KiteLoginPage3 login3 = new KiteLoginPage3(driver);
	login3.GetKitehomePageprofilename();
	
	
	
}

private static void ClickKiteLoginPageLOGIN() {
	// TODO Auto-generated method stub
	
}
}
