package Main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.LibGlobal;
import Pages.MainSRfields;

public class Run extends LibGlobal {

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
//		LibGlobal lb = new LibGlobal();
		WebDriver driver = LibGlobal.driver;
//		MainSRfields SR = new MainSRfields();

		Thread.sleep(2000);
		WebElement loan = driver.findElement(By.xpath("//span[text()=' Loans ']"));
		Thread.sleep(2000);
		mouseOver(loan);
		Thread.sleep(2000);
		WebElement tw = driver.findElement(By.id("main_nav_twl"));
		Thread.sleep(2000);
		mouseOver(tw);
		Thread.sleep(2000);
		rightClick(tw);

		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
		WebElement gl = driver.findElement(By.id("main_nav_gl"));
		
		
		Thread.sleep(2000);
		mouseOver(gl);
		Thread.sleep(2000);
		rightClick(gl);

		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement cl = driver.findElement(By.id("main_nav_cgvf"));
		Thread.sleep(2000);
		mouseOver(cl);
		Thread.sleep(2000);
		rightClick(cl);

		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

		// String windowHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> li = new ArrayList<String>(windowHandles);
		Thread.sleep(2000);
		driver.switchTo().window(li.get(3));
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	    }
	
	
	   

//    	@AfterTest
//	    public void closeBrowser() {
//		closeBrowser();
//	    }

}
