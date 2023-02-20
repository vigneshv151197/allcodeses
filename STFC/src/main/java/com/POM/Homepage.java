package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bassclass.Baseclass;

public class Homepage  {
	
	public static WebDriver driver;

	public Homepage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	@FindBy(xpath = "//a[@class='close-btn']")
	private WebElement PopWindow;
	
	@FindBy(xpath = "(//a[@href='/fixed-deposit/interest-rates/'])[2]")
	private WebElement Fixbutton;
	
	@FindBy(xpath = "//button[@class='text-white fd-banner-btn-invest-now']")
	private WebElement InvestNowButton;
	
	@FindBy(id =  "//input[@id='name']")
	private WebElement Name;
	
	@FindBy(id =  "//input[@id='email']")
	private WebElement Email;
	
	@FindBy(id =  "//input[@id='mobile']")
	private WebElement MobilNumber;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement InvestAmount;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement Investing;
	
	
	
	
	
	
	
	
	

	public WebElement getPopWindow() {
		return PopWindow;
	}

	public WebElement getFixbutton() {
		return Fixbutton;
	}
	
	public WebElement getInvestNowButton() {
		return InvestNowButton;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getMobilNumber() {
		return MobilNumber;
	}

	public WebElement getInvestAmount() {
		return InvestAmount;
		
		
	}

	

	

	
	
}
