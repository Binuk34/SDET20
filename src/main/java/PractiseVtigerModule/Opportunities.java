package PractiseVtigerModule;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunities
{
	WebDriver driver;
	public Opportunities(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Opportunities")
	private WebElement OpportunitiesLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOpportunities;
	@FindBy(name="potentialname")
	private WebElement OpportunityName;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement createRelated;
	
	
	@FindBy(id="search_txt")
	private WebElement clickOnSearch;
	
	@FindBy(name="search")
	private WebElement searchRelated;
	
	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement clickOnSearchRelted;
	
	@FindBy(xpath="//a[@onClick='return vtlib_setvalue_from_popup(4, \"binu\", \"related_to\")']")
	private WebElement clickOnBinuLink;
	
	public WebElement getClickOnBinuLink() {
		return clickOnBinuLink;
	}

	public WebElement getClickOnSearchRelted() {
		return clickOnSearchRelted;
	}

	public WebElement getSearchRelated() {
		return searchRelated;
	}

	public WebElement getCreateOpportunities() {
		return createOpportunities;
	}

	public WebElement getOpportunityName() {
		return OpportunityName;
	}

	public WebElement getCreateRelated() {
		return createRelated;
	}

	public WebElement getClickOnSearch() {
		return clickOnSearch;
	}

	public WebDriver getDriver()
	{
		return driver;
	}

	public WebElement getOpportunitiesLink()
	{
		return OpportunitiesLink;
	}
	public void createOpportunities(String oppName) throws InterruptedException
	{
		createOpportunities.click();
		OpportunityName.sendKeys("jobProfile");
		createRelated.click();
		String parentWin = driver.getWindowHandle();
	    List<String> winId = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(winId.get(1));
	    clickOnBinuLink.click();
	    driver.switchTo().window(parentWin);
		
//		Set<String> winId = driver.getWindowHandles();
//		for(String str:winId)
//		{
//			driver.switchTo().window(str);
//			Thread.sleep(10000);
//		//	clickOnSearch.sendKeys("tiger");
//		//	searchRelated.click();
//		//	clickOnSearchRelted.click();
//			clickOnBinuLink.click();
//		}
		
	
		
	}
	
}
