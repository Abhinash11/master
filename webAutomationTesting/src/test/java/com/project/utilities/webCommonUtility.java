package com.project.utilities;

import org.openqa.selenium.WebElement;

public class webCommonUtility {
	
public boolean isPresent(WebElement element){
	boolean elementFound = false;
	try{
		elementFound = element.isDisplayed();
	}catch(Exception e){
	}
	return elementFound;
}
}
