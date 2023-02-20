package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	public static WebDriver driver;
	
	public POM(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "/html/body/div[8]/div/div/div/ul/li[3]/a")
	private WebElement EligibilitySection;
	
	@FindBy(xpath = "/html/body/div[8]/div/div/div/ul/li[4]/a")
	private WebElement DocumentationsRequired;
	
	@FindBy(xpath = "/html/body/div[8]/div/div/div/ul/li[5]/a")
	private WebElement InterestandCharges;
	
	@FindBy(id = "twlamount-slider-input")
	private WebElement Siled;
	

	@FindBy(linkText = "Apply Now")
	private WebElement getotp;
	
	@FindBy(id = "TWMobile")
	private WebElement MobileNoInputField;
	
	@FindBy(id = "g-otp")
	private WebElement GetOTPButton;
	
	@FindBy(id = "codeBox1")
	private WebElement OTPInputFieldsOne;
	
	@FindBy(id = "codeBox2")
	private WebElement OTPInputFieldsTwo;
	
	@FindBy(id = "codeBox3")
	private WebElement OTPInputFieldsThree;
	
	@FindBy(id = "codeBox4")
	private WebElement OTPInputFieldsFour;
	
	@FindBy(id = "codeBox5")
	private WebElement OTPInputFieldsFive;
	
	@FindBy(id = "codeBox6")
	private WebElement OTPInputFieldsSix;
	
	@FindBy(className =  "btnTwOtpVerify")
	private WebElement OTPVerifyButton;
	
	@FindBy(id = "TWPincode")
	private WebElement PincodeInputField;
	
	@FindBy(name = "pan_number")
	private WebElement PANnumber;
	
	@FindBy(id = "TWCustomerName")
	private WebElement CustomerName;
	
	@FindBy(id = "TWFatherName")
	private WebElement FatherName;
	
	@FindBy(id = "TWEmailId")
	private WebElement EmailID;
	
	@FindBy(id = "TWRestType")
	private WebElement ResidenceType;
	
	
	@FindBy(id = "TWDurMonth")
	private WebElement AgeoftheCurrentStay;
	
	@FindBy(id = "TWMonthSalary")
	private WebElement AnnualTurnover;
	
	@FindBy(id = "TWManFac")
	private WebElement VehicleType;
	
	@FindBy(id = "TWModeL")
	private WebElement VehicleModel;
	
	@FindBy(xpath =  "//a[@id='tw-form-sub']")
	private WebElement FinalSubmitButton;
    
	
	
	
	public WebElement getEligibilitySection() {
		return EligibilitySection;
	}

	public WebElement getDocumentationsRequired() {
		return DocumentationsRequired;
	}

	public WebElement getInterestandCharges() {
		return InterestandCharges;
	}

	
	public WebElement getMobileNoInputField() {
		return MobileNoInputField;
	}

	public WebElement getGetOTPButton() {
		return GetOTPButton;
	}

	public WebElement getOTPInputFieldsOne() {
		return OTPInputFieldsOne;
	}

	public WebElement getOTPInputFieldsTwo() {
		return OTPInputFieldsTwo;
	}

	public WebElement getOTPInputFieldsThree() {
		return OTPInputFieldsThree;
	}

	public WebElement getOTPInputFieldsFour() {
		return OTPInputFieldsFour;
	}

	public WebElement getOTPInputFieldsFive() {
		return OTPInputFieldsFive;
	}

	public WebElement getOTPInputFieldsSix() {
		return OTPInputFieldsSix;
	}

	public WebElement getOTPVerifyButton() {
		return OTPVerifyButton;
	}

	public WebElement getPincodeInputField() {
		return PincodeInputField;
	}

	public WebElement getPANnumber() {
		return PANnumber;
	}

	public WebElement getCustomerName() {
		return CustomerName;
	}

	public WebElement getFatherName() {
		return FatherName;
	}

	public WebElement getEmailID() {
		return EmailID;
	}

	public WebElement getResidenceType() {
		return ResidenceType;
	}

	public WebElement getAgeoftheCurrentStay() {
		return AgeoftheCurrentStay;
	}

	public WebElement getAnnualTurnover() {
		return AnnualTurnover;
	}

	public WebElement getVehicleType() {
		return VehicleType;
	}

	public WebElement getVehicleModel() {
		return VehicleModel;
	}

	public WebElement getFinalSubmitButton() {
		return FinalSubmitButton;
	}

	public WebElement getSiled() {
		
		return getSiled();
	}




	}

	

	
	
	
	
	

