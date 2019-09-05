package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteEntireColumn 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		//int i=0;
		String head[]= {"Tcname","result","script","tc1","pass","yes","tc2","fail","no","tc3","pass","no"};
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		wb.createSheet("onlyonecol");
		for(int i=0;i<head.length-1;i++)
		{
			wb.getSheet("onlyonecol").createRow(i).createCell(0).setCellValue(head[i]);
			
		}
		wb.write(new FileOutputStream("./data/input.xlsx"));
		wb.close();
	}

}
