package seleniumaksh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action5 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");

//**********CUSTOMISE LIST BOX***********
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement mnth = driver.findElement(By.xpath("//select[@aria-label='Month']"));
    Actions act = new Actions(driver);
    act.click(mnth).perform();
    for (int i = 0; i <=12; i++) {
    	act.sendKeys(Keys.ARROW_UP).perform();
    }
    	Thread.sleep(2000);
    	for (int i1 = 0; i1 <=5; i1++) {
    		act.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
    	act.sendKeys(Keys.ENTER).perform();
    	Thread.sleep(2000);
		
	}
	}


