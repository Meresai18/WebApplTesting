package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperation {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row r=sheet.createRow(8); // Creating a Row in the Sheet
		Cell c=r.createCell(5); // creating a cell in the respective Row which is created
		c.setCellValue("Usha"); // sending Value into the Row of the Cell
		
		// Saving the workBook in which the Row and the Cell is created 
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\NewUser\\Desktop\\UshaTestData.xlsx");
		workBook.write(file1);

	}

}
