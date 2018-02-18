package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTesting 
{

	
	@Test
	public void HomePageTesting()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours Usha = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		Usha.Register();
		driver.navigate().back();
		
		Usha.Support();
		driver.navigate().back();
		
		Usha.Contact();
		driver.navigate().back();
		
		Usha.LogInTest("tutorial", "tutorial");
		
		Usha.Home();
		
		Usha.Flights();
		driver.navigate().back();
		
		Usha.Hotels();
		driver.navigate().back();
		
		Usha.CarRentals();
		driver.navigate().back();
		
		Usha.Destinations();
		driver.navigate().back();
		
		Usha.Vacations();
		driver.navigate().back();
		
		driver.close();
		
		
		
		
	}
	
}
