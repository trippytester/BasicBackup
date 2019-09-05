package espn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EspnCricket {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.espncricinfo.com");
		//Thread.sleep(2000);
		//WebElement nextscorecontrol = driver.findElement(By.xpath("//div[@class='scores-next controls']"));
	    //Thread.sleep(3000);
		//nextscorecontrol.click();
		WebElement result = driver.findElement(By.xpath("//span[.='Result']"));
		Actions action = new Actions(driver);
		action.moveToElement(result).perform();
		Thread.sleep(1000);
		WebElement scorecard = driver.findElement(By.xpath("//a[contains(.,'Scorecard')]"));
		Thread.sleep(1000);
		action.moveToElement(result).click(scorecard).perform();
	    List<WebElement> player = driver.findElements(By.xpath("//div[@id='gp-inning-00']/descendant::a[contains(@title,'View the player profile of ')]"));
		for(WebElement a:player)
		{
			Thread.sleep(1000);
			System.out.print(a.getText());
			List<WebElement> columns = driver.findElements(By.xpath("//div[@id='gp-inning-00']/descendant::a[contains(.,'"+a.getText()+"')]/parent::div/following-sibling::div"));
			for(WebElement b:columns)
			System.out.print("     "+b.getText());
			System.out.println();
			System.out.println();
		}

	}

}
