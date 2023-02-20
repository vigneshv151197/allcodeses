package Runner_File;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.excel.Excel_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.excel.Excel_Utils;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Runner   {
	
	
	 
	@DataProvider
	public Iterator<Object[]> getTestData() {

	    ArrayList<Object[]> testData = Excel_Utils.getDataFromexcel();
	    return testData.iterator();

	}
	
	
		@Test(dataProvider = "getTestData")	
	    public void execution(String MobileNumber, String EnterPincode, String EmailID, String invest_button) throws Exception {
			System.out.println(MobileNumber+"is empty");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\v802\\eclipse-workspace\\Excel\\Chromedriver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://uatfd.stfc.in/");
//			System.out.println(driver.getTitle());
				
			
			driver.findElement(By.id("MobileNo")).click();
			
//	    	WebElement findElement = driver.findElement(By.id("MobileNo"));
//	    	findElement.click();    		
//	    	findElement.sendKeys(MobileNumber);
//	    	System.out.println(MobileNumber);
//	    	
//	    	WebElement findElement2 = driver.findElement(By.id("pincode"));
//	    	findElement2.click();
//	    	findElement2.sendKeys(EnterPincode);
//	    	
//	    	WebElement findElement3 = driver.findElement(By.id("EmailID"));
//	    	findElement3.click();
//	    	findElement3.sendKeys(EmailID);
//	    	
//	    	
//	    	WebElement findElement4 = driver.findElement(By.id("invest_now_button"));
//	    	
//	    	String s = invest_button;
//	    	
//	    	
//	    	if (s.equals("Yes")) {
//	    		
//	    		findElement4.click();			
//			}
//	    	
//	    	else {
//				
//	    		System.out.println("Invest now button isn't clicked"); 
//			}
//	    	
//	    	Thread.sleep(3000);
	    	
	    	driver.quit();

	  
	}
	
	

	}
	

