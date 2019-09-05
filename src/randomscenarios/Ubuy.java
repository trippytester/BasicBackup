package randomscenarios;

 

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

import org.testng.annotations.Test;

 

//import io.github.bonigarcia.wdm.WebDriverManager;

 

public class Ubuy {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe" );
	}
	
	
	
	

              @Test

              public void m()

              {

                           ChromeOptions c = new ChromeOptions();

                           c.addArguments("--disable-notifications");

                          // WebDriverManager.chromedriver().setup();

                           WebDriver driver = new ChromeDriver();

                           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                           driver.manage().window().maximize();

                           driver.get("http://www.ubuy.co.in");

                           WebElement account = driver.findElement(By.xpath("//abbr[.='Account']"));

                           Actions a = new Actions(driver);

                           a.moveToElement(account).perform();

                           driver.findElement(By.xpath("//a[.=' Sign in']")).click();

                            driver.findElement(By.name("login[username]")).sendKeys("amitabh.nampalliwar01@gmail.com");

                           driver.findElement(By.name("login[password]")).sendKeys("afrojack7210");

                           driver.findElement(By.xpath("(//span[.='Login'])[2]")).click();

                           String name=driver.findElement(By.xpath("//div[@class='dropdown']/descendant::a[1]")).getText();

                           String d=name.substring(0, name.length()-1);

                           Assert.assertEquals(d, "AMITABH NA.");

              }

}