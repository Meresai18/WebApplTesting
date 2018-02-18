package com.NavigateGoogleApp;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooApp_Validations {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.navigate().to("https://yahoo.com");
	//driver.navigate().to("https://www.scottrade.com/");
	
	driver.findElement(By.linkText("Mail")).click();
	driver.findElement(By.className("logo")).click();

	driver.findElement(By.className("Fz(14px) Fw(b) C(#4d00ae)")).click();
	driver.findElement(By.linkText("News Home")).click();
	driver.findElement(By.linkText("Home")).click();
	driver.findElement(By.id("yui_3_18_0_4_1513577784615_945")).click();
    driver.findElement(By.id("yui_3_18_0_4_1513577990669_1117")).click();
	//driver.findElement(By.id("uh-logo")).click();
	//driver.findElement(By.className("D(ib) Bgr(nr) logo-datauri W(190px) H(45px) Bgp($twoColLogoPos) Bgz(190px) Bgp($twoColLogoPosSM)!--sm1024 Bgz(90px)!--sm1024 ua-ie7_Bgi($logoImageIe) ua-ie7_Mstart(-185px) ua-ie8_Bgi($logoImageIe) ua-ie9_Bgi($logoImageIe)")).click();
	
	//Accessing Scottrade application//
	//driver.navigate().to("https://www.scottrade.com/");
	//driver.findElement(By.id("moxie")).click();
	//driver.findElement(By.linkText("Contact Us")).click();
	//driver.findElement(By.className("top-link-item")).click();
			
	//driver.findElement(By.id(id))

	}
}

