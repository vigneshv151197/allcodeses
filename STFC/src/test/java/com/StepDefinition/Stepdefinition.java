package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.Bassclass.Baseclass;
import com.POM.Homepage;
import com.Runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Baseclass {

	Homepage Hp = new Homepage(driver);
	

@Given("User wants to launch the stfc application")
public void user_wants_to_launch_the_stfc_application() {
	getUrl("https://uat.stfc.in/");
   
}

@When("User close the pop  to enter into home page")
public void user_close_the_pop_to_enter_into_home_page() {
	clickOnElement(Hp.getPopWindow());
    
}

@When("User click the Deposite button")
public void user_click_the_deposite_button() {
	clickOnElement(Hp.getFixbutton());
  
}

@When("Click Investnow Button")
public void click_investnow_button() {
	clickOnElement(Hp.getInvestNowButton());
    
}

@When("User Enters Name")
public void user_enters_name() {
   inputValueElement(Hp.getName(), "VigneshV");
   
}

@When("User Enters Email Id")
public void user_enters_email_id() {
	inputValueElement(Hp.getEmail(), "Vicky@gmail.com");  
}

@When("User Enters Email Mobile Number")
public void user_enters_email_mobile_number() {
	inputValueElement(Hp.getMobilNumber(), "8489611455");
    
}

@When("User Enters Investment Amount")
public void user_enters_investment_amount() {
	inputValueElement(Hp.getInvestAmount(), "5000");

}

@Then("User Click Invest Amount")
public void user_click_invest_amount() {
	
    
}

	
}
