package gmailscenarios;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailNameSubject {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enter the mail numbr");
		Scanner s1=new Scanner(System.in);
		int i=s1.nextInt();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("amitabh.nampalliwar01@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("afrojack7210");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		//int i=10;
		WebElement sender = driver.findElement(By.xpath("//div[@class='UI']/descendant::div[@class='Cp'][1]/descendant::tbody/descendant::td[@class='yX xY ']["+i+"]/descendant::div[2]"));
		System.out.println(sender.getText());
		
	}

}
