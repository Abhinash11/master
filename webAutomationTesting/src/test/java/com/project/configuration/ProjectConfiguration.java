package com.project.configuration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ProjectConfiguration {

	public Properties domainLoader;
	private final String propertyFilePath= "base.properties";
	
	public ProjectConfiguration(){
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			domainLoader = new Properties();
			try {
				domainLoader.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
}
