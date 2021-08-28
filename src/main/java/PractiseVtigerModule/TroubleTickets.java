package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTickets 
{
	WebDriver driver;
	public TroubleTickets(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Trouble Tickets")
	private WebElement TroubleTicketsLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTroubleTicketsLink() {
		return TroubleTicketsLink;
	}
	
}
