package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leads 
{
	WebDriver driver;
	public Leads(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Leads")
	private WebElement LeadsLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement addLread;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(name="company")
	private WebElement companyName;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveLeadPage;
	
	public WebElement getAddLread() {
		return addLread;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getCompanyName() {
		return companyName;
	}
	public WebElement getSaveLeadPage() {
		return saveLeadPage;
	}
	public WebDriver getDriver() 
	{
		return driver;
	}
	public WebElement getLeadsLink() 
	{
		return LeadsLink;
	}
	public void createLead(String firstnam, String lastnam, String companyNam)
	{
		addLread.click();
		firstname.sendKeys("Binu");
		lastname.sendKeys("Bhai");
		companyName.sendKeys("TYSS");
		saveLeadPage.click();
	}
	
	
}
