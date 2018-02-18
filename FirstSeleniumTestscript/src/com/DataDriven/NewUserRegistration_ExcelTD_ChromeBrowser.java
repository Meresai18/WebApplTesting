package com.DataDriven;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class NewUserRegistration_ExcelTD_ChromeBrowser {

	public static void main(String[] args) throws IOException {
				
		ChromeDriver driver;
		//FirefoxDriver driver;
		
		System.setProperty("webdriver.chromedriver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		FileInputStream file = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\src\\com\\ExcelTestDataFiles\\UserRegistrationTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
int	RowCount=sheet.getLastRowNum();
		
		for(int a=1;a<=RowCount;a++)
		{	
		Row r=sheet.getRow(a);
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String PhoneNumber=Long.toString(x);
		
		driver.findElement(By.name("phone")).sendKeys(PhoneNumber);
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		
		double p=r.getCell(7).getNumericCellValue();
		long y=(long)p;
		String PostalCode=Long.toString(y);
		
		driver.findElement(By.name("postalCode")).sendKeys(PostalCode);
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		
		driver.findElement(By.name("register")).click();
		
		
		String ExpectedUserName=r.getCell(9).getStringCellValue();
		System.out.println(ExpectedUserName);
		
		String ActualUserNameText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(ActualUserNameText);
		
		if(ActualUserNameText.contains(ExpectedUserName))
		{
			System.out.println("User Registred Successfully -- PASS ExpectedUserName "+"  "+ExpectedUserName);
			
			r.createCell(12).setCellValue("User Registred Successfully -- PASS ");
			//r.createCell(12).setCellValue(ExpectedUserName   "+ExpectedUserName "   "");
			
			//r.createCell(12).setCellValue("Pass");
						
		}
		else
		{
			System.out.println("User Registration Failed -- FAIL");
			r.createCell(12).setCellValue("User Registration Failed -- FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\src\\com\\TestResultExcelFiles\\UserRegistrationTestData2.xlsx");
		workBook.write(file1);
				
		Sleeper.sleepTightInSeconds(2);
		driver.navigate().back();
		//Sleeper.sleepTightInSeconds(2);
		//workBook.close();
		

		}
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
	driver.close();
			
	}
	
	//driver.findElement(By.linkText("SIGN-OFF")).click();
	//driver.close();
	
	}


