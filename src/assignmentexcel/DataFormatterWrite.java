package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.ss.usermodel.Cell;


public class DataFormatterWrite
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/saloni.xlsx"));
		DataFormatter format=new DataFormatter();
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
			  Cell cell = wb.getSheet("Project2").getRow(i).getCell(j);
			 String value = format.formatCellValue(cell);
//			 String value = cell.toString();
			 System.out.print(value+" ");
			}
			System.out.println();
		}
		wb.close();
	}

}


