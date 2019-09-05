package urbanladder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class XpathTest {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.urbanladder.com");
	
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	Actions act=new Actions(driver);
	
	WebElement saleOption = driver.findElement(By.xpath("//span[@class='topnav_itemname']"));
	act.moveToElement(saleOption).perform();
	
	
	}

}
