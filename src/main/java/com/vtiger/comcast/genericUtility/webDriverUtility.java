package com.vtiger.comcast.genericUtility; 

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class webDriverUtility
{
	public void waitUntilPageLoad(WebDriver driver)
	{
		/**
		 * this method is used to wait for 15 sec for page loading
		 *@param driver
		 */
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	}
	/**
	 * it is used to visibiity of element on the webPge
	 * @param driver
	 * @param element
	 */
	public void waitForElementVisibitlity(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is used to wait for element  to be clicked, and its custom wait created to avoid elementAcceptableException
	 * @param element
	 * @throws Throwable
	 */
	public void waitAndClick(WebElement element) throws Throwable
	{
		int count=0;
		while(count<15)
		{
			try
			{
				element.click();
				break;
			}
			catch(Throwable e)
			{
				Thread.sleep(2000);
				count++;
			}
		}
	}
	/**
	 * This method is used to select dropDownBox using Value
	 * @param element
	 * @param option
	 */
	public void select(WebElement element, String option)
	{
		Select select=new Select(element);
		select.selectByValue(option);
	}
	/**
	 * This method is used to select drop down list by index
	 * @param element
	 * @param index
	 */
	public void select(WebElement element,int index)
	{
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	/**
	 * This method is used to perform mouse over target element
	 * @param driver
	 * @param element
	 */
	public void mouseOver(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
	}
	/**
	 * this method is used to right click operation
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element)
	{
		Actions action=new Actions(driver);
		action.contextClick().perform();
	}
	/**
	 * This method is used to switch one window to another window 
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWindowTitle)
	{
		Set<String> windowList = driver.getWindowHandles();
		Iterator<String> it = windowList.iterator();
		while(it.hasNext())
		{
			String winId = it.next();
			String title = driver.switchTo().window(winId).getTitle();
			
			if(title.contains(partialWindowTitle))
			{
				break;
			}
		}
	}
	/**
	 * this method is used to accept alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * this method is used to cancel alert
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();;
	}
	/**
	 * This method is used to scrolling action in a webpage
	 * @param driver
	 * @param element
	 */
	public void scrollToWebElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,)"+y+")",element);
	}
	/**
	 * This method is used to switch the frame using index
	 * @param driver
	 * @param index
	 */
	public void switchFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void switchFrame(WebDriver driver, String IdOrName)
	{
		driver.switchTo().frame(IdOrName);
	}
	public void takeScreenShoot(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+screenshotName+".png");
		Files.copy(src, dest);
	}
	/**
	 * pass enter appertain in a browser
	 * @param driver
	 */
	public void passEnterKey(WebDriver driver)
	{
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
	}
	
	
}
