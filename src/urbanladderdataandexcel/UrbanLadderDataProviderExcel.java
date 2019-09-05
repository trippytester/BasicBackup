package urbanladderdataandexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UrbanLadderDataProviderExcel 
{
	static int k=0;
	//static Row r = null;

	
	@Test(dataProvider="urban")
	public static void getExcel(String a) throws EncryptedDocumentException, IOException 
	{
		
		Reporter.log(a,true);
		getExcelData(a);
		
	
	}
	@DataProvider
	public String[][] urban() throws InterruptedException 
	{
		
		
		String[][] obj=openBrowser();
		
		return obj;
	
	}
	
	public static String[][] openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.urbanladder.com");
		Thread.sleep(2000);
		WebElement close = driver.findElement(By.xpath("//a[contains(@class,'close-reveal-modal hide')]"));
		Thread.sleep(2000);
		close.click();
		Actions act=new Actions(driver);
		WebElement sales = driver.findElement(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'Sale')]"));
		Thread.sleep(2000);
		act.moveToElement(sales).perform();
		Thread.sleep(2000);
		List<WebElement> salesSubmenu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'Sale')]/following-sibling::div/descendant::a"));
		int rows=salesSubmenu.size();
		System.out.println(rows);
		String [][] str=new String[rows][1];
		for(int i=0;i<rows;i++)
		{
			
			str[i][0]=salesSubmenu.get(i).getText();
			System.out.println(str[i][0]);

		}
		return str;
		
		
	}
	public static void getExcelData(String sht) throws EncryptedDocumentException, IOException 
	{
		
		File file=new File("./data/new.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet2");
		
		if(sh!=null)
		{
	     Row r=null;
		if(r!=null)
		{
			 r=sh.getRow(k);
		}
		else
		{
			 r=sh.createRow(k);
		}
		Cell c=null;
		if(c==null)
		{
			r.createCell(0).setCellValue(sht);
		}
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
		
		k++;	
	}
	}
}
