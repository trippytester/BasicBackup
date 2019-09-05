package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkAllLink {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file://D:/html/Brokenlinks2.html");
		
		List<WebElement> link1 = driver.findElements(By.xpath("//a"));
		ArrayList<String> al=new ArrayList<String>();
		
		for(WebElement links:link1)
		{
		String link = links.getAttribute("href");
		al.add(link);
		}
				//System.out.println(link);
		for(int i=0;i<al.size();i++)
		{
		URL u=new URL(al.get(i));
		URLConnection ulink=u.openConnection();
		
	    HttpURLConnection connection = (HttpURLConnection)ulink;
	    int Rcode = connection.getResponseCode();
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
		
		}
		//Thread.sleep(3000);

	}

}
