package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Pictures\\Saved Pictures\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			FileInputStream DDF = new FileInputStream("C:\\Users\\A\\Desktop\\DDF1.xlsx");
			Sheet sheet = WorkbookFactory.create(DDF).getSheet("sheet1");
			
			
			driver.findElement(By.xpath("//a[@role='button']")).click();
			
			//ENTER FIRST NAME
			
			String Fname = sheet.getRow(0).getCell(0).getStringCellValue();
			driver.findElement(By.xpath("//*[@id=\'u_k_b\']")).sendKeys(Fname);
			
	}

}
