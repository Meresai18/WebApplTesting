package com.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDynamicWebTable {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++) // TR
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td")); // all the Td's of TR
			
			for(int k=0;k<cols.size();k++) // TD
			{
				String data=cols.get(k).getText(); // getting the string value of Every TR of TD
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
		driver.close();
		
		
		

	}

}
