package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.LibGlobal;

public class Residentialdetails extends LibGlobal{
	
	
	public Residentialdetails() {

				PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="TWRestType")
	private WebElement Typeofresidential;

	public WebElement getTypeofresidential() {
		return Typeofresidential;
	}
	
//	@FindBy(xpath = "(//h3[@class='form-heading'])[1]")
//	private WebElement redinfodown;
//
//	public WebElement getredinfodown() {
//		return redinfodown;
//	}
	

	@FindBy(id="TWDurMonth")
	private WebElement Ageofresidential;

	public WebElement getAgeofresidential() {
		return Ageofresidential;
	}
	
	
}
