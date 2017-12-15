package com.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Script {
	WebDriver driver;
	@Given("^Admin Navigat to HRM Login page$")
	public void admin_Navigat_to_HRM_Login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubeldm\\Documents\\workspace_driver\\chromedriver2.33.exe");
	driver=new ChromeDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	
	driver.manage().window().maximize();
	 
	}

	@When("^Admin Enter valid user name and password$")
	public void admin_Enter_valid_user_name_and_password() throws Throwable {
	   
	}

	@When("^click on LOGIN Button$")
	public void click_on_LOGIN_Button() throws Throwable {
	  
	}

	@Then("^Admin will Landen in Admin HomePage$")
	public void admin_will_Landen_in_Admin_HomePage() throws Throwable {

	}


}//End of class
