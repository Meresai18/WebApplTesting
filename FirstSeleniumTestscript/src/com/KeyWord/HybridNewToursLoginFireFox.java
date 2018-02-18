package com.KeyWord;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HybridNewToursLoginFireFox 
{
	
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
    
	@Test
    public void Login() throws IOException
    {
        FileInputStream File = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\src\\com\\ExcelTestDataFiles\\NewToursLoginData.xlsx");
        Properties Pr = new Properties();
        Pr.load(File);
        
        FileInputStream File1 = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\src\\com\\ExcelTestDataFiles\\NewToursLoginData.xlsx");
    	XSSFWorkbook Workbook = new XSSFWorkbook(File1);
    	XSSFSheet sheet = Workbook.getSheet("Sheet1");
    	
    	int	RowCount=sheet.getLastRowNum();
    	for(int a=1;a<=RowCount;a++)
    	{	
    	Row r=sheet.getRow(a);
    	Workbook.close();
    	driver.findElement(By.name(Pr.getProperty("UName"))).sendKeys(r.getCell(0).getStringCellValue());
    	driver.findElement(By.name(Pr.getProperty("pwd"))).sendKeys(r.getCell(1).getStringCellValue());
        driver.findElement(By.name(Pr.getProperty("LogIn"))).click();
    	
    	System.out.println(driver.getTitle());
    	System.out.println(driver.getCurrentUrl());
    	
    	}
    	
    }
    	@AfterTest
		public void tearDown()
		{
			driver.close();
		}
		
    
    }


    
    
    	
    
    		


    