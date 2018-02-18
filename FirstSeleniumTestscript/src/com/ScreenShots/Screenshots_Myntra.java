package com.ScreenShots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screenshots_Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.navigate().to("https://www.myntra.com/");

//WebElement HeaderBlock = driver.findElement(By.className("application-base"));
//desktop-header-cnt

WebElement HeaderBlock = driver.findElement(By.id("desktop-header-cnt"));
List <WebElement> HeaderLinks = HeaderBlock.findElements(By.tagName("a"));

System.out.println(HeaderLinks.size());
for (int i=0;i<HeaderLinks.size();i++)
{

System.out.println(HeaderLinks.get(i).getText());
String linkName =  HeaderLinks.get(i).getText();

HeaderLinks.get(i).click();

System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println();

driver.navigate().back();
Sleeper.sleepTightInSeconds(5);

//HeaderBlock= driver.findElement(By.className("application-base"));
 HeaderBlock = driver.findElement(By.id("desktop-header-cnt"));
HeaderLinks = HeaderBlock.findElements(By.tagName("a"));

}

//driver.close();

	}

}
