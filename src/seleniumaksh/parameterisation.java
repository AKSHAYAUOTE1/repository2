package seleniumaksh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterisation {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	//	*************TO IDENTIFY CELL TYPE***********
		
		FileInputStream file =new FileInputStream("C:\\Users\\A\\Desktop\\aki.xlsx");
		CellType type = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getCellType();
		System.out.println(type);

		//***********TO GET LAST CELL NUMBER*********
		FileInputStream file1= new FileInputStream("C:\\Users\\A\\Desktop\\aki.xlsx");
		short lastcellnum=WorkbookFactory.create(file1).getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(lastcellnum);
		
		//***********TO GET LAST CELL NUMBER*********
		FileInputStream file4= new FileInputStream("C:\\Users\\A\\Desktop\\aki.xlsx");
		int lastrownum=WorkbookFactory.create(file4).getSheet("sheet1").getLastRowNum();
		System.out.println(lastrownum);

		
		//******TO GET STRING CELL VALUE********
		for(int i=0;i<=lastcellnum-1;i++) {
			FileInputStream file2=new FileInputStream("C:\\Users\\A\\Desktop\\aki.xlsx");
			String value=WorkbookFactory.create(file2).getSheet("sheet1").getRow(0).getCell(i).getStringCellValue();
			System.out.println(value+ " ");
		}
		//******TO GET SPECIFIC STRING CELL VALUE********
		FileInputStream file3=new FileInputStream("C:\\Users\\A\\Desktop\\aki.xlsx");
		String value1=WorkbookFactory.create(file3).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value1);
		
		
		
		
	}
	

				
			
			
			
			
		

	}



