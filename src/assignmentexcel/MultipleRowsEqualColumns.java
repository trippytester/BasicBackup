package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleRowsEqualColumns {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/saloni.xlsx"));
		
		Sheet sheet1 = wb.getSheet("ammy");
		Sheet sheet2 = wb.createSheet("copypaste");
		int rowCount = sheet1.getPhysicalNumberOfRows();
		
		for(int j=0;j<rowCount;j++)
		{
		Row rowSheet1 = sheet1.getRow(j);
		Row rowSheet2 = sheet2.createRow(j);
		
		int cellCount = rowSheet1.getPhysicalNumberOfCells();
		
		for(int i=0;i<cellCount;i++)
		{
			String data = rowSheet1.getCell(i).toString();
			rowSheet2.createCell(i).setCellValue(data);
		}
		}
		wb.write(new FileOutputStream("./data/saloni.xlsx"));
		wb.close();

	}

}
