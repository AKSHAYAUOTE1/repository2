package WEBtABLE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\save\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/A/Desktop/akshay.html");
		driver.manage().window().maximize();
		
		//********to get row size******
		int rowsize = driver.findElements(By.xpath("//tbody/tr")).size();
		System.out.println(rowsize);
		
		//*****to get coloumn size***
		int clmsize = driver.findElements(By.xpath("//tbody/tr[3]/th")).size();
		System.out.println(clmsize);
		
		
	}

}
