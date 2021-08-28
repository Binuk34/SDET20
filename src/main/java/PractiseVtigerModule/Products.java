package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products 
{
	WebDriver driver;
	public Products(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Products")
	private WebElement ProductsLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProductsLink() {
		return ProductsLink;
	}

}
