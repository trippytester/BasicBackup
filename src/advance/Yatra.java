package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Yatra {
		
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
			driver.get("http://www.yatra.com");

			driver.findElement(By.id("BE_flight_origin_date")).click();
			boolean flag=true;
			while(flag)
			try
			{
			driver.findElement(By.id("15/11/2019")).click();
			flag=false;
			}
			
			catch(Exception e)
			{
				System.out.println("yyyeyyyyy");
			}

	}

}
