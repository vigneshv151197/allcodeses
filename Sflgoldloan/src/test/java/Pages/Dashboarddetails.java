package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.LibGlobal;

public class Dashboarddetails extends LibGlobal{

		public Dashboarddetails() {
		
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="(//*[contains(text(),'Loans')])[2]")
		private WebElement LoanBtn;
		
			public WebElement getLoanBtn() {
			return LoanBtn;
		}

		@FindBy(xpath = "(//*[contains(text(),' Gold Loan')])[2]")
		private WebElement GlLoanBtn;
		
		public WebElement getGlLoanBtn() {
			return GlLoanBtn;
		}
		
		@FindBy(id = "cus_name")
		private WebElement Customername;

		public WebElement getCustomername() {
			return Customername;
		}
		
		@FindBy(id = "cus_mobile")
		private WebElement Customermobileno;

		public WebElement getCustomermobileno() {
			return Customermobileno;
		}
		
		@FindBy(id = "cus_email")
		private WebElement Customeremailid;

		public WebElement getCustomeremailid() {
			return Customeremailid;
		}
		
		@FindBy(id = "pf-apply-btn")
		private WebElement Applyglbutton;

		public WebElement getApplyglbutton() {
			return Applyglbutton;
		}
		
		
		
		
}
