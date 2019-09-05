package urbanladderdataandexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadderExcelWrite {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.urbanladder.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(1000);
		
	    WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
	    Actions a=new Actions(driver);
	    a.moveToElement(sale).perform();
	    Thread.sleep(1000);
	    
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'Sale')]/following-sibling::div/descendant::div[2]/following-sibling::ul/li"));
//		for (WebElement li:list)
//		{
//			System.out.println(li.getText());
		
		
		Workbook  wb=WorkbookFactory.create(new FileInputStream("./data/saloni.xlsx"));
		wb.createSheet("Project1");
		int i=0;		
		for (WebElement li:list)
				{
					System.out.println(li.getText());
					
				wb.getSheet("Project1").createRow(i).createCell(0).setCellValue(li.getText());
				i++;
				}
		wb.write(new FileOutputStream("./data/saloni.xlsx"));
		wb.close();
	}
}		
	
		
