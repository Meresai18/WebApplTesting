package com.HeaderBlock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HeaderBlock_Bing {

	public static void main(String[] args)
	{
		FirefoxDriver driver  = new FirefoxDriver();
		
		driver.get("http://www.bing.com/");
WebElement HeaderBlock = driver.findElement(By.id("sc_hdu"));
List <WebElement> HeaderLinks=HeaderBlock.findElements(By.tagName("a"));

System.out.println(HeaderLinks.size());
for(int a=0;a<HeaderLinks.size();a++) 
{
	System.out.println(HeaderLinks.get(a).getText());	
	
	HeaderLinks.get(a).click();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	
	driver.navigate().back();
	
	Sleeper.sleepTightInSeconds(5);
	
	HeaderBlock = driver.findElement(By.id("sc_hdu"));
	HeaderLinks=HeaderBlock.findElements(By.tagName("a"));

	}

 }
}
