package urbanladder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	@FindBy(xpath = "//a[@class='close-reveal-modal hide-mobile']")
	private WebElement closeHDP;
	
	@FindBy(xpath = "(//span[@class='topnav_itemname'])[1]")
	private WebElement saleOption;
	
	

}
