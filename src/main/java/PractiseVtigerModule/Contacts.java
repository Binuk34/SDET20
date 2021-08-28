package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts 
{
	WebDriver driver;
	public Contacts(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Contacts")
	private WebElement ContactsLink;
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContact;
	
	@FindBy(name="firstname")
	private WebElement FirstName;
	
	@FindBy(name="lastname")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveContect;
	
	
	
	
	
	public WebElement getCreateContact() {
		return createContact;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getSaveContect() {
		return saveContect;
	}

	public WebDriver getDriver() 
	{
		return driver;
	}

	public WebElement getContactsLink() 
	{
		return ContactsLink;
	}
	
	public void CreateContact()
	{
		createContact.click();
		FirstName.sendKeys("binu");
		LastName.sendKeys("Ambani");
		saveContect.click();
	}

}
