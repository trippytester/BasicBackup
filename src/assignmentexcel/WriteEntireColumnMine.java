package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteEntireColumnMine {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		String[] s= {"Tests","Result","Review","t1", "pass","a","t2","fail","b","t3","fail","12"};
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		wb.createSheet("test2");
		
		for(int i=0;i<s.length;i++)
		{
			wb.getSheet("test2").createRow(i).createCell(0).setCellValue(s[i]);
		}
		wb.write(new FileOutputStream("./data/input.xlsx"));
		wb.close();
	}

}
