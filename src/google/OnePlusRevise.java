package google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePlusRevise {
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
		
		String s="OnePlus 7 Pro: Everything you need to know!";
		
		for(int i=0;i<100;i++)
		{
		List<WebElement> textList = driver.findElements(By.xpath("//div[@class='ellip']"));
		for (WebElement w:textList)
		{
			String text = w.getText();
			if(text.contains(s))
			{
				i=1000;
				w.click();
				Thread.sleep(8000);
				break;
			}
		}
		if(i==1000)
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		}
		
		String yo = driver.getTitle();
		System.out.println(yo);
		
		
	}
}