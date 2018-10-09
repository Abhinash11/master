package com.project.test;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;

import com.project.pages.LoginPage;

public class LoginTest {
	
	
	static Logger log = Logger.getLogger(LoginTest.class);
	
	LoginPage loginPage = new LoginPage();
	
	@BeforeTest
	public void navigateToUrl(){
		System.out.println("I am here");
		//log.info("----Before navigating to URL-----");
		loginPage.loginURL();
	}
}
