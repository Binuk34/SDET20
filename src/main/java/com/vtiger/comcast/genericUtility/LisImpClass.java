package com.vtiger.comcast.genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImpClass implements ITestListener
{
	public void OnTestFailure(ITestResult result)
	{
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + "*********execute & i am Listening*****");
		
		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.sDriver);
		File src=eDriver.getScreenshotAs(OutputType.FILE);
		File dest = new File("../SDET20/screenshot/google.png");
		src.renameTo(dest);
		
//		try
//		{
//			FileUtils.copyFile(srcFile, new File("./screenshot/a"+testName+".png"));
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
		
	}
}
