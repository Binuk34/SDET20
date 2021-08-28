package Build_01_com.vtiger.comcastPomRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterByNewThisWeek 
{
	public FilterByNewThisWeek(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="viewname")
	private WebElement Filter;
	
	public WebElement getFilter() {
		return Filter;
	}
	

}
