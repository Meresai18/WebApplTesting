package com.ValidatingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_FB {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		
		String ExpectedTitle = "Facebook - Log In or Sign Up";
		
		String ActualTitle =driver.getTitle();
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		//if(ActualTitle.equals(ExpectedTitle))
		//{
		//	System.out.println("Test Passed- Actual matched with Expected");
		//}
		
		//else
		//{
			
			//System.out.println("Test Failed - Actuals failed to meet the Expected");
		//}
		//driver.close();
	}

}
