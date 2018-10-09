package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.configuration.ProjectConfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends ProjectConfiguration {

	public void loginURL(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println(domainLoader.getProperty("Base_URL"));
		driver.navigate().to(domainLoader.getProperty("base"));
	}
}
