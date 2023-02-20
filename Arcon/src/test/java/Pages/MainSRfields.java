package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class MainSRfields extends LibGlobal {

	public MainSRfields() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[@class=\"sec-hd text-center interest-char\"]")
	private WebElement Servicefields;

	public WebElement getServicefields() {
		return Servicefields;
	}
	
	
	@FindBy(id = "main_nav_gl")
	private WebElement GoldName;

	public WebElement getRequesterName() {
		return GoldName;
	}

}
