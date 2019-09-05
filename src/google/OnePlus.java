package google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePlus {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus 7",Keys.ENTER);
		Thread.sleep(3000);
		
		String s1="OnePlus 7 Pro: Everything you need to know!";
		//List<WebElement> list = driver.findElements(By.xpath("//div[@class='ellip']"));
		
		List<WebElement> link=null;
		for(int i=0;i<=10;i++)
		{
			boolean flag=false;
			link=driver.findElements(By.xpath("//div[@class='ellip']"));
			Thread.sleep(2000);
		    
			for (WebElement w:link)
		    {
			  //String s2=w.getText();
			  if(w.getText().contains(s1))
			  {
				  flag=true;
				  w.click();
				  //Thread.sleep(3000);
				  
				  break;
			  }
		    }
			if(flag==true)
			{
				break;
			}
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
	}
}


