package WEBtABLE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\save\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/A/Desktop/akshay.html");
		driver.manage().window().maximize();
		
		//********to get row size******
		String exp="manual";
		int rowsize = driver.findElements(By.xpath("//tbody/tr")).size();
		System.out.println(rowsize);
		
		//*****to get coloumn size***
		int clmsize = driver.findElements(By.xpath("//tbody/tr[3]/th")).size();
		System.out.println(clmsize);
		 for (int i = 2; i <rowsize; i++) {
		for (int j = 1; j < clmsize; j++) {
			String ram = driver.findElement(By.xpath("//tbody/tr["+i+"]/th["+j+"]")).getText();
			
			if(ram.equalsIgnoreCase(exp)) {
				System.out.println("exp result found at row no " +i+" &"+ "col number" +j);
				break;
			}
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
