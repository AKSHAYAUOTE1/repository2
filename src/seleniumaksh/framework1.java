package seleniumaksh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framework1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("akshay");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("auote");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9975404785");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("akshi@143");
		//**select day***
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select aki = new Select(day);
		aki.selectByIndex(8);
		
		//*****select month******
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select ak = new Select(month);
		ak.selectByVisibleText("Jul");
		
		//********select year*******
		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
		Select a = new Select(yr);
		a.selectByValue("1995");
		
		//****select gendre*****
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		//***enter submit button****
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		
		String act = driver.findElement(By.xpath("//div[@class='_58mo']")).getText();
		String exp="Please use an email address or mobile number that is not already in use by a registered account";
		
		if(act.equalsIgnoreCase(exp)) {
			System.out.println("TEST CASE PASS");
		}
		else {
			System.out.println("test case fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
