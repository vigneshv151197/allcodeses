package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.Baseclass.Baseclass;
import com.POM.pom_page_1;
import com.runner.runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Baseclass {

	
		public static WebDriver driver = runner.driver;
		
		pom_page_1 p = new pom_page_1(driver);

		
		@Given("User Launch  Scuf application")
		public void user_launch_scuf_application() {
			getUrl("https://uat.shriramcity.in/");
		}

		@When("User Closes the Popup")
		public void user_closes_the_popup() {
           clickOnElement(p.getClosepopup());
		}
		
		@And("User Click on ApplyLoan Button")
		public void user_click_on_applyloan_button() {
			clickOnElement(p.getApplyTwowheller());
		}


		@And("User Enters Mobile Number")
		public void user_enters_mobile_number() {
	       inputValueElement(p.getMobileNoInputField(), "8489611455");
		}

		@When("User Enters OTP")
		public void user_enters_otp() {
			inputValueElement(p.getGetOTPButton(), "11111");

		}
		

}