package Build_01_com.vtiger.comcastPomRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(id="bas_searchfield")
	private WebElement OrganizationName;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administrater;
	
	@FindBy(linkText="Sign Out")
	private WebElement SignOut;
	
	public WebElement getSignOut() {
		return SignOut;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdministrater() {
		return Administrater;
	}

	public WebElement getOrganizationsPage() {
		return OrganizationsPage;
	}
	
	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public void OrganizationNameOperation()
	{
		Select select=new Select(OrganizationName);
		select.selectByVisibleText("Organization Name");
	}
	public void logout()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(Administrater).perform();
		SignOut.click();
	}


}
