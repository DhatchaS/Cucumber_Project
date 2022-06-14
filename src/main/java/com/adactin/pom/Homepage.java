package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import net.jodah.failsafe.internal.util.Assert;

public class Homepage {
	
WebDriver driver1;
private WebDriver driver;
private Homepage page1;
	
	public Homepage (WebDriver driver) {
		
		this.driver1= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "username") private static WebElement username;

	public static WebElement getUsername() {
		return username;
	}
	
	@FindBy (id = "password") private static WebElement password;

	public static WebElement getPassword() {
		return password;
	}
	
	@FindBy (id = "login") private static WebElement login;

	public static WebElement getLogin() {
		return login;
	}
}

	
	
/*
 * @Then("check user is move to homepage") public void
 * check_user_is_move_to_homepage() { page1= new Homepage(driver); boolean
 * displayed = Page.getUsername_show().isDisplayed(); Assert.assertEquals(true,
 * displayed);
 * 
 * }
 */
	
	
	

	

