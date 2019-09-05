package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateSheetPavan 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
	 Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
	 Sheet s = wb.createSheet("saloni");
	 wb.write(new FileOutputStream("./data/input.xlsx"));
	 System.out.println(s.getSheetName());
	 System.out.println("==========================================================");
	 
	 //System.out.println("==========================================================");
	 int no = wb.getNumberOfSheets();
	 for(int i=0;i<=no-1;i++)
	 {
		 System.out.println(wb.getSheetName(i));
	 }
	
	 wb.close();
	}
}
