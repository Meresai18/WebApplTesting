package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingCompleteTestData {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
	int	RowCount=sheet.getLastRowNum(); // Identifying the count of Rows in the Sheet1
	
		for(int a=0;a<=RowCount;a++) // Rows
		{
			Row r=sheet.getRow(a); // moving to a particular row
			int CellCount=r.getLastCellNum(); // identifying the count of the Cell's with test data
			
			for(int b=0;b<CellCount;b++) // rows of Cells
			{
				Cell c=r.getCell(b); // will identify the Row of the Cell
				
				String Data=c.getStringCellValue(); // getting the data for the respective Row of the Cell
				System.out.print(Data+"   ");
			}
			
			System.out.println();
			
		}
		
		
		
		

	}

}
