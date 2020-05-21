//This file consists of all the variables/web elements used for Home page of IMDB

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBHomePage {
	
	//Initialize objects in the Page
	public IMDBHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public String strWebURL = "http://www.imdb.com";
	public String strHomePageTitle = "IMDb - Movies, TV and Celebrities - IMDb";
	
	@FindBy(xpath = "//*[@id='navTitleMenu']/span")
	public WebElement btnChartDropDown;
	
	@FindBy(xpath = "//*[@id='navMenu1']/div[2]/ul[2]/li[4]/a")
	public WebElement lnkTop250;
	

}
