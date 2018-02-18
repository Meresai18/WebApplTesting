package com.ScreenShots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot_Disney {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.disney.com/");
		
		WebElement HeaderBlock=driver.findElement(By.xpath("//*[@id='goc-bar-left']/li[3]/span"));
		
		List<WebElement>links=HeaderBlock.findElements(By.tagName("u"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			String linkName=links.get(i).getText();
			System.out.println(linkName);
		}
		
		driver.close();
	}

}
