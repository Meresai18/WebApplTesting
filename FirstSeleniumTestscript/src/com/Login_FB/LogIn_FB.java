package com.Login_FB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn_FB {

	public static void main(String[] args) {
		
		WebElement Element;
		WebElement  password;
		// TODO Auto-generated method stub
		
		//1. Launching FB Application
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https:/facebook.com");
		
		//2. 
		
		Element =driver.findElement(By.xpath("//input[@id='email']"));
        Element.sendKeys("");

        
        password  =driver.findElement(By.xpath("\"//input[@type='password']"));
        password.sendKeys("");
        
        
        //driver.findElement(By.id("Email")).sendKeys("test@test.com");

//driver.close();
			

	}

}
