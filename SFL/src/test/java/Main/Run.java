package Main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Baseclass.LibGlobal;
import Pages.Employmentdetails;
import Pages.Feedbackdetails;
import Pages.Personaldetails;
import Pages.Residentialdetails;
import Pages.Twowheeler;
import Pages.Vechicaldetails;

public class Run extends LibGlobal {
	
//	static LibGlobal lb;
//	static	Personaldetails pd ;
//	static	Residentialdetails rd ;
//	static	Employmentdetails ed ;
//	static	Vechicaldetails vd ;
//	static	Feedbackdetails fd ;
	
	
	
	
	@BeforeTest
	public  void dashboard() {
		new LibGlobal();
		LibGlobal.launchBrowser("chrome");
		
		LibGlobal.loadUrl("https://uat.shriram.com/");
		System.out.println("Lunched Sit Site");	
	   }
	
	@Test
	public  void dash1() throws InterruptedException {
		LibGlobal lb = new LibGlobal();
		WebDriver driver = LibGlobal.driver;
		Twowheeler tw = new Twowheeler();
		Personaldetails pd = new Personaldetails();
		Residentialdetails rd = new Residentialdetails();
		Employmentdetails ed = new Employmentdetails();
		Vechicaldetails vd = new Vechicaldetails();
		Feedbackdetails fd = new Feedbackdetails();
		
		Thread.sleep(5000);
		LibGlobal.Click(tw.getLoanBtn());
	//	lb.mouseOver(tw.getLoanBtn());
		
		Thread.sleep(2000);
		LibGlobal.Click(tw.getTwLoanBtn());
		
		Thread.sleep(5000);
		LibGlobal.Click(tw.getSingleclick());
	
		Thread.sleep(2000);
		LibGlobal.Click(tw.getMobile_number());
		
		Thread.sleep(2000);
		tw.getMobile_number().sendKeys("9865130396");
	
		Thread.sleep(2000);
	//	WebElement applynowbt = tw.getApplynowbt();
		LibGlobal.Click(tw.getApplynowbt());
		
		Thread.sleep(2000);
		LibGlobal.Click(tw.getotp1());
		
		Thread.sleep(2000);
		tw.getotp1().sendKeys("1");
		
		
		Thread.sleep(2000);
		LibGlobal.Click(tw.getotp2());
		tw.getotp2().sendKeys("1");
		
		Thread.sleep(2000);
		tw.getotp3().sendKeys("1");
		
		Thread.sleep(2000);
		tw.getotp4().sendKeys("1");
		
		Thread.sleep(2000);
		tw.getotp5().sendKeys("1");
		
		Thread.sleep(2000);
		tw.getotp6().sendKeys("1");
		
		Thread.sleep(2000);
		LibGlobal.Click(tw.getOtpverification());
		
		Thread.sleep(4000);
		LibGlobal.Click(pd.getpincode());
		pd.getpincode().sendKeys("602001");
		
		Thread.sleep(2000);
		pd.getpannumber().sendKeys("ATGPT2841R");
		
		Thread.sleep(2000);
		LibGlobal.scrollDown(pd.getDepositedetailscroll());
		
//		Thread.sleep(2000);
//		pd.getCustomername().sendKeys("Vignesh V");
//		
//		Thread.sleep(2000);
//		pd.getDatepicker().click();
//				
//		Thread.sleep(2000);
//		TextSelectByText(pd.getDOBmonth(), "Aug");
//		
//		Thread.sleep(2000);
//		wait_SelectByValue(pd.getDOByear(), "1990");
//		
//		Thread.sleep(2000);
//		wait_SelectByValue(pd.getGender(), "MALE");
//		
		Thread.sleep(2000);
		LibGlobal.Click(pd.getFathername());
		pd.getFathername().sendKeys("Vasudevan K");
		
		Thread.sleep(2000);
		pd.getEmail().sendKeys("vicky@gmail.com");
		
		Thread.sleep(2000);
		pd.getContinuebutton().click();
		
		
		
		
		Thread.sleep(2000);
		TextSelectByText(rd.getTypeofresidential(), "Rented-Staying alone");
		
		Thread.sleep(2000);
		TextSelectByText(rd.getAgeofresidential(), "1-3 years");
		
		Thread.sleep(2000);
		TextSelectByText(ed.getEmploymenttype(), "Salaried");
		
		Thread.sleep(2000);
		ed.getSalary().sendKeys("50000");
		
		
		Thread.sleep(2000);
		TextSelectByText(vd.getTwowheelerbrand(), "ROYAL ENFIELD");
		
		
		Thread.sleep(2000);
		TextSelectByText(vd.getTwowheelermodel(), "HIMALAYAN BS6");
		
		
		Thread.sleep(2000);
		vd.getTwowheelersubmitbutton().click();
		
		Thread.sleep(6000);
		
		
		//tw.getTockenbutton().submit();
		fd.getTockenbutton().click();
	
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", tw.getTockenbutton());
		
		Thread.sleep(2000);
		LibGlobal.scrollDown(fd.getfinalscrolldown());
		
		Thread.sleep(2000);
		fd.getsmile8();
		
		Thread.sleep(2000);
		fd.getFeedbackbox().sendKeys("Good Service");

		Thread.sleep(2000);
		fd.getFeedbacksubmitbutton();
		
		Thread.sleep(2000);
		lb.closeBrowser();
		
	}

}
