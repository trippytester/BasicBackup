package urbanladderaxesmethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> mainList = driver
				.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[@class=\"topnav_itemname\" ]"));
		Actions a = new Actions(driver);
		
		for (WebElement li : mainList) 
		{
			Thread.sleep(2000);
			System.out.println();
			System.out.println(li.getText());
			System.out.println();
			a.moveToElement(li).build().perform();
			Thread.sleep(2000);
			List<WebElement> subList1 = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'"+li.getText()+"')]/following-sibling::div/descendant::div[@class=\"taxontype\"]"));
			for(WebElement li1:subList1)
			{
				Thread.sleep(2000);
				System.out.println();
				System.out.println(li1.getText());
				System.out.println();
				List<WebElement> subList2 = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'"+li.getText()+"')]/following-sibling::div/descendant::div/a[.='"+li1.getText()+"']/parent::div/following-sibling::ul/descendant::span"));
				for(WebElement li2:subList2)
				{	
					Thread.sleep(1000);
					System.out.println(li2.getText());
				}
			}
		}
	}
}
