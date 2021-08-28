package Build_01_com.vtiger.comcastPomRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InByOrganizationName 
{
	public InByOrganizationName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="bas_searchfield")
	private WebElement OrganizationName;
	public WebElement getOrganizationName() {
		return OrganizationName;
	}
	
	@FindBy(id="submit")
	private WebElement OragSubmitButton;
	public WebElement getOragSubmitButton() {
		return OragSubmitButton;
	}
	
	public void OragSubmitButton(WebDriver driver)
	{
		
		OragSubmitButton.click();
		
	}
	
	
}
