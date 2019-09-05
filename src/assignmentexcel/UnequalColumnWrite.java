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

public class UnequalColumnWrite {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		String[] s1= {"a","b","c","d","e","f"};
		String[] s2= {"a","b","c"};
		
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		Sheet s = wb.createSheet("check");
		
		Row row1 = s.createRow(0);
		for(int j=0;j<s1.length;j++)
		{
			row1.createCell(j).setCellValue(s1[j]);
		}
		
		Row row2 = s.createRow(1);
		for (int j=0;j<s2.length;j++)
		{
			row2.createCell(j).setCellValue(s2[j]);
		}
		
		wb.write(new FileOutputStream("./data/input.xlsx"));
		wb.close();		
	}

}
