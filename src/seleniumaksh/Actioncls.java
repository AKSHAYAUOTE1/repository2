package seleniumaksh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actioncls {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 WebElement ram = driver.findElement(By.id("nav-link-accountList"));
		//WebElement sham = driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
		
		
		

		
		Actions act=new Actions(driver);
		act.moveToElement(ram).contextClick().build().perform();
		// act.click(sham).perform();
	
		
	}

}
