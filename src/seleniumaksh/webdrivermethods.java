package seleniumaksh;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\A\\\\Desktop\\\\software\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		//************WEBDRIVER AND IT'S METHODS***********
//		driver.get("https://www.facebook.com/");
//		driver.navigate().to("https://www.google.com/");
//		driver.navigate().back();
//		driver.navigate().to("https://www.twitter.com/");
//		driver.navigate().forward();
//		driver.navigate().to("https://www.amazon.com");
//		driver.manage().window().maximize();
//		Point p=new Point(400,500);
//		driver.manage().window().setPosition(p);
//		Dimension l=new Dimension(500,400);
//		driver.manage().window().setSize(l);
//		
		//*********TO GET URL********
		driver.get("https://www.amazon.com");
		String abc=driver.getCurrentUrl();
		System.out.println(abc);
	String lmn="www.fb.com";
	boolean result=abc.equals(lmn);
			if(result==true) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
		
		//********GET TITLE********
		String xyz=driver.getTitle();
		System.out.println(xyz);
		String pqr="Amazon";
		System.out.println(xyz.equals(pqr));
		
	}

}
