package PractiseVtigerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.javaUtility;
import com.vtiger.comcast.genericUtility.webDriverUtility;

public class VtigerRunModule 
{
	@Test
	public void OrganizationByNewThisWeek() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriverUtility wb=new webDriverUtility();
		wb.waitUntilPageLoad(driver);
		driver.get("http://localhost:8888/");
	
		Login login=new Login(driver);
		login.LoginToApp("admin", "admin");
	
		Calendar cal=new Calendar(driver);
		cal.getCalendarLink().click();
		cal.Meeting();
		
		Leads lead=new Leads(driver);
		lead.getLeadsLink().click();
		
		lead.createLead("Binu", "Bhai", "TYSS");
		
		Organization org=new Organization(driver);
		org.getOrganizationsPage().click();
		org.CreateOrga("QSPIDER");

		Thread.sleep(5000);
		Contacts cont=new Contacts(driver);
		cont.getContactsLink().click();
		cont.CreateContact();
		
		Opportunities oppo=new Opportunities(driver);
		oppo.getOpportunitiesLink().click();
		oppo.createOpportunities("jobProfile");
		
		Products pro=new Products(driver);
		pro.getProductsLink().click();
		
		Documents doc=new Documents(driver);
		doc.getDocumentsLink().click();
		
		Email email=new Email(driver);
		email.getEmailLink().click();
		
		TroubleTickets tk=new TroubleTickets(driver);
		tk.getTroubleTicketsLink().click();
		
		Dashboard das=new Dashboard(driver);
		das.getDashboardLink().click();
	
		
	}
}
