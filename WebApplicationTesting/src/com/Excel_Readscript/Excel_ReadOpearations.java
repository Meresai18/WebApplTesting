package com.Excel_Readscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOpearations {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream File = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(File);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row r = sheet.getRow(0);
		Cell c = r.getCell(0);
		String TestData = c.getStringCellValue();
		System.out.println(TestData);
		

	}

}
