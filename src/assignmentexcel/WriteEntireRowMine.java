package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteEntireRowMine {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		String[] s= {"Tcname","result","script","tc1","pass","yes","tc2","fail","no","tc3","pass","no"};
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		Row row = wb.createSheet("test3").createRow(0);
		
		for(int i=0;i<s.length;i++)
		{
			row.createCell(i).setCellValue(s[i]);
		}
		wb.write(new FileOutputStream("./data/input.xlsx"));
		wb.close();
	}

}
