package assignmentexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CopyPasteSheetMine {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		 Row rowSheet1 = wb.getSheet("test1").getRow(0);
		// Row row = sheet.getRow(0);
		 int cellCount = rowSheet1.getPhysicalNumberOfCells();
		 Row rowSheet2 = wb.createSheet("pastepage").createRow(0);
		// Row rowSheet2 = sheetTwo.createRow(0);
		 for (int i = 0; i < cellCount; i++) 
		 {
		 
		 Cell cellSheet1 = rowSheet1.getCell(i);	 
	     Cell cellSheet2 = rowSheet2.createCell(i);
		 
		 cellSheet2.setCellValue(cellSheet1.getStringCellValue());
		 }
		 FileOutputStream outFile = new FileOutputStream(new File("./data/input.xlsx"));
		 wb.write(outFile);
		 wb.close();

	}

}
