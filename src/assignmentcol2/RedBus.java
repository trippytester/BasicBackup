package assignmentcol2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RedBus {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args)
	{
		FirefoxOptions c=new FirefoxOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(c);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.id("src")).sendKeys("kumbakonam");
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@data-no='1']"));
		driver.findElement(By.xpath("//label[contains(@class,'db text-trans-uc')]")).click();
		
		String mon = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText().substring(0, 3);
		
		LocalDate ld=LocalDate.now().plusDays(100);
		DateTimeFormatter date=DateTimeFormatter.ofPattern("MMM");
		DateTimeFormatter date1=DateTimeFormatter.ofPattern("d");
		String eresult = date.format(ld);
		String day=date1.format(ld);		
			if(eresult.equals(mon))
			{
				driver.findElement(By.xpath("(//td[.='"+day+"'])[2]")).click();
			}
			else
			{
				for(int i=0;i<=12;i++)
				{
						driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();
						String mon1 = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText().substring(0, 3);
						
						if(eresult.equals(mon1))
						{
							driver.findElement(By.xpath("(//td[.='"+day+"'])[2]")).click();
							break;
						}			
				}
				
			}				
		driver.findElement(By.xpath("//label[@for='return_cal']")).click();
		String mon2 = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText().substring(0, 3);
		LocalDate ld1 = ld.plusDays(100);
		String eresult1=date.format(ld1);
		String day1=date1.format(ld1);
		if(eresult1.equals(mon2))
		{
			driver.findElement(By.xpath("(//td[.='"+day1+"'])[2]")).click();
		}
		else
		{
			for(int i=0;i<=12;i++)
			{
					driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();
					String mon3 = driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]")).getText().substring(0, 3);
					
					if(eresult1.equals(mon3))
					{
						driver.findElement(By.xpath("(//td[.='"+day1+"'])[2]")).click();
						break;
					}			
			}
			
		}
		driver.findElement(By.id("search_btn")).click();
		
	}

}
