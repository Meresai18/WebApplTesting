package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class BingHeaderLinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.bing.com/");
		
		WebElement HC = driver.findElement(By.xpath(".//*[@id='sc_hdu']"));
		List<WebElement>HeaderLinks=HC.findElements(By.tagName("a"));
		
	
		
		for (int i=0;i<HeaderLinks.size();i++)
		{
			System.out.println(HeaderLinks.get(i).getText());
			
		}
		
		driver.close();
	  }
	}
			
			//HeaderLinks.get(i).click();
			
			//System.out.println(driver.getTitle());
			//System.out.println(driver.getCurrentUrl());
			//System.out.println();
			
			//driver.navigate().back();
			
			//Sleeper.sleepTightInSeconds(5);
			
			
	//HC = driver.findElement(By.xpath(".//*[@id='sc_hdu']"));
			//HeaderLinks=driver.findElements(By.tagName("a"));
			
		//}
		
		



