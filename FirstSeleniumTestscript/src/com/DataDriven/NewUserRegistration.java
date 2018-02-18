package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewUserRegistration
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=2)
	public void UserRegistration_ContactInfo()
	{
		
		driver.findElement(By.name("firstName")).sendKeys("Usha");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("77777777");
		driver.findElement(By.id("userName")).sendKeys("usha@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("HiTech City");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("50001");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("Ushaaa");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc13");
		
		driver.findElement(By.name("register")).click();
		
		
		String ExpectedUserName="Ushaaa";
		
		String ActualUserNameText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(ActualUserNameText);
		
		if(ActualUserNameText.contains(ExpectedUserName))
		{
			System.out.println("User Registred Successfully -- PASS");
		}
		else
		{
			System.out.println("User Registration Failed -- FAIL");
		}
		
				
	}
	
	@Test(priority=3)
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
