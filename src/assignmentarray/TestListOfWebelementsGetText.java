package assignmentarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestListOfWebelementsGetText {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
   
	WebElement search = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
    search.sendKeys("selenium books",Keys.ENTER);
    Thread.sleep(3000);
    
    List<WebElement> singleElement = driver.findElements(By.xpath("//span[contains(text(),'9% off')]/ancestor::a/preceding-sibling::a[1]"));
//    System.out.println(text);
    Thread.sleep(2000);
    
    for (WebElement w:singleElement)
    {
    	System.out.println(w.getText());
    }
    
    
    
}
}