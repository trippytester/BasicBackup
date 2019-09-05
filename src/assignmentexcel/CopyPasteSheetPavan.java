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

public class CopyPasteSheetPavan
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		Sheet sheet = wb.getSheet("onlyonerow");
		 Row row = sheet.getRow(0);
		 int rowLength = row.getPhysicalNumberOfCells();
		 Sheet sheetTwo = wb.createSheet("pastepage");
		 Row sheetTwoRow = sheetTwo.createRow(0);
		 for (int i = 0; i < rowLength; i++) 
		 {
		 Cell cell = sheetTwoRow.createCell(i);
		 Cell firstSheetCell = row.getCell(i);
		 cell.setCellValue(firstSheetCell.getStringCellValue());
		 }
		 FileOutputStream outFile = new FileOutputStream(new File("./data/input.xlsx"));
		 wb.write(outFile);
		 wb.close();
	}
}
