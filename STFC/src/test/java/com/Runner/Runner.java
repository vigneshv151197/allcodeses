package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Bassclass.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.types.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\v802\\eclipse-workspace\\STFC\\src\\test\\java\\com\\feature",
glue = "com.StepDefinition" )

public class Runner {

	
	
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
	driver = Baseclass.getDriver("chrome");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	
	
	
}
