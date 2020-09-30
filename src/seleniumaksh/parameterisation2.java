package seleniumaksh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterisation2 {
	public static void main(String[] args) throws IOException {
		
		//*******TO ACCESS WHOLE SHEET**********
		
		FileInputStream file=new FileInputStream("C:\\Users\\A\\Desktop\\aki.xlsx");
		int lastrow=WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();

		for(int i=0;i<=lastrow;i++) {
	
FileInputStream file1=new FileInputStream("C:\\Users\\A\\Desktop\\aki.xlsx");
short lastcell=WorkbookFactory.create(file1).getSheet("sheet1").getRow(0).getLastCellNum();
for(int j=0;j<=lastcell-1;j++) {
	FileInputStream file2=new FileInputStream("C:\\Users\\A\\Desktop\\aki.xlsx");
	String value=WorkbookFactory.create(file2).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
	System.out.print(value+ " ");
	
}
System.out.println();

}
	}
}
