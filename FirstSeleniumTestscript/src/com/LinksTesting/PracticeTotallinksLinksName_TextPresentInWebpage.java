package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTotallinksLinksName_TextPresentInWebpage {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.costco.com/");
		
		List<WebElement>Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		for(int i=0;i<Links.size();i++)
		{
			
			System.out.println(Links.get(i).getText());
			
		}
				
	}

}
