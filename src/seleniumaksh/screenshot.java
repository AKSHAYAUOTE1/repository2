package seleniumaksh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", " C:\\Users\\A\\Desktop\\software\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\A\\\\Desktop\\\\software\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\A\\Desktop\\screenshot\\mc.jpg");
		FileHandler.copy(source, dest);
	}

}
