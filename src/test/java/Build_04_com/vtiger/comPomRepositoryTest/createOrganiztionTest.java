package Build_04_com.vtiger.comPomRepositoryTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtiger.comcast.genericUtility.BaseClass;

import Build_01_com.vtiger.comcastPomRepositoryLib.FilterByNewThisWeek;
import Build_01_com.vtiger.comcastPomRepositoryLib.FilterByProspectAccounts;
import Build_01_com.vtiger.comcastPomRepositoryLib.Home;
import Build_01_com.vtiger.comcastPomRepositoryLib.InByOrganizationName;

@Listeners(com.vtiger.comcast.genericUtility.LisImpClass.class)
public class createOrganiztionTest extends BaseClass {
	@Test /* (groups={"CrossBrowserTesting"}) */
	public void createOrganizationTest() throws Throwable {

		Home home = new Home(driver);
		home.getOrganizationsPage().click();
		home.filterOperation();

		FilterByNewThisWeek filter = new FilterByNewThisWeek(driver);
		filter.getFilter().click();
		Thread.sleep(5000);

		FilterByProspectAccounts fps = new FilterByProspectAccounts(driver);
		fps.getProspectAccounts().click();
		fps.prspectName();

		InByOrganizationName InByOrg = new InByOrganizationName(driver);
		InByOrg.getOrganizationName().click();
		Assert.assertTrue(false);
		System.out.println("Hello");

		
		/*
		 * driver.get("https://www.google.com/"); String exp = "Goog"; String axp =
		 * driver.getTitle(); System.out.println(axp);
		 * 
		 * 
		 * SoftAssert s = new SoftAssert(); s.assertEquals(axp, exp);
		 * 
		 * Assert.assertEquals(axp, exp); System.out.println("111111");
		 */

	}
	/*
	 * @Test public void createOrganizationTest1() throws Throwable { Home home=new
	 * Home(driver); home.getOrganizationsPage().click(); home.filterOperation();
	 * 
	 * FilterByNewThisWeek filter=new FilterByNewThisWeek(driver);
	 * filter.getFilter().click(); Thread.sleep(5000);
	 * 
	 * FilterByProspectAccounts fps=new FilterByProspectAccounts(driver);
	 * fps.getProspectAccounts().click(); fps.prspectName();
	 * 
	 * InByOrganizationName InByOrg=new InByOrganizationName(driver);
	 * InByOrg.getOrganizationName().click();
	 * 
	 * }
	 * 
	 * @Test public void createOrganizationTest3() throws Throwable { Home home=new
	 * Home(driver); home.getOrganizationsPage().click(); home.filterOperation();
	 * 
	 * FilterByNewThisWeek filter=new FilterByNewThisWeek(driver);
	 * filter.getFilter().click(); Thread.sleep(5000);
	 * 
	 * FilterByProspectAccounts fps=new FilterByProspectAccounts(driver);
	 * fps.getProspectAccounts().click(); fps.prspectName();
	 * 
	 * InByOrganizationName InByOrg=new InByOrganizationName(driver);
	 * InByOrg.getOrganizationName().click();
	 * 
	 * }
	 */
}
