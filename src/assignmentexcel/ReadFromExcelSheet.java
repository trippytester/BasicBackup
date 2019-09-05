package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/saloni.xlsx"));
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
			 String value = wb.getSheet("Project2").getRow(i).getCell(j).toString();
			 System.out.print(value+" ");
			}
			System.out.println();
		}
		wb.close();
	}

}
