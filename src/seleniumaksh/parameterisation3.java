package seleniumaksh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterisation3 {public static void main(String[] args) throws IOException {
	
	//*********TO get particular int data from excel sheet **************
	
	
	FileInputStream file=new FileInputStream("C:\\Users\\A\\Desktop\\akshay.xlsx");
	Sheet sheetname=WorkbookFactory.create(file).getSheet("sheet1");
	int lastcellnum=sheetname.getRow(0).getLastCellNum();
	for(int i=0;i<=lastcellnum-1;i++) {
		
	CellType type=sheetname.getRow(0).getCell(i).getCellType();
	if(type==CellType.STRING) {
		String value=sheetname.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value+" ");
	}
	else {
		double value=sheetname.getRow(0).getCell(i).getNumericCellValue();
		System.out.println(value+" ");
	}
	}
	
}

}
