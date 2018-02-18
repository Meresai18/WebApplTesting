package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1
{
	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to launch a Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("THis is used to test LogIn Functionality");
	}
	
	@Test(priority=4)
	public void Compose()
	{
		System.out.println("THis is used to tset compose mail Functionality");
	}
	
	@Test(priority=3)
	public void InBox()
	{
		System.out.println("This is used to test InBox Functionality");
	}
}
