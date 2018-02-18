package com.ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot_Google {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.fedex.com/");
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		for(int i=0;i<Links.size();i++)
		{
			System.out.println(Links.get(i).getText());
		}
		
		//Thread.sleep(5000);
		
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C:\\Users\\NewUser\\Desktop\\fedex.png"));

	}

}