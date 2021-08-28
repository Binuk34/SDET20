package com.vtiger.comcast.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * it is used to develop using POi library,which used to handle microsoft excel sheet 
 * @author binuk
 *
 */
public class ExcelUtility 
{
	public String getDataFromExcel(String sheetName,int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data/testScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(cellNum).getStringCellValue();
		wb.close();
		return data;
	}
	public int getRowCount(String sheetName) throws Exception
	{
		FileInputStream fis=new FileInputStream("./data/testScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		wb.close();
		return sh.getLastRowNum();
	}
	public void setDataExcel(String sheetName,int rowNum,int cellNum, String data) throws Exception
	{
		FileInputStream fis=new FileInputStream("./data/testScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet	sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel = row.createCell(cellNum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/testScriptData.xlsx");
		wb.write(fos);
		wb.close();
	}
	
}
