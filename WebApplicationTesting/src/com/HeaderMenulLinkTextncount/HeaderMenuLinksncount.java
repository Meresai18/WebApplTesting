package com.HeaderMenulLinkTextncount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeaderMenuLinksncount 
{
	FirefoxDriver driver;
	@BeforeTest
public void setup()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.luxuryretreats.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Headervalidation()
	{
		WebElement HeaderBlock = driver.findElement(By.className("menu"));
		List <WebElement>HeaderLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(HeaderLinks.size());
		
		for (int i=0;i<HeaderLinks.size();i++)
		{
			System.out.println(HeaderLinks.get(i).getText());
			
			HeaderLinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(5);
			
		HeaderBlock = driver.findElement(By.className("menu"));
			HeaderLinks = driver.findElements(By.tagName("a"));
			
	  }
	}
		
		 @AfterTest
	     public void tearDown()
	     
	     {
	    	 driver.close();
	     }
	     
	}
		

	



