package newToursApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class newToursLogInTest 
{
	FirefoxDriver driver;

	@Given("^Open Firefox Browser and Navigate to NewTours Application$")
	public void Open_Firefox_Browser_and_Navigate_to_NewTours_Application() throws Throwable 
	{
	    driver = new FirefoxDriver();
	    driver.navigate().to("http://newtours.demoaut.com");
	}

	@When("^User enters Valid UserName and Password and click on SignIn button$")
	public void User_enters_Valid_UserName_and_Password_and_click_on_SignIn_button() throws Throwable 
	{
	   driver.findElement(By.name("userName")).sendKeys("tutorial");
	   driver.findElement(By.name("password")).sendKeys("tutorial");
	   driver.findElement(By.name("login")).click();
	}

	@Then("^User should be abe to logIn Successfully and close the Applciation$")
	public void User_should_be_abe_to_logIn_Successfully_and_close_the_Applciation() throws Throwable
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	   driver.close();
	}
}
