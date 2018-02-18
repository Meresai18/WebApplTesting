package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandingNewToursUser_RegistrationAlert

{
	FirefoxDriver driver;
	
  @BeforeTest
  
  public void NewToursApplicationLLaunchLogin()
  {
  driver= new FirefoxDriver();
  driver.get("http://newtours.demoaut.com");
  	  
  }
  
  @Test(priority=1)
  public void Register()
  
  {
	 driver.findElement(By.linkText("REGISTER")).click();
	 
  }
  
  @Test(priority=2)
  public void NewUserRegistration()
  {
	  driver.findElement(By.name("firstName")).sendKeys("Hiii");
	  driver.findElement(By.name("lastName")).sendKeys("Hi");
	  driver.findElement(By.name("phone")).sendKeys("999999");
  }
  }
