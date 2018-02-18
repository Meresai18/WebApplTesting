package com.MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Men_FormalShirts {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://myntra.com");
		
		WebElement Men = driver.findElement(By.linkText("Men"));
		
		Actions Act = new Actions(driver);
		Act.moveToElement(Men).perform();
		
		driver.findElementByLinkText("Formal Shirts").click();
		
		WebElement Kids = driver.findElementByLinkText("Kids");
		Actions Act1 = new Actions(driver);
		Act1.moveToElement(Kids).perform();
		
		driver.findElementByLinkText("Dresses").click();
		
				
		driver.close();
		
		
		
	}

}
