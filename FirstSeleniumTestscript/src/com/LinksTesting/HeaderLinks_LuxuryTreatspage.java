package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HeaderLinks_LuxuryTreatspage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.luxuryretreats.com/");
		driver.manage().window().maximize();
		
		WebElement HM = driver.findElement(By.xpath(".//*[@id='headerMenu']/div[2]"));
		List<WebElement> HL=driver.findElements(By.tagName("a"));
		
		System.out.println(HL.size());
		
		for(int i=0;i<HL.size();i++)
		{
			System.out.println(HL.get(i).getText());
			
	HL.get(i).click();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	
	driver.navigate().back();
	
	Sleeper.sleepTightInSeconds(5);
	}
				
	//HM = driver.findElement(By.xpath(".//*[@id='headerMenu']/div[2]"));
	//HL=driver.findElements(By.tagName("a"));

	}

}
