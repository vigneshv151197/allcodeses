package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_page_1 {

	public static WebDriver driver;

	public pom_page_1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "//a[@class='close-btn']")
	private WebElement closepopup;
	
	@FindBy(xpath = "(//a[@class='apply-now'])[1]")
	private WebElement ApplyTwowheller;
	
	@FindBy(xpath = "(//a[@class='scroll'])[2]")
	private WebElement EligibilitySection;

	@FindBy(xpath = "(//a[@class='scroll'])[3]")
	private WebElement DocumentationsRequired;

	@FindBy(xpath = "(//a[@class='scroll'])[4]")
	private WebElement InterestandCharges;

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

	@FindBy(className = "btnTwOtpVerify")
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

	public WebElement getClosepopup() {
		return closepopup;
	}

	public WebElement getApplyTwowheller() {
		return ApplyTwowheller;
	}

	public WebElement getEligibilitySection() {
		return EligibilitySection;
	}

	public WebElement getDocumentationsRequired() {
		return DocumentationsRequired;
	}

	public WebElement getInterestandCharges() {
		return InterestandCharges;
	}

	public WebElement getGetotp() {
		return getotp;
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

	

	

}
