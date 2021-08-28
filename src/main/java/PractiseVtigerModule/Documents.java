package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Documents 
{
	WebDriver driver;
	public Documents(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Documents")
	private WebElement DocumentsLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDocumentsLink() {
		return DocumentsLink;
	}

}
