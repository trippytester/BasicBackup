package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RealRead {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/saloni.xlsx"));
		//Workbook wb1=new WorkbookFactory(new FileInputStream("./data/input.xlsx"));
		wb.removeSheetAt(2);
		
		
	}

}
