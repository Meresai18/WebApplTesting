package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Annotations3
{

	
	@BeforeMethod
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("THis will launch the Browser and LogIN");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("THis is used to test InBox Functionality");
	}
	
	@Test(priority=2)
	public void Compose()
	{
		System.out.println("THis is used to test compose mail Functionality");
	}
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("This is used to close the Application");
	}
	
}
