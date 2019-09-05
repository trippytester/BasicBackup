package urbanladderaxesmethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElements;

public class UrbanLadderMine {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.urbanladder.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> mainList = driver.findElements(By.xpath("//div[@id='topnav_wrapper']//descendant::span[@class=\"topnav_itemname\"]"));
		
		Actions a=new Actions(driver);
		
		for(WebElement li1:mainList)
		{
			System.out.println();
			
			System.out.println(li1.getText());
			Thread.sleep(2000);
			a.moveToElement(li1).perform();
			Thread.sleep(1000);
			List<WebElement> subList1 = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'"+li1.getText()+"')]/following-sibling::div/descendant::div[@class='taxontype']"));
			
			for(WebElement li2:subList1)
			{
				System.out.println();
				System.out.println(li2.getText());
				System.out.println();
			    List<WebElement> subList2 = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'"+li1.getText()+"')]/following-sibling::div/descendant::div[contains(.,'"+li2.getText()+"')][2]/following-sibling::ul/descendant::li"));
			    
			    for(WebElement li3:subList2)
			    {
			    	
			    	System.out.println(li3.getText());
			    }
			}
		}
			
		
	}

}











