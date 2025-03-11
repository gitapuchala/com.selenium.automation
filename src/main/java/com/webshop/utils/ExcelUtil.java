package com.webshop.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil 
{
	FileInputStream fis;
	XSSFWorkbook wb;
	
	public ExcelUtil(String excelpath)
	{

		try
		{
			File src = new File(excelpath);
			 fis = new FileInputStream(src);
			 wb = new XSSFWorkbook(fis);
	}
		catch(Exception e)
		{
			
			e.printStackTrace();
			System.out.println("throw excel not found error");
		}
	}
	//method to get total no of rows count in a sheet using sheet index.
		public int getrowcount(int sheetno)
		{
			int count=wb.getSheetAt(sheetno).getLastRowNum()+1;
			return count;
		}
		//method to get total no of rows count in a sheet using sheet name.
		public int getrowcount(String sheetname)
		{
			return wb.getSheet(sheetname).getLastRowNum()+1;
			
		}
		//method to print row in a sheet using sheet index.
		public String getcelldata(int sheetno,int row,int cell)
		{
			String data=wb.getSheetAt(sheetno).getRow(row).getCell(cell).toString();
			return data;
		}
		//method to print row in a sheet using sheet name.
		public String getcelldata(String sheetname,int row,int cell)
		{
			String data=wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
			return data;
		}
		
}

