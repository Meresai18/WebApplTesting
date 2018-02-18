package com.ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ScreenShot_Costco {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		
		Thread.sleep(5000);
		
		//Sleeper.sleepTightInSeconds(10);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\NewUser\\Desktop\\bing1.png"));
		
		driver.close();

	}

}
