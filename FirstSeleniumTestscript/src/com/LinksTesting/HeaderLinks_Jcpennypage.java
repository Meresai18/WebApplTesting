package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HeaderLinks_Jcpennypage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://jobs.jcp.com/");
		driver.manage().window().maximize();
		
        WebElement HeaderMenu=driver.findElement(By.className("navbar"));
        List<WebElement> HeaderLink= HeaderMenu.findElements(By.tagName("a"));
        
        System.out.println(HeaderLink.size());
        
        for(int i=0;i<HeaderLink.size();i++)
        {
        	System.out.println(HeaderLink.get(i).getText());
        	HeaderLink.get(i).click();
        	
             	System.out.println(driver.getTitle());
             	System.out.println(driver.getCurrentUrl());
             	System.out.println();
             	
             	driver.navigate().back();
             	
             	Sleeper.sleepTightInSeconds(5);
             	
             	HeaderMenu=driver.findElement(By.id("navbar"));
             	HeaderLink= HeaderMenu.findElements(By.tagName("a"));
             	
          }   
        
        driver.close();
        }
        
        
        
	

}

