package seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement rv=driver.findElement(By.xpath("//select[@id='day']"));
		Select d=new Select(rv);
		//d.selectByIndex(1);
		List<WebElement> op=d.getOptions();
	for(int i=0;i<=op.size()-1;i++) {
	String aki=op.get(i).getText();
	System.out.println(aki);
	}

}}
