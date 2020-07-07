package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	WebDriver driver;
	 
	@Given("^launch URL$")
	public void launch_URL() throws Throwable {
	   
         System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
         driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
         driver.get("https://www.dell.com/en-us");
         
	} 

	@Then("^enter XPS in serach field$")
	public void enter_XPS_in_serach_field() throws Throwable {
		driver.findElement(By.xpath("//input[@class='mh-search-input']")).sendKeys("XPS");
	    
	}

	@Then("^click on search link$")
	public void click_on_search_link() throws Throwable {
	   driver.findElement(By.xpath("//span[@class='mh-search-button-label']")).click();
	}
	
	@Then("^click on cart$")
	public void click_on_cart () throws Throwable { 
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
	}
	
	
	}
	

