package frameworktest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T {
	
	private WebElement unTb;
	
	public T(WebDriver driver)
	{
		unTb=driver.findElement(By.xpath("//input[@type='email']"));
	}
	
	public void setUn()
	{
		unTb.sendKeys("admin");
	}

}
