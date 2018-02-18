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
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ScreenShot_Links_TSRTC {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver =new FirefoxDriver();

		driver.navigate().to("http://www.tsrtconline.in/oprs-web/");

		/*List<WebElement>  Links = driver.findElements(By.tagName("a"));
System.out.println(Links.size());

for (int i =0; i<Links.size(); i++)
{
	System.out.println(Links.get(i).getText());
}*/

		WebElement HeaderBlock = driver.findElement(By.className("menu-wrap"));
List<WebElement> HeaderLinks = HeaderBlock.findElements(By.tagName("a"));
System.out.println(HeaderLinks.size());

for (int i=0;i<HeaderLinks.size();i++)
{
	System.out.println(HeaderLinks.get(i).getText());
	String linkName=HeaderLinks.get(i).getText();


//HeaderBlock.get(i).click();
	
HeaderLinks.get(i).click();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();

	//File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(Source, new File("C:\\Users\\NewUser\\Desktop\\UshaSelenium\\FirstSeleniumTestscript\\ScreenShots\\"+linkName+".png"));

driver.navigate().back();
Sleeper.sleepTightInSeconds(5);

HeaderBlock = driver.findElement(By.className("menu-wrap"));
HeaderLinks = HeaderBlock.findElements(By.tagName("a"));

	}

driver.close();

	}

	
	}
