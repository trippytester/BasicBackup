package assignmentproperty;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyTest {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		
		Properties obj=new Properties();
		
		FileInputStream objf= new FileInputStream(System.getProperty("user.dir")+"./src/assignmentproperty/test2.properties");
		obj.load(objf);
		Thread.sleep(3000);
		driver.findElement(By.xpath(obj.getProperty("Username"))).sendKeys("yeyy");
		
		
		
		
		

	}

}
