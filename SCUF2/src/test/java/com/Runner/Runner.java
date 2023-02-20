package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Bassclass.Bassclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\v802\\eclipse-workspace\\SCUF2\\src\\test\\java\\com\\feature",
glue = "com.Stepdefinition" ,monochrome = true )

public class Runner {

		@BeforeClass
		public static void setUp() {
		Bassclass.getDriver("chrome");

}
}