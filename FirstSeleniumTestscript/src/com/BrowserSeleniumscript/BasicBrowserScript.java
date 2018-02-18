package com.BrowserSeleniumscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicBrowserScript
{

	public static void main(String[] args)
	{
	WebDriver Sai = new FirefoxDriver();
	Sai.navigate().to("http://www.phptravels.net/");
	
	}

}
