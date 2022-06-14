package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/adactin/feature/adactin.feature", glue="com\\adactin\\stepdefinition",
monochrome = true,
dryRun = false,plugin= {"html:Report/Cucumber.html",
		
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
   

public class RunnerClass {  
    public static WebDriver driver;
    @BeforeClass
    public static void setup()
    {
        driver= BaseClass.browserChoice("chrome");

    }
    @AfterClass
    public static void teardown() {
    	driver.close();
    }
		
	}
  
