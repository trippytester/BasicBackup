package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
	//	System.out.println("hey");
		
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
//		int i=0;
		wb.createSheet("test4").createRow(0).createCell(0).setCellValue("ahan");
//		wb.getSheet("test4").getRow(i).createCell(1).setCellValue("lala");
		wb.write(new FileOutputStream("./data/input.xlsx"));
	//	wb.close();
		
		System.out.println(wb.getSheet("test3").getRow(0).getCell(0).toString());
		
		
		
		wb.getSheet("test4").getRow(0).createCell(1).setCellValue("yeyy");
        wb.write(new FileOutputStream("./data/input.xlsx"));
		wb.close();
  
	}

}
