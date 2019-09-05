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

public class Flipkart {
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
    Thread.sleep(2000);
    List<WebElement> cost = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
    
    List<WebElement> bookNames = driver.findElements(By.xpath("//div[@class=\"_1vC4OE\"]/ancestor::div[@class='_3liAhj _1R0K0g']/descendant::a[@class='_2cLu-l']"));
    
    System.out.println("Books with prices : ");
    System.out.println();
    for (int i=0;i<cost.size();i++)
    {
      System.out.print(cost.get(i).getText()+"    ");	
      System.out.print(bookNames.get(i).getText());
      System.out.println();
    }
    
    ArrayList<String> arrayprice =new ArrayList<String>();
   
    for(WebElement wb:cost)
    {
      String price = wb.getText();
      String priceque = price.substring(1);
      if(priceque.length()>3)
      {
         if(priceque.length()==5)
         {
           String pricefirstdigit = priceque.substring(0,1);
           String priceleft = priceque.substring(2);
           String finalprice = ""+pricefirstdigit+priceleft;
           arrayprice.add(finalprice);
         }
        else
           {
              String pricefirstdigit = priceque.substring(0,2);
              String priceleft = priceque.substring(3);
              String finalprice = ""+pricefirstdigit+priceleft;
         
              arrayprice.add(finalprice);
           }
      }
      else
      {
        arrayprice.add(priceque) ;
      }
   
   }
    

    ArrayList<Integer> a=new ArrayList<Integer>();
    for(String s:arrayprice)
    {
        int i = Integer.parseInt(s);
        a.add(i);
 
    }
    Collections.sort(a);
//    for(int i=0;i<a.size();i++)
//    {
//         System.out.println(a.get(i));
// 
//    }
    
    Integer least = a.get(0);
    List<WebElement> leastBook = driver.findElements(By.xpath("//div[contains(text(),'"+least+"')]/ancestor::div[@class='_3liAhj _1R0K0g']/descendant::a[@class='_2cLu-l']"));

    System.out.println();
    
    for(WebElement w:leastBook)
    {
    	System.out.println("The book with least price is : "+w.getText()+"    price : Rs"+least);	
    }
    
    System.out.println();
    
    Thread.sleep(1000);
     List<WebElement> discount = driver.findElements(By.xpath("//div[@class='VGWI6T']"));
     List<WebElement> bookNamesDiscount = driver.findElements(By.xpath("//div[@class='VGWI6T']/ancestor::div[@class=\"_3liAhj _1R0K0g\"]/descendant::a[@class='_2cLu-l']"));
     
     System.out.println("Books with discount : ");
     System.out.println();
     for (int i=0;i<discount. size();i++)
     {
       System.out.print(discount.get(i).getText()+"    ");
     //  System.out.println(discount.get(i).getText().length()+"     ");
       System.out.print(bookNamesDiscount.get(i).getText());
       System.out.println();
     }
    
     String[] str=new String[discount.size()];
     int l=0;
     for(WebElement w:discount)
     {
    	 str[l]=w.getText();
    	 l++;
     }
     
     
     
     for (int i=0;i<str.length-1;i++)
     {
    	 for(int j=i+1;j<str.length;j++)
    	 {
    	 
         if (str[i].length()==str[j].length())
         {
        	 if(str[i].compareTo(str[j])>0)
        	 {
        		 String temp=str[i];
        		 str[i]=str[j];
        		 str[j]=temp;
        	 }
        	 
         }
         
         else
         {
        	 if(str[i].length()>str[j].length())
        	 {
        		 String temp=str[i];
        		 str[i]=str[j];
        		 str[j]=temp;
        	 }
         }
    	 } 
    	 
     }
     
     String leastDiscount = str[0];
     
     Thread.sleep(1000);
     List<WebElement> book = driver.findElements(By.xpath("//span[text()='"+leastDiscount+"']/ancestor::a/preceding-sibling::a[1]"));
     Thread.sleep(1000);
     System.out.println();
     
     for(WebElement w:book)
     {
    	 System.out.println("The book with least Discount : "+w.getText() + "   Least discount : "+leastDiscount);
     }
     
     System.out.println();
     
//     for(String s:str)
//     {
//    	 System.out.println(s);
//     }
     
//     for ()
//    
//     System.out.println();
    
    
    
    
    
    
    
    
   }
}