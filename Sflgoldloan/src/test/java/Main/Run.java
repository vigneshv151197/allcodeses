package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseclass.LibGlobal;
import Pages.Customerdetails;
import Pages.Dashboarddetails;
import Pages.Otpdetails;

public class Run extends LibGlobal {
	
	WebDriverWait wait2 = new WebDriverWait(driver, 30);
	
	@BeforeTest
	public  void dashboard() {
		LibGlobal lb = new LibGlobal();
		WebDriver driver = LibGlobal.driver;
	   LibGlobal.launchBrowser("chrome");
	   LibGlobal.loadUrl("https://uat.shriram.com/");
		System.out.println("Lunched Sit Site");	
	   }
	
	@Test
	public  void dash1() throws InterruptedException {
		LibGlobal lb = new LibGlobal();
		WebDriver driver = LibGlobal.driver;
		Dashboarddetails dd = new Dashboarddetails();
		Otpdetails od = new Otpdetails();
		Customerdetails cd = new Customerdetails();
		
	//	wait2.until(ExpectedConditions.elementToBeClickable(dd.getLoanBtn()));

		
		Thread.sleep(1000);
		LibGlobal.Click(dd.getLoanBtn());
		
		Thread.sleep(2000);
		LibGlobal.Click(dd.getGlLoanBtn());
		
		Thread.sleep(2000);
		dd.getCustomername().sendKeys("Vignesh V");
		
		Thread.sleep(2000);
		dd.getCustomermobileno().sendKeys("9855654566");
		
		Thread.sleep(2000);
		dd.getCustomeremailid().sendKeys("vicky@gmail.com");
		
		Thread.sleep(2000);
		dd.getApplyglbutton().click();
		
		Thread.sleep(2000);
		od.getotp1().click();
		
		Thread.sleep(2000);
		od.getotp1().sendKeys("1");
		
		Thread.sleep(2000);
		od.getotp2().sendKeys("1");
		
		Thread.sleep(2000);
		od.getotp3().sendKeys("1");
		
		Thread.sleep(2000);
		od.getotp4().sendKeys("1");
		
		Thread.sleep(2000);
		od.getotp5().sendKeys("1");
		
		Thread.sleep(2000);
		od.getotp6().sendKeys("1");
		
		Thread.sleep(2000);
		od.getOtpverification().click();
		
		Thread.sleep(2000);
		LibGlobal.scrollDown(od.getScrolltoapplication());
		
		//date
		
		Thread.sleep(2000);
		cd.getGlpannumber().sendKeys("BADPV0447C");
		
		Thread.sleep(2000);
		cd.getGlloanamount().sendKeys("500000");
		
		Thread.sleep(2000);
		cd.getGlCustpincode().sendKeys("602001");
		
		//need change
		Thread.sleep(2000);
		cd.getGlCustgender().click();
		//lb.selectOptionByText(cd.getGlCustgender(), "Male");
		
		Thread.sleep(2000);
		cd.getGlCustmaritals().click();
		
		Thread.sleep(2000);
		cd.getGlapplyloanbutton().click();
		
		
		
		
	}

}