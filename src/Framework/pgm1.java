package Framework;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pgm1 {
public static void main(String[] args) throws InterruptedException {
	 ChromeOptions opt = new ChromeOptions();
	 opt.addArguments("disable notification");
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://kite.zerodha.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 //UN
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DV1510");
	 
	 //pw
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("April@123");
	 
	// click on login
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			
			//pin
			
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("038631");
			 
			 //continue
			 
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 //get text
			String ACT = driver.findElement(By.xpath("//div[@class=\"avatar\"]")).getText();
			 
			 String EXP="KV" ;
			 if(ACT.equals(EXP)) {
				 System.out.println("pass");
			 }
			 else {
				 System.out.println("fail");
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	 
}
}
