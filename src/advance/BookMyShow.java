package advance;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(c);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/bengaluru?gclid=Cj0KCQjwhdTqBRDNARIsABsOl98bkjJX7dayLYL5ISnpmMtEX_HY3hNuksh2jkYFXv_6RK7avii3m-gaAh7yEALw_wcB");
		
		POIBook pb=new POIBook(driver);
		pb.clickViewAll();
		Thread.sleep(3000);
		pb.clickMovie(driver);
		Thread.sleep(3000);
		pb.ClickBookTicketButton();
		Thread.sleep(3000);
//		pb.ClickFormat();
//		Thread.sleep(3000);
		pb.ClickDay();
		Thread.sleep(3000);
		pb.SelectShowTime();
		Thread.sleep(3000);
		pb.ClickAccept();
		Thread.sleep(3000);
		pb.SelectSeats(driver, 2);
		Thread.sleep(1000);
		pb.ClickOK();
		Thread.sleep(1000);
		pb.ClickLast();
	}
}
