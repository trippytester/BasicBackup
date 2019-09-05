package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteEntireRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		int i=0;
		String head[]= {"Tcname","result","script","tc1","pass","yes","tc2","fail","no","tc3","pass","no"};
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		wb.createSheet("onlyonerow");
		wb.getSheet("onlyonerow").createRow(i);
		for(int j=0;j<head.length;j++)
		{
			wb.getSheet("onlyonerow").getRow(i).createCell(j).setCellValue(head[j]);
			
		}
		wb.write(new FileOutputStream("./data/input.xlsx"));
		wb.close();
	}

}
