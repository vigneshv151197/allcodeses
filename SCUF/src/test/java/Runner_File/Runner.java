package Runner_File;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Excel_Files.Excel_Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Runner   {

	
	 
	@DataProvider
	public Iterator<Object[]> getTestData() {

	    ArrayList<Object[]> testData = Excel_Utilities.getDataFromexcel();
	    return testData.iterator();

	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uat.shriramcity.in/");
		System.out.println(driver.getTitle());
	}

	@Test(dataProvider = "getTestData")


	    public void execution(String MobileNumber, String EnterPincode, String EmailID, String invest_button) throws Exception {
	    	
			WebDriver driver = new ChromeDriver();

			
			
	    	WebElement findElement = driver.findElement(By.id("MobileNo"));    	
	    	findElement.click();    	
	    	findElement.sendKeys(MobileNumber);
	    	
	    	WebElement findElement2 = driver.findElement(By.id("pincode"));
	    	findElement2.click();
	    	findElement2.sendKeys(EnterPincode);
	    	
	    	WebElement findElement3 = driver.findElement(By.id("EmailID"));
	    	findElement3.click();
	    	findElement3.sendKeys(EmailID);
	    	
	    	WebElement findElement4 = driver.findElement(By.id("invest_now_button"));
	    	
	    	String s=invest_button;
	    	
	    	if (s.equals("Yes")) {
	    		
	    		findElement4.click();			
			}
	    	
	    	else {
				
	    		System.out.println("Invest now button isn't clicked"); 
			}
	    	
	    	Thread.sleep(3000);
	    	driver.quit();


	}

	}
	

