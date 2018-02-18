package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown_CountryNames {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement CountryDropDown=driver.findElement(By.name("country"));
		
		List<WebElement>CountryName=CountryDropDown.findElements(By.tagName("option"));
		
		System.out.println(CountryName.size());
		
		driver.close();
		

	}

}
