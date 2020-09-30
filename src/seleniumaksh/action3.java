package seleniumaksh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class action3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\save\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//**********using drag and drop **********
		driver.get("https://demoqa.com/droppable/");
		WebElement aki = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement aki1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions ram = new Actions(driver); 
		
		ram.dragAndDrop(aki, aki1).perform();
		

		
	}

}
