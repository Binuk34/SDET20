package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendar 
{
	WebDriver driver;
	public Calendar(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Calendar")
	private WebElement CalendarLink;
	
	@FindBy(xpath="//td[@class='calAddButton']")
	private WebElement AddLink;
	
	@FindBy(linkText="Meeting")
	private WebElement Meeting;
	
	public WebElement getMeeting() {
		return Meeting;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAddLink() {
		return AddLink;
	}
	public WebElement getCalendarLink() {
		return CalendarLink;
	}
	
	public void Meeting()
	{
		Actions action=new Actions(driver);
		action.moveToElement(AddLink).perform();
		Meeting.click();
	}
	
}
