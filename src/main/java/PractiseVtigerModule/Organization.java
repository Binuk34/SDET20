package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.comcast.genericUtility.javaUtility;

public class Organization 
{
	WebDriver driver;
	public Organization(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement OrganizationsPage;
	

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrganiztion;
	
	@FindBy(name="accountname")
	private WebElement OrganizationName;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveOrganization;
	
	public WebElement getSaveOrganization() {
		return saveOrganization;
	}

	public WebElement getCreateOrganiztion() 
	{
		return createOrganiztion;
	}

	public WebElement getOrganizationName() 
	{
		return OrganizationName;
	}

	public WebDriver getDriver() 
	{
		return driver;
	}

	public WebElement getOrganizationsPage() 
	{
		return OrganizationsPage;
	}
	// check it 
	public void CreateOrga(String orgName) throws InterruptedException
	{
		createOrganiztion.click();
		javaUtility ju=new javaUtility();
		int ran = ju.GetRandomNumber();
		OrganizationName.sendKeys("QSPIDER2"+ran);
		saveOrganization.click();


	}

}
