package com.vtiger.comcast.genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;

public class javaUtility 
{
	/**
	 * it is used to generate the interger Random number within the range
	 * 
	 * @return intData
	 */
	public int GetRandomNumber()
	{
		Random ranDom=new Random();
		int ranDomNum = ranDom.nextInt(10000);
		return ranDomNum;
		
	}
	/**
	 * it is used to return system current date and time.
	 * @return StringDate
	 */
	public String GetSystemDateAndTime()
	{
		Date date=new Date();
		String systemDate = date.toString();
		 return systemDate;
	}
	/**
	 * it is used to return the current system date and time in yyyy-mm-dd format 
	 * @return string
	 */
	public String GetSystemDateTimeIn_YYYY_DD_MM()
	{
		Date date=new Date();
		String systemDateTime = date.toString();
		System.out.println(systemDateTime);
		String[] arr = systemDateTime.split("");
		
		String DD=arr[2];
		String YYYY=arr[5];
		int MM = date.getMonth()+1;
		
		String finalFormat=YYYY + "-"+MM+ "-"+DD;
		return finalFormat;
	}
	/**
	 * It is used to pass virtual key to OS 
	 * @throws AWTException
	 */
	public void pressVirtualEnterkey() throws AWTException
	{
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
}
