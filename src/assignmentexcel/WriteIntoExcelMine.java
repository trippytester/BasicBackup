package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteIntoExcelMine
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
	
		String[] str= {"Item","Restaurant","Collector","a","b","c","d","e","12"};
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/saloni.xlsx"));
		//wb.createSheet("project2");
		
		int l=0;
		for(int i=0;i<=2;i++)
		{
			wb.getSheet("project2").createRow(i);
			for (int j=0;j<=2;j++)
			{
				Cell c = wb.getSheet("project2").getRow(i).createCell(j);
				if(l<str.length)
				{
					c.setCellValue(str[l]);
				}
				l++;
			}
		}
		
		wb.write(new FileOutputStream("./data/saloni.xlsx"));
		wb.close();
	
	}

}
