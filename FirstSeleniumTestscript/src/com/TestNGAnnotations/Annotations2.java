package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{

	@BeforeTest
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("THis will launch the Browser and LogIN");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("THis is used to test InBox Functionality");
	}
	
	@Test(priority=3)
	public void Compose()
	{
		System.out.println("THis is used to test compose mail Functionality");
	}
	
	@Test(priority=2)
	public void SentMail()
	{
		System.out.println("THis is used to test Sent mail Functionality");
	}
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("This is used to close the Application");
	}
	
}
