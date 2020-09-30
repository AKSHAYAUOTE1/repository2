package seleniumaksh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementandmethods {
	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", " C:\\Users\\A\\Desktop\\software\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\A\\\\Desktop\\\\software\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		boolean result=driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();     //***IS DISPLAYED*****
		System.out.println(result);
		
		boolean result1=driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).isEnabled();   //****IS ENABLED****
		System.out.println(result1);
		
		boolean result2=driver.findElement(By.xpath("//select[@id='day']")).isSelected()  ;             //***IS SELECTED*******
		System.out.println(result2);
		
		
		boolean result4=driver.findElement(By.xpath("//input[@type='radio']")).isSelected()  ;   
		System.out.println(result4);
		
		
		String result3=driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).getText();          //****GET TEXT******
		System.out.println(result3);
		
		
	}

}
