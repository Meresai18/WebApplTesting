package com.ValidatingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingUrl_FB {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		
		
		String ExpectedUrl="facebook.com";
		String ActualUrl=driver.getCurrentUrl();
		
		System.out.println(ExpectedUrl);
		System.out.println(ActualUrl);
		
		//if(ActualUrl.equals ExpectedUrl
		if(ActualUrl.contains (ExpectedUrl))
		{
			
		System.out.println("Test Passed - Acutals meet Expected criteria");
		
				}
		
		else
		{
			System.out.println("Test Failed - Actuals Failed to meet the Expected Criteria");
			
		}
		
		driver.close();
		}
			
		

	}


