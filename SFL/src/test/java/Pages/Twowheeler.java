package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.LibGlobal;

public class Twowheeler extends LibGlobal{
	
	public Twowheeler() {
	
		PageFactory.initElements(driver, this);
	}
		
		
		@FindBy(xpath="//*[@id=\"body\"]/app-root/app-header/header/section[2]/div/div/div[2]/p/span[1]")
		private WebElement LoanBtn;


		@FindBy(xpath = "(//*[contains(text(),'Two Wheeler Loan')])[2]")
		private WebElement TwLoanBtn;
		
		
		public WebElement getLoanBtn() {
			return LoanBtn;
		}


		public WebElement getTwLoanBtn() {
			return TwLoanBtn;
		}
		@FindBy(xpath="(//*[contains(text(),'Give your dreams some wheels With ')])[1]")
		private WebElement singleclick;


		public WebElement getSingleclick() {
			return singleclick;
		}	
	
		
		@FindBy(id="pf-apply-btn")
		private WebElement applynowbt;


		
		public WebElement getApplynowbt() {
			return applynowbt;
		}

		@FindBy(id="cus_mobile")
		private WebElement mobile_number;

		public WebElement getMobile_number() {
			return mobile_number;
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
		
		
		
		
		
		
		
//		@FindBy(xpath = "/html/body/section/div/div/div/div/div/div[2]/div[4]/section/div[4]/div[1]/button[8]")
//		private WebElement Smilebutton;
//		
//		public WebElement getSmilebutton() {
//		   return Smilebutton;
//        }
		
		
		
		
		
		
		
		
		
		
		
}
