package com.DDExcelMultipleSetData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenExcelTestData_Multiple
{

	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
	
	@Test(priority =1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=2)
	public void newuserregistration() throws IOException
	{
	
		FileInputStream File = new FileInputStream("C:\\Users\\NewUser\\Desktop\\Doc's\\UserRegistrationTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(File);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int RowCount= sheet.getLastRowNum();
		for (int a=0; a<=RowCount; a++)
		{
			Row r= sheet.getRow(a);
			
			int CellCount = 0;
			for (int b=0; b<=CellCount;b++)
			{
				Cell c = r.getCell(b);
						String Data = c.getStringCellValue();
						System.out.print(Data+ "     ");
				
			}
			
				System.out.println();	
		}
		   // driver.findElement(By.name("firstName")).sendkeys(r.getCell)
	}
	
	
}


