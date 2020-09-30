package seleniumaksh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actioncls2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 WebElement ram = driver.findElement(By.id("nav-link-accountList"));
		Actions act = new Actions(driver);
		act.moveToElement(ram).perform();
		WebElement chotu = driver.findElement(By.linkText("Your Orders"));

		 act.click(chotu).perform();
		

}}
