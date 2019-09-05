package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteIntoExcelPavan 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		int l=0;
		Cell cell=null;
		String head[]= {"Bhajji","result","script","tc1","pass","yes","tc2","fail","no","tc3","pass","no"};
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/saloni.xlsx"));
		wb.createSheet("baby");
		for(int i=0;i<=3;i++)
		{
			wb.getSheet("baby").createRow(i);
			for(int j=0;j<=2;j++)
			{
			cell = wb.getSheet("baby").getRow(i).createCell(j);
			for(int k=l;k<head.length;)
			{
				cell.setCellValue(head[k]);
				break;
			}
			l++;
			}
		}
		wb.write(new FileOutputStream("./data/saloni.xlsx"));
		wb.close();
	}
}