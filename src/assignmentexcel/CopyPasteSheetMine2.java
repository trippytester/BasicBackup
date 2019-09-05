package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CopyPasteSheetMine2 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		
		Row rowSheet1 = wb.getSheet("test1").getRow(0);
		Row rowSheet2 = wb.createSheet("copypaste").createRow(0);
		
		int cellCount = rowSheet1.getPhysicalNumberOfCells();
		
		for(int i=0;i<cellCount;i++)
		{
			String data = rowSheet1.getCell(i).toString();
			rowSheet2.createCell(i).setCellValue(data);
		}
		wb.write(new FileOutputStream("./data/input.xlsx"));
		wb.close();

	}

}
