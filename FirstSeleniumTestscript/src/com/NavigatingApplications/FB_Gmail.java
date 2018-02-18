package com.NavigatingApplications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Gmail {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		
		String CurrentUrl1=driver.getCurrentUrl();
		System.out.println(CurrentUrl1);
		String Title1=driver.getTitle();
				System.out.println(Title1);
		
		
		//Navigating Gmail browser//
		driver.navigate().to("https://gmail.com");
		String Title2=driver.getTitle();
		System.out.println(Title2);
		
		String CurrentUrl2=driver.getCurrentUrl();
		System.out.println(CurrentUrl2);
		driver.close();
		
	}

}

