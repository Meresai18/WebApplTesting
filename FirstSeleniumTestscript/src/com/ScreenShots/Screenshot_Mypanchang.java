package com.ScreenShots;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screenshot_Mypanchang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.infinitecampus.com/");
		
		driver.manage().window().maximize();
		
		WebElement HeaderBlock = driver.findElement(By.xpath(".//*[@id='career_site_home_page']/header"));
		
		List <WebElement> HeaderLinks = HeaderBlock.findElements(By.tagName("a"));
		System.out.println(HeaderLinks.size());
		
		for (int i=0; i<HeaderLinks.size(); i++)
		{
			System.out.println(HeaderLinks.get(i).getText());
			String LinkName = HeaderLinks.get(i).getText();
			HeaderLinks.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			//Sleeper.sleepTight(10);
			
			HeaderBlock = driver.findElement(By.xpath(".//*[@id='career_site_home_page']/header"));
			HeaderLinks= HeaderBlock.findElements(By.tagName("a"));
		} 
		
		driver.close();
	}
}