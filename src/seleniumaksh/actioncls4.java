package seleniumaksh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actioncls4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("//div[@class='col-md-12']/img"));
		WebElement dest = driver.findElement(By.xpath("//div[@id=\'targetDiv\']"));
		Actions ram=new Actions(driver);
		ram.dragAndDrop(src, dest).perform();
		
	}

}
