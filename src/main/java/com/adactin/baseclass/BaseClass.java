package com.adactin.baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;


	public static WebDriver browserChoice(String browser ) {
		if (browser.equalsIgnoreCase("chrome"))
		{
             WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		else  
		{
			System.out.println("Sorry Please do the respective interation with driver");
		}
		return driver;
	}

	
	public static String urlLoad (String url)
	{
		driver.get("https://adactinhotelapp.com");
		return url;
	}
// to sendvalue
	
	public static void inputvalue(WebElement element, String text) 
		{
			element.sendKeys(text);
		}
//click
	
	public static void click(WebElement element) 
	{
            element.click();
	}

	

	public static WebDriver getBrowser(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}



