package Main;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.LibGlobal;

public class Run extends LibGlobal {

	@BeforeTest
	public void open_browser() {
		launchBrowser("chrome");
		loadUrl("https://www.shriram.I/");
	}

	@Test
	public void call() {

		LibGlobal lb = new LibGlobal();

		String pageTitle = getPageTitle();
		int length = pageTitle.length();
		System.out.println(pageTitle);
		System.out.println(length);
		if (length > 0) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		String Disp = lb.getPageDescription();
		System.out.println("Meta description of the Url is : " + Disp);

	}


	@AfterTest
	public void driver_close() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
