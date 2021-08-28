package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExcecutingHardAssertAndSoftAssert
{
	@Test
	public void verification()
	{
		SoftAssert soft=new SoftAssert();
		System.out.println("**** test start***");
		soft.assertAll();
		System.out.println("*****STEP 1*****");
		soft.assertEquals("qspider", "testYantra");
		System.out.println("*****STEP 2*****");
		System.out.println("*****STEP 3*****");
		
	}
	@Test
	public void verification2()
	{
	
		SoftAssert soft=new SoftAssert();
		System.out.println("**** test start***");
		soft.assertAll();
		Assert.assertEquals("binu", "Bhai");
		System.out.println("*****STEP 1*****");
		System.out.println("*****STEP 2*****");
		System.out.println("*****STEP 3*****");
		
	}
	
}
