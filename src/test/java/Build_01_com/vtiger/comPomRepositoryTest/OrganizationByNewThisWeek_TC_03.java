package Build_01_com.vtiger.comPomRepositoryTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Build_01_com.vtiger.comcastPomRepositoryLib.FilterByNewThisWeek;
import Build_01_com.vtiger.comcastPomRepositoryLib.FilterByProspectAccounts;
import Build_01_com.vtiger.comcastPomRepositoryLib.Home;
import Build_01_com.vtiger.comcastPomRepositoryLib.InByOrganizationName;
import Build_01_com.vtiger.comcastPomRepositoryLib.Login;

public class OrganizationByNewThisWeek_TC_03 
{
	@Test
	public void OrganizationByNewThisWeek() throws Throwable
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8888/");
	
	Login login=new Login(driver);
	login.loginToApp("admin", "admin");
	
	Home home=new Home(driver);
	home.getOrganizationsPage().click();
	home.filterOperation();
	
	FilterByNewThisWeek filter=new FilterByNewThisWeek(driver);
	filter.getFilter().click();
	Thread.sleep(5000);
	
	FilterByProspectAccounts fps=new FilterByProspectAccounts(driver);
	fps.getProspectAccounts().click();
	fps.prspectName();
	
	InByOrganizationName InByOrg=new InByOrganizationName(driver);
	InByOrg.getOrganizationName().click();
	
	home.logout();
	driver.quit();
	}


}
