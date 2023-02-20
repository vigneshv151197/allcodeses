package com.Stepdefinition;

import java.time.Duration;

import com.Bassclass.Bassclass;
import com.pom.Twowheeler;

import io.cucumber.java.en.*;

public class Stepdefinition extends Bassclass {
	
	Twowheeler tw = new Twowheeler(driver);
	

	@Given("User Launch  Scuf application")
	public void user_launch_scuf_application() {
		getUrl("https://uatonlinetw.shriramcity.in/two-wheeler-loan");	
	}

	@When("User Click Eligibility Tab")
	public void user_click_eligibility_tab() throws Throwable {
		clickOnElement(tw.getEligibilitySection());
		Thread.sleep(0);
		
	}

	@When("User Click Documents Required Tab")
	public void user_click_documents_required_tab() throws Throwable {
		clickOnElement(tw.getDocumentationsRequired());
		Thread.sleep(2000);
	}

	@When("User Click Interest Rates Tab")
	public void user_click_interest_rates_tab() throws Throwable {
		clickOnElement(tw.getInterestandCharges());
		Thread.sleep(2000);
	}

	@When("User Scroll Down to View Two Wheeler Calculator")
	public void user_scroll_down_to_view_two_wheeler_calculator() throws Throwable {
		pageDown(tw.getSliderview());
		Thread.sleep(2000);
	}

	@When("User Select Amount using slider")
	public void user_select_amount_using_slider() {
		elementClear(tw.getSlideramount());
		inputValueElement(tw.getSlideramount(), "90000");
	}

	@When("User Select Interest using slider")
	public void user_select_interest_using_slider() {
		elementClear(tw.getIntrestrate());
		inputValueElement(tw.getIntrestrate(), "16");
	}
//
//	@When("User Select Loan Tenure Months Using slider")
//	public void user_select_loan_tenure_months_using_slider() {
//
//	}
//
//	@Then("User Clicks Apply Button")
//	public void user_clicks_apply_button() {
//		
//	}
//
//	@Given("User Enters Mobile Number")
//	public void user_enters_mobile_number() {
//		
//	}
//
//	@When("User Clicks Get OTP button")
//	public void user_clicks_get_otp_button() {
//		
//	}
//
//	@When("User enters OTP")
//	public void user_enters_otp() {
//		
//	}
//
//	@When("User clicks Quickstart button")
//	public void user_clicks_quickstart_button() {
//		
//	}
//
//	@When("User enters Pin Code")
//	public void user_enters_pin_code() {
//		
//	}
//
//	@When("User enters PAN Card Number")
//	public void user_enters_pan_card_number() {
//		
//	}
//
//	@When("User enters Name")
//	public void user_enters_name() {
//		
//	}
//
//	@When("User SelectDate Of Birth")
//	public void user_select_date_of_birth() {
//		
//	}
//
//	@When("User enters NumberFather Name")
//	public void user_enters_number_father_name() {
//		
//	}
//
//	@When("User enters Residence Type")
//	public void user_enters_residence_type() {
//		
//	}
//
//	@When("User enters Age of the Current Stay in Residence")
//	public void user_enters_age_of_the_current_stay_in_residence() {
//		
//	}
//
//	@When("User Enters Work Information")
//	public void user_enters_work_information() {
//		
//	}
//
//	@Given("User Select HERO MOTOR CORP Vechical")
//	public void user_select_hero_motor_corp_vechical() {
//		
//	}
//
//	@When("User Select X PULSE Model")
//	public void user_select_x_pulse_model() {
//		
//	}
//
//	@Then("User Clicks Ok for Not Available Popup")
//	public void user_clicks_ok_for_not_available_popup() {
//		
//	}
//
//	@Given("User Select HONDA Vechical")
//	public void user_select_honda_vechical() {
//		
//	}
//
//	@When("User Select X BLADE SINGLE DISCBS6 Model")
//	public void user_select_x_blade_single_discbs6_model() {
//		
//	}
//
//	@When("User Clicks Submit Button")
//	public void user_clicks_submit_button() {
//		
//	}
//
//	@When("User Rate there Experience")
//	public void user_rate_there_experience() {
//	
//	}
//
//	@When("User Write the Feedback")
//	public void user_write_the_feedback() {
//		
//	}
//
//	@Then("User click Submit Button")
//	public void user_click_submit_button() {
//		
//	}
//
}