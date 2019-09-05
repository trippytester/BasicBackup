package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POIBook 
{
	@FindBy(xpath="//a[@class='view-all']")
	private WebElement viewAllMovies;
	
	@FindBy(xpath="(//div[@class='mv-row']//img)[13]")
	private WebElement movie;
	
	@FindBy(xpath="//a[@class='showtimes btn _cuatro']")
	private WebElement bookTickets;
	
	@FindBy(xpath="(//a[@class='dimension-pill'])[4]")
	private WebElement format;
	
	@FindBy(xpath="(//div[@class='showtime-filters struktur  ']//li)[4]/a//div")
	private WebElement day;
	
	@FindBy(xpath="//section[@class='phpShowtimes showtimes']//li[1]//div[@class='body ']/div/a[1]")
	private WebElement showTime;
	
	@FindBy(id="btnPopupAccept")
	private WebElement accept;
	
	@FindBy(id="proceed-Qty")
	private WebElement ok;
	
	@FindBy(xpath="//div[.='A']/../..//td/..//a[1]")
	private WebElement last;
	
	public POIBook(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickViewAll()
	{
		viewAllMovies.click();
	}
	
	public void clickMovie(WebDriver driver)
	{
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1250)");
		movie.click();
	}
	
	public void ClickBookTicketButton()
	{
		bookTickets.click();
	}
	
	public void ClickFormat()
	{
		format.click();
	}
	
	public void ClickDay()
	{
		day.click();
	}
	
	public void SelectShowTime()
	{
		showTime.click();
	}
	
	public void ClickAccept()
	{
		accept.click();
	}
	
	public void SelectSeats(WebDriver driver,int num)
	{
		if(num!=2)
		{
		driver.findElement(By.xpath("//ul[@id='popQty']//li["+num+"]")).click();
		}
	}
	
	public void ClickOK()
	{
		ok.click();
	}
	
	public void ClickLast()
	{
		last.click();
	}
}
