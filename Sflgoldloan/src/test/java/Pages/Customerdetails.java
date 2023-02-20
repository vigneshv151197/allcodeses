package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.LibGlobal;

public class Customerdetails extends LibGlobal {

		public Customerdetails() {
		
		PageFactory.initElements(driver, this);
	}
      
		@FindBy(xpath ="(//div[@class=\"input-box p-relative search-box se-inpu\"])[2]")
		private WebElement Glpannumber;

		public WebElement getGlpannumber() {
			return Glpannumber;
		}
		
		@FindBy(id="cus_loanAmount")
		private WebElement Glloanamount;

		public WebElement getGlloanamount() {
			return Glloanamount;
		}
		
		
		@FindBy(id="cus_pincode2")
		private WebElement GlCustpincode;

		public WebElement getGlCustpincode() {
			return GlCustpincode;
		}
		
		
		@FindBy(xpath ="//*[contains(text(),'Male')]")
		private WebElement GlCustgender;

		public WebElement getGlCustgender() {
			return GlCustgender;
		}
		
		@FindBy(xpath ="//*[contains(text(),'Single')]")
		private WebElement GlCustmaritals;

		public WebElement getGlCustmaritals() {
			return GlCustmaritals;
		}
		
		@FindBy(id="pf-apply-btn1")
		private WebElement Glapplyloanbutton;

		public WebElement getGlapplyloanbutton() {
			return Glapplyloanbutton;
		}
		
		
}
