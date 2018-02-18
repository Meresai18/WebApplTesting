package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours
{
	// WebElement register=driver.findElement(by.linkText("REGISTER"));
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement contact;
	
	public void Contact()
	{
		contact.click();
	}
	
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement Pwd;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	
	public void LogInTest(String UName,String Password)
	{
		userName.sendKeys(UName);
		Pwd.sendKeys(Password);
		SignIn.click();
	}
	
	@FindBy(linkText="Home")
	WebElement Home;
	
	public void Home()
	{
		Home.click();
	}
	
	@FindBy(linkText="Flights")
	WebElement Flights;
	
	public void Flights()
	{
		Flights.click();
	}
	
	@FindBy(linkText="Hotels")
			WebElement Hotels;
	
	public void Hotels()
	{
	  Hotels.click();
	} 
	
	@FindBy(linkText="Car Rentals")
	WebElement CarRentals;
	  	
	 public void CarRentals() 
	  	{
	  		CarRentals.click();
	  	}
	
	@FindBy(linkText="Destinations")
	WebElement Destinations;
	public void Destinations()
	{
		Destinations.click();
	}
	
	@FindBy(linkText="Vacations")
	WebElement Vacations;
	public void Vacations()
	{
		Vacations.click();
		
		
	
	}
	
	
	
	
	
	
	
	
}
