package Build_01_com.vtiger.comcastPomRepositoryLib;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FilterByProspectAccounts 
{
	WebDriver driver;
	public FilterByProspectAccounts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id='viewname']")
	private WebElement ProspectAccounts;
	public WebElement getProspectAccounts()
	{
		return ProspectAccounts;
	}
	public void prspectName()
	{
		Select select=new Select(ProspectAccounts);
		select.selectByIndex(2);
		
	}
	
}
