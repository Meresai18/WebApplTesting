package com.ScreenShots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screenshot_Yahoo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.yahoo.com/");
		
		WebElement MegaBlock = driver.findElement(By.id("mega-bottombar"));
List<WebElement> HeaderLinks = MegaBlock.findElements(By.tagName("a"));
	System.out.println(HeaderLinks.size());
	
	for (int i=0; i <HeaderLinks.size(); i++)
	{
		System.out.println(HeaderLinks.get(i).getText());
		String LinkName = HeaderLinks.get(i).getText();
		
		HeaderLinks.get(i).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		Thread.sleep(5);
		//Sleeper.sleepTightInSeconds(5);
		MegaBlock = driver.findElement(By.id("mega-bottombar"));
		HeaderLinks = MegaBlock.findElements(By.tagName("a"));
			
	}
	//driver.close();
	}

}
