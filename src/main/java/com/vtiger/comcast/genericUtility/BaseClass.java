package com.vtiger.comcast.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Build_01_com.vtiger.comcastPomRepositoryLib.Home;
import Build_01_com.vtiger.comcastPomRepositoryLib.Login;


public class BaseClass {
    
	public static WebDriver sDriver;
	public WebDriver driver;
	//object creation for Lib
	public javaUtility JLib=new javaUtility();
	public webDriverUtility wLib=new webDriverUtility();
	public FileUtility fLib=new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();

	@BeforeSuite(groups={"RegressionTesting","Smoketest"})
	
	public void configBS() {
		System.out.println("*****connect to data base*******");

	}

	//@Parameters("BROWSER")
	//distribution of brower**********up to 45************* 
	@BeforeClass
	public void configBc()
	{
		System.out.println("******Launch The Browser***");
		driver=new ChromeDriver();
		wLib.waitUntilPageLoad(driver);
	}
	
	
	//testing the cross brower *********up to 71*********
	@Parameters("BROWSER")
	//@BeforeClass
	public void configBc(String BROWSER)
	{
	System.out.println("****LAUNCH THE BROWSER******");
	
	if(BROWSER.equals("chrome")) 
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(BROWSER.equals("ie"))
	{
		driver=new InternetExplorerDriver();
	}
	else
	{
		driver=new ChromeDriver();
	}
	
	}
	
	@BeforeMethod
	public void configBM() throws Throwable {

		// ******common Data**********
		String username = fLib.getPropertyKeyValue("username");
		String password = fLib.getPropertyKeyValue("password");
		String url = fLib.getPropertyKeyValue("url");
	
		String BROWSER = fLib.getPropertyKeyValue("browser");
		// ******Navigate to app********
		driver.get(url);

		// ****step 1 : login
		Login loginPage = new Login(driver);
		loginPage.loginToApp(username, password);
	}

	@AfterMethod
	public void configAM() 
	{
	      //****step 6 : logout
//		Home homePage = new Home(driver);
//        homePage.logout();
	}

	@AfterClass
	public void configAC()
	{
	System.out.println("*********Close the Browser******");
	driver.quit();
	}
	@AfterSuite
	public void configAS()
	{
		System.out.println("*********close DB*********");
	}

}
