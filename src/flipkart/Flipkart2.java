package flipkart;

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

public class Flipkart2 {
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
   
	WebElement search = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
    search.sendKeys("selenium books",Keys.ENTER);
    Thread.sleep(2000);
    List<WebElement> pages = driver.findElements(By.xpath("//a[contains(@class,'_2Xp0TH')]"));
    Thread.sleep(1000);
    //System.out.println(pages.size());
    
    
    System.out.println("Books with prices : ");
    ArrayList<String> rambo=new ArrayList<String>();
    
    for(int i=0;i<pages.size();i++)
    {
    List<WebElement> cost = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
    
    List<WebElement> bookNames = driver.findElements(By.xpath("//div[@class=\"_1vC4OE\"]/ancestor::div[@class='_3liAhj _1R0K0g']/descendant::a[@class='_2cLu-l']"));
    Thread.sleep(1000);
    System.out.println();
    for (int i1=0;i1<cost.size();i1++)
    {
//      System.out.print(cost.get(i1).getText()+"    ");	
//      System.out.print(bookNames.get(i1).getText());
//      System.out.println();
      rambo.add(cost.get(i1).getText());
    }
    Thread.sleep(1000);
    if(i==4)
    {
    	break;
    }
    driver.findElement(By.xpath("//span[text()='Next']")).click();;
    Thread.sleep(5000);
    }
    
   String[] jarvis= new String [rambo.size()];
   int i=0;
   for(String s: rambo)
   {
	   jarvis[i]=s;
	   i++;
   }
   
   for(int j=0;j<jarvis.length-1;j++)
   {
	   for (int k=j+1;k<jarvis.length;k++)
	   {
		   if(jarvis[j].length()==jarvis[k].length())
		   {
			   if(jarvis[j].compareTo(jarvis[k])>0)
			   {
				   String temp=jarvis[j];
				   jarvis[j]=jarvis[k];
				   jarvis[k]=temp;
			   }
		   }
		   else
		   {
			   if(jarvis[j].length()>jarvis[k].length())
			   {
				   String temp=jarvis[j];
				   jarvis[j]=jarvis[k];
				   jarvis[k]=temp;
			   }
		   }
	   }
   }
   
//   for(String s: jarvis)
//   {
//	   System.out.println(s);
//   }
   System.out.println("Least Price : "+jarvis[0]);
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 }
}