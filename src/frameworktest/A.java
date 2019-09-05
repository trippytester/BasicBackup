package frameworktest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A {
	
	private WebElement unTb;
	private WebElement pwTb;
	private WebElement lgnBtn;
	
	public A(WebDriver driver)
	{
		unTb=driver.findElement(By.xpath("//input[@name='username']"));
		pwTb=driver.findElement(By.xpath("//input[@name='pwd']"));
		lgnBtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	
	public void setUsername()
	{
		unTb.sendKeys("admin");
	}
	
	public void setPassword()
	{
		pwTb.sendKeys("manager");
	}
	
	public void clickLoginButton()
	{
		lgnBtn.click();
	}

}
