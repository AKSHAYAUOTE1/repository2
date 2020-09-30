package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void takescnsht(WebDriver driver ,int TCID) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\A\\eclipse-workspace\\akshay\\scnshot1\\"+TCID+".jpg");
	FileHandler.copy(src, dest);
	}
	public static String gettestdata(int row,int cell) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\A\\eclipse-workspace\\akshay\\TestData\\sample1.xlsx");
        Sheet sheetvalue = WorkbookFactory.create(file).getSheet("sheet1");
        String value = sheetvalue.getRow(row).getCell(cell).getStringCellValue();
		return value;

	}

}
