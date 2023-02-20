package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.LibGlobal;

public class Otpdetails extends LibGlobal{

		public Otpdetails() {
		
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath ="(//input[@formcontrolname='otpCode1'])[2]")
		private WebElement otp1;
		
		public WebElement getotp1() {
			return otp1;
		}
	
	
		@FindBy(xpath = "(//input[@formcontrolname='otpCode2'])[2]")
		private WebElement otp2;

		public WebElement getotp2() {
			return otp2;
		}
		
		@FindBy(xpath = "(//input[@formcontrolname='otpCode3'])[2]")
		private WebElement otp3;

		public WebElement getotp3() {
			return otp3;
		}
		
		@FindBy(xpath = "(//input[@formcontrolname='otpCode4'])[2]")
		private WebElement otp4;

		public WebElement getotp4() {
			return otp4;
		}
		
		@FindBy(xpath = "(//input[@formcontrolname='otpCode5'])[2]")
		private WebElement otp5;

		public WebElement getotp5() {
			return otp5;
		}
		
		@FindBy(xpath = "(//input[@formcontrolname='otpCode6'])[2]")
		private WebElement otp6;

		public WebElement getotp6() {
			return otp6;
		}
	
		@FindBy(id="otpVerifybtn")
		private WebElement Otpverification;

		public WebElement getOtpverification() {
			return Otpverification;
		}
		
		@FindBy(xpath = "//*[contains(text(),'Apply online')]")
		private WebElement Scrolltoapplication;

		public WebElement getScrolltoapplication() {
			return Scrolltoapplication;
		}
				
}
