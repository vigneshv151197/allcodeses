package com.runner;

import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\v802\\eclipse-workspace\\Two_Wheeler_CF\\src\\test\\java\\com\\feature\\Home.feature", 
                  glue = "com.stepdefinition")

public class runner {

		
		public static WebDriver driver;

		@BeforeClass
		public static void setUp() {
			driver = Baseclass.getDriver("chrome");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}
	}
	

