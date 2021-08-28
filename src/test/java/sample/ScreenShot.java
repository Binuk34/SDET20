package sample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.Base1;
@Listeners(com.vtiger.comcast.genericUtility.ListImpPractice.class)
public class ScreenShot extends Base1 {
	
	@Test
	public void google()
	{
		driver.get("https://www.google.com/");
		String act = driver.getTitle();
		String exp = "Googl";
		
		Assert.assertEquals(act, exp);
		System.out.println("==Done==");
		
	}
	
	

	
	
}
