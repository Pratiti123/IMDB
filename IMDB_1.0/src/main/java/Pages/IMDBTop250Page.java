//This file consists of all the variables/web elements used for Top 250 page of IMDB

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBTop250Page {
	
	//Initialize Top 250 Page objects
	public IMDBTop250Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public String strTop250PageTitle = "IMDb Top 250 - IMDb";
	public String movieName,movieYear,movieRating;
	public int moviecount,yearcount;
	
	@FindBy(xpath = "//*[@id='main']/div")
	public WebElement tblMovieList;	
	
	/* Child Items
	@FindBy(tagName = "a")
	public WebElement strMovieName;
	
	@FindBy(name = "rd")
	public WebElement strMovieYear;
	
	@FindBy(name = "nv")
	public WebElement strMovieRating;
	*/
}
