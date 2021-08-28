package Build_01_com.vtiger.comcastPomRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home 
{
	WebDriver driver;
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement OrganizationsPage;
	
	@FindBy(id="viewname")
	private WebElement FilterAll;
	
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

	public WebElement getFilterAll() {
		return FilterAll;
	}
	
	public void filterOperation()
	{
		Select select=new Select(FilterAll);
		select.selectByIndex(1);
	}
	public void logout()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(Administrater).perform();
		SignOut.click();
	}


}
