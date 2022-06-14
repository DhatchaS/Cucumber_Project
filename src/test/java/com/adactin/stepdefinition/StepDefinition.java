package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.Homepage;
import com.adactin.runner.RunnerClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass {
	public static WebDriver driver=RunnerClass.driver;
	
	@Before
	public void beforeBooks(Scenario scenario)
	{
		String name = scenario.getName();
		System.out.println("ScenarioName :"+name);
		
	}
	@After
	public void afterBooks(Scenario scenario)
	{
		io.cucumber.java.Status status = scenario.getStatus();
		System.out.println("scenario status : +status");
		if (scenario.isFailed())
		{
			screenshot(scenario.getName());	
			
			
		}
	}
	
	
	
	private void screenshot(String name) {
		// TODO Auto-generated method stub
		
	}
	@Given("user lanch the browser")
	public void user_lanch_the_browser() {
      urlLoad("https://adactinhotelapp.com/");
      }

	@When("User Enter the {string} in the username field")
	public void user_enter_the_in_the_username_field(String string) {
	    Homepage hp = new Homepage (driver);
	    inputvalue(hp.getUsername(),string);
	}

	@When("user enter the {string} in the password field")
	public void user_enter_the_in_the_password_field(String string) {
		Homepage hp = new Homepage (driver);
	    inputvalue(hp.getPassword(),string);
  

	}
	@When("User clks the login button")
	public void user_clks_the_login_button() {
		Homepage hp = new Homepage (driver);
		click(hp.getLogin());


	}

	@Then("user validate the search button")
	public void user_validate_the_search_button() {
	    

	}

	
	
	
}

