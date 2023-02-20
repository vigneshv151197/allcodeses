package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.LibGlobal;

public class Vechicaldetails extends LibGlobal{
	 
			public Vechicaldetails() {

				PageFactory.initElements(driver, this);
			}
				
			@FindBy(id="TWManFac")
			private WebElement Twowheelerbrand;
		
			public WebElement getTwowheelerbrand() {
				return Twowheelerbrand;
			}
			
			@FindBy(id="TWModeL")
			private WebElement Twowheelermodel;
		
			public WebElement getTwowheelermodel() {
				return Twowheelermodel;
			}
			
			@FindBy(id="tw-form-sub")
			private WebElement Twowheelersubmitbutton;
		
			public WebElement getTwowheelersubmitbutton() {
				return Twowheelersubmitbutton;
			}
			
}
