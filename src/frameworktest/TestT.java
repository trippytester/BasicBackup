package frameworktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestT {
	
	static 
	{		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		T obj=new T(driver);
		Thread.sleep(3000);
		
		obj.setUn();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		obj.setUn();
		Thread.sleep(3000);
		

	}

}
