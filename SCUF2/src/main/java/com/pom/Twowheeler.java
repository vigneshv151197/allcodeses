package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Twowheeler {

    public static WebDriver driver;

	public Twowheeler(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	
	}

	@FindBy(xpath = "/html/body/div[8]/div/div/div/ul/li[3]/a")
	private WebElement EligibilitySection;
	
	@FindBy(xpath = "/html/body/div[8]/div/div/div/ul/li[4]/a")
	private WebElement DocumentationsRequired;
	
	@FindBy(xpath = "/html/body/div[8]/div/div/div/ul/li[5]/a")
	private WebElement InterestandCharges;
	
	@FindBy(xpath = "(//div[@class='text-center'])[1]")
	private WebElement sliderview;
	
	@FindBy(xpath = "twlamount-slider-input")
	private WebElement slideramount;
	
	@FindBy(xpath = "twlintrest-slider-input")
	private WebElement intrestrate;
	
	public WebElement getSlideramount() {
		return slideramount;
	}

	public WebElement getIntrestrate() {
		return intrestrate;
	}

	public WebElement getTenuremonths() {
		return tenuremonths;
	}

	@FindBy(xpath = "twltenure-slider-input")
	private WebElement tenuremonths;
	
	public WebElement getSliderview() {
		return sliderview;
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
	
	
	
	
	
	
	
	
}
