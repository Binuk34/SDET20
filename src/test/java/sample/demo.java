package sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demo
{

	@Test
	public void launch()
	{
		System.out.println("hi");
	}
	
	@BeforeClass
	
	public void launch1()
	{
		System.out.println("bye");
	}
	
	@AfterMethod
	public void launch21()
	{
		System.out.println("bye bye");
	}
	

	

	

}
