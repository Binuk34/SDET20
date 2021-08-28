package com.vtiger.comcast.genericUtility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImpPractice implements ITestListener 
{
	  public void onTestFailure(ITestResult result) 
	  {
		  String testName =result.getMethod().getMethodName();
	  
	  EventFiringWebDriver ef = new EventFiringWebDriver(Base1.driver); File src =
	  ef.getScreenshotAs(OutputType.FILE); File dst = new
	  File("./screenshot/google1.png"); src.renameTo(dst);
	  
	  }
	 
	

}
