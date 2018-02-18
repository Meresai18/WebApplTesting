package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingCountryNames {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement CountryDropDown=driver.findElement(By.name("country"));
		
		List<WebElement>CountryNames=CountryDropDown.findElements(By.tagName("option"));
		
		System.out.println(CountryNames.size());
		
		for(int a=0;a<CountryNames.size();a++)
		{
			String CountryName=CountryNames.get(a).getText();
			System.out.println(CountryName);
		}
		driver.close();

	}

}
