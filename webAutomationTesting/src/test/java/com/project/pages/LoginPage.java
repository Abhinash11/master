package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.configuration.ProjectConfiguration;

public class LoginPage extends ProjectConfiguration {

	public void loginURL(){
		WebDriver driver = new ChromeDriver();
		System.out.println(domainLoader.getProperty("Base_URL"));
		driver.navigate().to(domainLoader.getProperty("Base_URL"));
	}
}
