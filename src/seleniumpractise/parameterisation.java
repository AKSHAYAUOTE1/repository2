package seleniumpractise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterisation {
	 public static void main(String[] args) throws IOException {
			FileInputStream file=new FileInputStream("C:\\Users\\A\\Desktop\\akshay.xlsx");
			Sheet sheetname=WorkbookFactory.create(file).getSheet("sheet1");
			int lastcellnum=sheetname.getRow(0).getLastCellNum();
			for(int i=0;i<=lastcellnum-1;i++) {
				FileInputStream file1=new FileInputStream("C:\\Users\\A\\Desktop\\akshay.xlsx");
				Sheet sheet1=WorkbookFactory.create(file1).getSheet("sheet1");
				int lastrownum=sheet1.getLastRowNum();
				for(int j=0;j<=lastrownum;j++) {
				
			CellType type=sheetname.getRow(j).getCell(i).getCellType();
			if(type==CellType.STRING) {
				String value=sheetname.getRow(j).getCell(i).getStringCellValue();
				System.out.println(value+" ");
			}
			else {
				double value=sheetname.getRow(j).getCell(i).getNumericCellValue();
				System.out.println(value+" ");
			}
			}
			
		}

		}


}
