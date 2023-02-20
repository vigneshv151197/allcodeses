package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.LibGlobal;

public class Feedbackdetails extends LibGlobal{
	 
			public Feedbackdetails() {
			
				PageFactory.initElements(driver, this);
			}
	
			
			@FindBy(xpath = "//*[@class='downloadvoucher']")
			private WebElement Tockenbutton;
		
			public WebElement getTockenbutton() {
				return Tockenbutton;
			}
			
			@FindBy(xpath = "(//h5[@class=\"rate\"])[1]")
			private WebElement finalscrolldown;
			
			public WebElement getfinalscrolldown() {
			   return finalscrolldown;
	        }
			
			@FindBy(xpath = "(//img[@class=\"grey-image\"])[8]")
			private WebElement smile8;
			
			public WebElement getsmile8() {
			   return smile8;
	        }
			
			@FindBy(id="exampleFormControlTextarea1")
			private WebElement Feedbackbox;
		
			public WebElement getFeedbackbox() {
				return Feedbackbox;
			}
			
			
			
			@FindBy(id="feedback-sub")
			private WebElement Feedbacksubmitbutton;
		
			public WebElement getFeedbacksubmitbutton() {
				return Feedbacksubmitbutton;
			}
}
