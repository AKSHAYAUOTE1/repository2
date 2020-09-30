package seleniumaksh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action6 {
	public static void main(String[] args) throws InterruptedException {
		String abc="Feb";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement mnth = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		    Actions act = new Actions(driver);
		    act.click(mnth).perform();
		   	Thread.sleep(2000);
		   	if(mnth.getText()==abc) {
		   		act.sendKeys(Keys.ENTER).perform();
		   		
		   	}
		   		
		    	for (int i1 = 0; i1 <=5; i1++) {
		    		act.sendKeys(Keys.ARROW_DOWN).perform();
					
				}
		    	act.sendKeys(Keys.ENTER).perform();
		    	Thread.sleep(2000);
				
			}
			}


