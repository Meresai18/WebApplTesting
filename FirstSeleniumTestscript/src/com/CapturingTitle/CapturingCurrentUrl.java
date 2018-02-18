package com.CapturingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
//driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
driver.close();
		}

}
