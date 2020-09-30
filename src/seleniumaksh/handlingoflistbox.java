package seleniumaksh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingoflistbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		WebElement rv=driver.findElement(By.xpath("//select[@id='day']"));   //****SELECT BY INDEX*****
//		Select s=new Select(rv);
//		s.selectByIndex(2);
		
		
		WebElement rv1=driver.findElement(By.xpath("//select[@id='month']"));   //***SELECT BY STRING VALUE*******
		Select d=new Select(rv1);
		d.selectByValue("7");
		
		
	//	WebElement rv2=driver.findElement(By.xpath("//select[@id='year']"));     //**SELECT BY VISIBLE TEXT****    
		Select g=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		g.selectByVisibleText("1998");
		
		//******how to get all option present in the list box*************
		
		WebElement rv3=driver.findElement(By.xpath("//select[@id='month']"));   //***month example*******
		Select V=new Select(rv3);
		List<WebElement>op=V.getOptions();
		for(int i=0;i<=op.size()-1;i++) {
			String aki=op.get(i).getText();
			System.out.println(aki);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}

}
