package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="user_name")
	private WebElement userNameText;
	
	@FindBy(name="user_password")
	private WebElement passTextField;
	@FindBy(id="submitButton")
	private WebElement LoginSubmitButton;
	public WebElement getUserNameText() {
		return userNameText;
	}
	public WebElement getPassTextField() {
		return passTextField;
	}
	public WebElement getLoginSubmitButton() {
		return LoginSubmitButton;
	}
	public void LoginToApp(String name, String password)
	{
		userNameText.sendKeys("admin");
		passTextField.sendKeys("admin");
		LoginSubmitButton.click();
	}
}
