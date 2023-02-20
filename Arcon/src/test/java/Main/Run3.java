package Main;
import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseClass.LibGlobal;


public final class Run3 extends LibGlobal {

	public static WebDriver driver;

	@BeforeSuite
	public void startTest() {
		launchBrowser("chrome");
		loadUrl("https://sitsfl.stfc.in/two-wheeler-ola");
		System.out.println("Ola Two Wheeler");
	}

	@Test
	public void Ola() throws InterruptedException, AWTException {     

		
			//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//		Thread.
		Thread.sleep(3000);

		WebElement down = driver.findElement(By.xpath("//p[text()='Apply online']"));

		scrollDown(down);

		Thread.sleep(3000);
		WebElement MobileNo = driver.findElement(By.id("cus_mobile"));
		MobileNo.click();

		MobileNo.sendKeys("9871234565");

		Thread.sleep(3000);
		WebElement apply = driver.findElement(By.id("pf-apply-btn"));

		apply.click();






	}
}


