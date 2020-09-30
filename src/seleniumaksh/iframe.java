package seleniumaksh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[] args) {
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\software\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\A\\\\Desktop\\\\software\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(@onclick,'document.get')]")).click();
		
		
	}

}
