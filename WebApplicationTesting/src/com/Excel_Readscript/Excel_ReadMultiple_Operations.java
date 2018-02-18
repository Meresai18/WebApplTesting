package com.Excel_Readscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadMultiple_Operations {

	public static void main(String[] args) throws IOException {
		
		FileInputStream File = new FileInputStream ("C:\\Users\\NewUser\\Desktop\\Doc's\\Practice TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook (File);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
	int Rowcount = sheet.getLastRowNum();
	
	for (int a=0; a<=Rowcount;a++)
	{
		Row r= sheet.getRow(a);
		int Cellcount = r.getLastCellNum();
		
		for (int b=0; b<Cellcount; b++)
		{
			Cell c = r.getCell(b);
		String Data = c.getStringCellValue();
		System.out.print(Data+"     ");
			
		}
		System.out.println();
				

	}

 }
	
	
   }
