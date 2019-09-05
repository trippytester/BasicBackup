package advance;

import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.redbus.in");
		
		WebElement source = driver.findElement(By.xpath("//input[@id='src']"));
		source.sendKeys("bengu");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		 WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("mysuru");
		Thread.sleep(1000);
		dest.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		
//		LocalDate date=LocalDate.now();
//		LocalDate expected_Date = date.plusDays(50);
//		int boarding_Date = expected_Date.getDayOfMonth();
//		String boarding_Month=expected_Date.getMonth().toString().substring(0, 3);
//		// Month expected_Month = expected_Date.getMonth();
//		//System.out.println(boarding_Month);
//		
//		//System.out.println("expected date : "+expected_Date);
//		//System.out.println("boarding date : "+boarding_Date);
//	
//		while(true)
//		{
//			WebElement month = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]"));
//			String current_Month = month.getText().substring(0, 3);
//			System.out.println(current_Month);
//			
//			if(boarding_Month.equalsIgnoreCase(current_Month))
//			{
//				driver.findElement(By.xpath("(//td[.='"+boarding_Date+"'])[2]")).click();
//				break;
//			}
//			
//			else
//			{
//				driver.findElement(By.xpath("(//button[text()='>'])[2]")).click();
//			}
//		}
//		
//	    driver.findElement(By.xpath("//label[text()='Return Date']")).click();
//		
//		LocalDate expected_Date2 = expected_Date.plusDays(30);
//		int returning_Date = expected_Date2.getDayOfMonth();
//		String returning_Month = expected_Date2.getMonth().toString().substring(0, 3);
		boolean flag=true;
		while(flag)
		{
			//WebElement month = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]"));
			//String current_Month = month.getText().substring(0, 3);
//			if(returning_Month.equalsIgnoreCase(current_Month))
//			{
//				driver.findElement(By.xpath("(//td[.='"+returning_Date+"'])[2]")).click();
//				break;
//			}
//			else
//			{
//				driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();
//			}
//				
//		}
			try 
			{
				driver.findElement(By.xpath("//td[contains(text(),'Nov 2019')]/../../tr[5]/td[5]")).click();
                flag=false;		
			}
			catch(Exception e)
			{
				//driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();
				driver.findElement(By.xpath("(//button[text()='>'])[2]")).click();
			}
			}
		
		//driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		

	}

}
