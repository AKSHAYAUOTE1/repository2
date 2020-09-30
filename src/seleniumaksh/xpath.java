package seleniumaksh;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	
	//*****DIFFERENT WAYS TO FIND XPATH******
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aauote1@gmail.com");      //*****BY TAG NAME*****
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("AUOTE");             //****BY INDEX*******
	
	driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();       //****BY TEXT FUNCTION**
	
	driver.findElement(By.xpath("//input[contains(@id,'ema')]")).sendKeys("aauote1@gmail.com");   //****USING CONTAINS WITH TAG NAME & ATTREIBUTE*******
	
	
}
}
