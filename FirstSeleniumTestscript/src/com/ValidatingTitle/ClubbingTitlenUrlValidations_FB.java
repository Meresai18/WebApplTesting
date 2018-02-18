package com.ValidatingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClubbingTitlenUrlValidations_FB{
public static void main(String[] args) {
	
	 //1.Launching the browser//
	 WebDriver driver = new FirefoxDriver();
	 
	 //2. Accessing web page
	 driver.navigate().to("https://facebook.com");
	 
	 
	 //3. Validating Title Facebook//
	 String ExpectedTitle = "Facebook - Log In or Sign Up";
	 String ActualTitle = driver.getTitle();
	 
	 //4. Prints out the below statements in the console//
	 	System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
	 
	 //5. Comparing the actual title with expected title//
	 
	 if (ActualTitle.contains(ExpectedTitle))
	 {
	 System.out.println("Test Passed - ActualsTitle meet ExpectedTitle requisite");
	}
	 else
	 {
	 System.out.println("Test Failed - ActualsTitle didn't meet ExpectedTitle requisite");
	 }		
	 //6. Validating FB URL //
	 
     String  ExpectedUrl = "facebook.com";
     String  ActualUrl	= driver.getCurrentUrl();
     
     //7/ Prints out the below Url statements in the console//
     
     System.out.println(ExpectedUrl);
     System.out.println(ActualUrl);
     
     
     //8. Comparing the ActualUrl with ExpectedUrl//
     
     if (ActualUrl.contains(ExpectedUrl))
    
     {
    	 System.out.println("Test Passed - ActualUrl meet the ExpectedUrl requisite");
    	 
    	 
     }
     
     else
    
     {
	
    	 System.out.println("Test Failed - AcutalUrl didn't meet the ExpectedUrl requisite");
    	 
	 }
	 
	driver.close();
	
	}
}






	

	 
	
	
 
	 
	
	


