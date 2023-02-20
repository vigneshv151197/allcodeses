package com.Runner;

import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Bassclass.Bassclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\v802\\eclipse-workspace\\Twowheller\\src\\test\\java\\com\\feature", glue = "com.Stepdefinition")

public class runner {

	
		public static WebDriver driver;

		@BeforeClass
		public static void setUp() {
			driver = Bassclass.getDriver("chrome");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}
	}

	

	


