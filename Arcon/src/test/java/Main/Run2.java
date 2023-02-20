package Main;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseClass.LibGlobal;
import Pages.MainSRfields;

public class Run2 extends LibGlobal {

	

		public static WebDriver driver;
		public static MainSRfields SR;
		
	    	
		@BeforeSuite
		public void startTest() {
			launchBrowser("chrome");
			loadUrl("https://www.shriramfinance.in/");
			System.out.println("SFL Launched");
		}
	
		@Test
		public void Journy() throws InterruptedException, AWTException {
//			LibGlobal lb = new LibGlobal();
			WebDriver driver = LibGlobal.driver;
//			MainSRfields SR = new MainSRfields();

			Thread.sleep(2000);
			
			
			
			
			
		}
	
}
