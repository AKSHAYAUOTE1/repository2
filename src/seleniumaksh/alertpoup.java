package seleniumaksh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpoup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();;
		Thread.sleep(3000);
		
		//*******switch to alert****
		Alert ram = driver.switchTo().alert();
		
		//****click on okay button*******
		Thread.sleep(3000);
		ram.accept();
	}

}
