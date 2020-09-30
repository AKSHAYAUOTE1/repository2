package seleniumaksh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlelistbox2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	//*****how to get all option present in the list box*************
		
		WebElement rv3=driver.findElement(By.xpath("//select[@id='month']"));   //***month example*******
		Select V=new Select(rv3);
		List<WebElement>op=V.getOptions();
	for(int i=0;i<=op.size()-1;i++) {
			String aki=op.get(i).getText();
			System.out.println(aki);
			
			//******how to get 1st seleted option present in the list box*************
			WebElement rv=driver.findElement(By.xpath("//select[@id='day']"));
			Select d=new Select(rv);
		WebElement first=	d.getFirstSelectedOption();
			System.out.println(first.getText());
			
			
			
	
	}
			
					
					
					
					
					
					
					
					
					
					
					
	
	}

	}

