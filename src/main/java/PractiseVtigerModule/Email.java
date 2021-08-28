package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Email 
{

	WebDriver driver;
	public Email(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Email")
	private WebElement EmailLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailLink() {
		return EmailLink;
	}

}
