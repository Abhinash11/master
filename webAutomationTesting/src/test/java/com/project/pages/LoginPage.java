package com.project.pages;

import org.openqa.selenium.WebDriver;

import com.project.configuration.ProjectConfiguration;

public class LoginPage extends ProjectConfiguration {

	WebDriver driver;
	
	public void loginURL(){
		
		System.out.println(domainLoader.getProperty("Base_URL"));
		driver.navigate().to(domainLoader.getProperty("Base_URL"));
	}
}
