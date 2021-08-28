package Build_01_com.vtiger.comcastPomRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement userNameEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;

	public WebElement getUserName() {
		return userNameEdt;
	}

	public WebElement getPassword() {
		return passwordEdt;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	public void loginToApp(String username, String password)
	{
		userNameEdt.sendKeys("admin");
		passwordEdt.sendKeys("admin");
		submitButton.click();
		
	}

}
