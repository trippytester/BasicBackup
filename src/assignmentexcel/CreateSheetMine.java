package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateSheetMine {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {

		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		Sheet sh = wb.createSheet("sasa");
		wb.write(new FileOutputStream("./data/input.xlsx"));
		 
		System.out.println(sh.getSheetName());
		
		
		for (int i=0;i<wb.getNumberOfSheets();i++)
		{

			System.out.println(wb.getSheetName(i));
		}
		wb.close();

	}

}
