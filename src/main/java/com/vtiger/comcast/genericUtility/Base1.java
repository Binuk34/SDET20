package com.vtiger.comcast.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base1 {
	public static WebDriver driver;
	@BeforeClass
	public void screenshot()
	{
	 driver = new ChromeDriver();
	}

}
