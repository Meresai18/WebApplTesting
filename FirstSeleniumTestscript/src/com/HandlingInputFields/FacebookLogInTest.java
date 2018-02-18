package com.HandlingInputFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Usha");
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("abc123");
		
		driver.findElementByName("firstname").sendKeys("FirstName");
		
		
		

	}

}
