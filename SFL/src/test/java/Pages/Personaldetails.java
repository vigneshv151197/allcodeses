package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.LibGlobal;

public class Personaldetails  extends LibGlobal{
	public Personaldetails() {

	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id =  "residence_pincode")
	private WebElement pincode;

	public WebElement getpincode() {
		return pincode;
	}
	
	@FindBy(id = "pan_number")
	private WebElement pannumber;
	
	public WebElement getpannumber() {
		return pannumber;
	}
	
	@FindBy(id="TWCustomerName")
	private WebElement Customername;


	
	public WebElement getCustomername() {
		return Customername;
	}
	
	@FindBy(id="datepicker")
	private WebElement Datepicker;

	public WebElement getDatepicker() {
		return Datepicker;
	}
	
	@FindBy(className = "ui-datepicker-month")
	private WebElement DOBmonth;

	public WebElement getDOBmonth() {
		return DOBmonth;
	}

	@FindBy(className = "ui-datepicker-year")
	private WebElement DOByear;

	public WebElement getDOByear() {
		return DOByear;
	}
	
	@FindBy(id="TWGdr")
	private WebElement Gender;

	public WebElement getGender() {
		return Gender;
	}
	
	
	
	@FindBy(xpath = "(//h3[@class=\"step-form-hd\"])[2]")
	private WebElement Depositedetailscroll;

	public WebElement getDepositedetailscroll() {
		return Depositedetailscroll;
	}
	
	
	@FindBy(id="father_name")
	private WebElement Fathername;

	public WebElement getFathername() {
		return Fathername;
	}
    
	@FindBy(id="cust_email")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}
	
	@FindBy(id = "stepbtn-1")
	private WebElement Continuebutton;

	public WebElement getContinuebutton() {
		return Continuebutton;
	}
}
