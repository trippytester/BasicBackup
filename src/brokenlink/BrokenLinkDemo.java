package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("file:///G:/html/Brokenlinks2.html");
		Thread.sleep(3000);
		
		WebElement link1 = driver.findElement(By.xpath("//a[.='Urban Ladder']"));
		String link = link1.getAttribute("href");

		URL u=new URL(link);
		URLConnection ulink=u.openConnection();
		
	    HttpURLConnection connection = (HttpURLConnection)ulink;
	    int Rcode = connection.getResponseCode();
	    System.out.println(Rcode);
	    if(Rcode==200)
	    {
	    	System.out.println(Rcode);
	    	System.out.println(connection.getResponseMessage());
	    	System.out.println("link is not broken");
	    }
	    else
	    {
	    	System.out.println(Rcode);
	    	System.out.println(connection.getResponseMessage());
	    	System.out.println("link is broken");
	    }

		
		
		//Thread.sleep(3000);

	}

}
