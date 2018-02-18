package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest
{
	FirefoxDriver driver;
	
	//ChromeDriver   driver;
	
	@BeforeTest
	public void SetUp()
	{
		
		//System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		//driver.manage().window().maximize();
	}
	
	
	@Test
	public void LogIn() throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\NewTours.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("pwd"))).sendKeys("tutorial");
		driver.findElement(By.xpath(pr.getProperty("LogIn"))).click();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
