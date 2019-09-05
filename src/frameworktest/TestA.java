package frameworktest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestA {
	
	static 
	{		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		
		A obj=new A(driver);
		Thread.sleep(2000);
		obj.setUsername();
		Thread.sleep(2000);
		obj.clickLoginButton();
		
		//driver.navigate().refresh();
		Thread.sleep(4000);
		
		obj.setUsername();
		Thread.sleep(2000);
		obj.setPassword();
		Thread.sleep(2000);
		obj.clickLoginButton();

	}

}
