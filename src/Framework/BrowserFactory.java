package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
   static WebDriver	driver;
	public static void openbrowsers(String browser) {
		 ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("disable notifications");
		 if(browser.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Pictures\\Saved Pictures\\save\\chromedriver.exe");
		  driver=new ChromeDriver(opt);
		 driver.get("https://kite.zerodha.com");
		 }
		 else if(browser.equalsIgnoreCase("firefox")){
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\A\\Pictures\\geckodriver.exe");
			 driver=new org.openqa.selenium.firefox.FirefoxDriver();
			 driver.get("https://kite.zerodha.com");
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		
	}
	
}
