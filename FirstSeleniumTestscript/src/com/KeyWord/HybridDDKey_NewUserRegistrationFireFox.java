package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HybridDDKey_NewUserRegistrationFireFox
{

	ChromeDriver driver;
	//FirefoxDriver driver;

@BeforeTest
  public void setup()
  {
	
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
  }
@Test(priority=1)
  public void NewtoursDemoLogin() throws IOException
  
 {
	FileInputStream File = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\NewTours.properties");
	Properties Pr = new Properties();
	Pr.load(File);
	
	driver.findElement(By.name(Pr.getProperty("UName"))).sendKeys("tutorial");
	driver.findElement(By.name(Pr.getProperty("pwd"))).sendKeys("tutorial");
	driver.findElement(By.xpath(Pr.getProperty("LogIn"))).click();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
 }
@Test (priority=2)

public void Home() throws IOException
   {
	
	FileInputStream File1 = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\NewTours.properties");
	Properties Pr = new Properties();
	Pr.load(File1);
    driver.findElement(By.linkText(Pr.getProperty("home"))).click();
   }

@Test (priority=3)
public void NURegistration() throws IOException
   {
	FileInputStream File2 = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\NewTours.properties");
	Properties Pr = new Properties();
	Pr.load(File2);
	driver.findElement(By.linkText(Pr.getProperty("register"))).click();
   }

@Test (priority=4)
public void NRRegistrationInfo() throws IOException, Throwable
  {
	FileInputStream File3 = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\src\\com\\ExcelTestDataFiles\\URTestData1.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook (File3);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	
	int	RowCount=sheet.getLastRowNum();
	
	FileInputStream File4 = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\NewTours.properties");
	Properties Pr = new Properties();
	Pr.load(File4);
	
	for(int a=1;a<=RowCount;a++)
	{	
	Row r=sheet.getRow(a);
		
	Thread.sleep(10);
	driver.findElement(By.name(Pr.getProperty("FirstName"))).clear();
	driver.findElement(By.name(Pr.getProperty("FirstName"))).sendKeys(r.getCell(0).getStringCellValue());
	driver.findElement(By.name(Pr.getProperty("LastName"))).clear();
	driver.findElement(By.name(Pr.getProperty("LastName"))).sendKeys(r.getCell(1).getStringCellValue());
	
	double d=r.getCell(2).getNumericCellValue();
	long x=(long)d;
	String PhoneNumber=Long.toString(x);
	
	driver.findElement(By.name(Pr.getProperty("PhoneNumber"))).clear();
	driver.findElement(By.name(Pr.getProperty("PhoneNumber"))).sendKeys(PhoneNumber);
	driver.findElement(By.id(Pr.getProperty("Email"))).clear();
	driver.findElement(By.id(Pr.getProperty("Email"))).sendKeys(r.getCell(3).getStringCellValue());
	driver.findElement(By.name(Pr.getProperty("Address"))).clear();
	driver.findElement(By.name(Pr.getProperty("Address"))).sendKeys(r.getCell(4).getStringCellValue());
	driver.findElement(By.name(Pr.getProperty("City"))).clear();
	driver.findElement(By.name(Pr.getProperty("City"))).sendKeys(r.getCell(5).getStringCellValue());
	driver.findElement(By.name(Pr.getProperty("State"))).clear();
	driver.findElement(By.name(Pr.getProperty("State"))).sendKeys(r.getCell(6).getStringCellValue());
	
	double p=r.getCell(7).getNumericCellValue();
	long y=(long)p;
	String PostalCode=Long.toString(y);
	driver.findElement(By.name(Pr.getProperty("PostalCode"))).clear();
	driver.findElement(By.name(Pr.getProperty("PostalCode"))).sendKeys(PostalCode);
	//driver.findElement(By.name(Pr.getProperty("Country"))).clear();
	driver.findElement(By.name(Pr.getProperty("Country"))).sendKeys(r.getCell(8).getStringCellValue());
	driver.findElement(By.name(Pr.getProperty("UserName"))).clear();
	driver.findElement(By.name(Pr.getProperty("UserName"))).sendKeys(r.getCell(9).getStringCellValue());
	driver.findElement(By.name(Pr.getProperty("Password"))).clear();
	driver.findElement(By.name(Pr.getProperty("Password"))).sendKeys(r.getCell(10).getStringCellValue());
	driver.findElement(By.name(Pr.getProperty("ConfirmPassword"))).clear();
	driver.findElement(By.name(Pr.getProperty("ConfirmPassword"))).sendKeys(r.getCell(11).getStringCellValue());
	
	driver.findElement(By.name(Pr.getProperty("Submit"))).click();
	
	String ExpectedUserName = r.getCell(9).getStringCellValue();
	System.out.println(ExpectedUserName);
	
	String ActualUserNameText = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	System.out.println(ActualUserNameText);
	
	if(ActualUserNameText.contains(ExpectedUserName))
	{
		System.out.println("User Registred Successfully -- PASS ExpectedUserName "+"  "+ExpectedUserName);
		
		r.createCell(13).setCellValue("User Registred Successfully -- PASS ");
		
	}
	else 
	{
		System.out.println("User Registration Failed -- FAIL");
		r.createCell(13).setCellValue("User Registration Failed -- FAIL");
	}
	
	FileOutputStream file5 = new FileOutputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\src\\com\\TestResultExcelFiles\\NewUserTestResultFile1.xlsx");
	workBook.write(file5);
	
	driver.navigate().back();
			
}
	//workBook.close();
  }

@Test(priority=5)
public void SignOff()
{
	driver.findElement(By.linkText("SIGN-OFF")).click();
}

@AfterTest
public void tearDown()
{
	driver.close();
}


	
  }




