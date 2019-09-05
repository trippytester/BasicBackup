package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFetch {
	
	@DataProvider
	public String[][] getData() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/DataProvider.xlsx"));
		int r = wb.getSheet("Sheet1").getPhysicalNumberOfRows();
		int c=wb.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		String[][] o=new String[r][c];
		
		for(int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				o [i][j]=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
		}	
		return o;
	}
	
	@Test(dataProvider="getData")
	public void testLoginCredentials(String username,String password) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
//		Reporter.log(username,true);
//		Reporter.log(password,true);
		Reporter.log(username+" "+password,true);
	}

}
