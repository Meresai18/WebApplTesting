package com.NavigateGoogleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSignIn_Validations {

	public static void main(String[] args) {
		
		//1. Launching Firefox application//
		FirefoxDriver driver = new FirefoxDriver();
		
		//2. Launching google application//
		driver.navigate().to("https://www.google.com/");
		
		//3. Validating 'Sign in" link using linkText locator//
		
		driver.findElement(By.linkText("Sign in")).click();
		
		//4. Validating 'Google Sign in url validations//
		// Homework for 12/14//
		
		String ExpectedUrl = "google.com";
		String ActualUrl = driver.getCurrentUrl();
		
		if(ActualUrl.contains (ExpectedUrl))
		{
			System.out.println(ActualUrl);
			System.out.println("Test Passed");
		}
		
		else 
		{
		System.out.println("Test Failed");
		}
		// 5. Validating 'Sign in" link using ClassName locator//
		//driver.findElement(By.className("gb_Vf gb_Fa gb_Db")).click();
		
		// 6. Validating 'Sing in" link using By_id locator//

		//driver.findElement(By.id("gb_70")).click();
		
			
		driver.close();
	}

}
