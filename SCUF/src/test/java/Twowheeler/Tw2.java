package Twowheeler;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Tw2 {

	

	public class TestSample {

	         public WebDriver driver;

	    @BeforeTest
	    
	         public void test() 
	    
	    {
	         WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://uat.shriramcity.in/");   
/*	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");
	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        driver = new ChromeDriver(capabilities);
	        driver.manage().window().maximize();
	        driver.get("https://uat.shriramcity.in/");
	    }
	        
*/
	    }
	    
	    @Test
	    
	       void Testcase() throws InterruptedException
	    {
	        
//	      ClosePopUp
	        driver.findElement(By.className("close-btn")).click();

//	      scrolldown
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        
//	        WebElement Element = driver.findElement(By.className("hbanner-product"));
//	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	        js.executeScript("arguments[0].scrollIntoView();", Element);
	         
//	        ClickApplyOnlineForTwoWheelerLoan
	        driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/ul/li[1]/a")).click();    
	        Thread.sleep(2000);
	        
//	      PassingPhnNo  
	        driver.findElement(By.id("TWMobile")).sendKeys("92114747131");
	        
//	      GettingOtp  
	        Thread.sleep(1000);
	        driver.findElement(By.id("g-otp")).click();
	        
//	      PassingOtp 
	        Thread.sleep(2000);
	        driver.findElement(By.id("codeBox1")).sendKeys("1");
	        driver.findElement(By.id("codeBox2")).sendKeys("1");
	        driver.findElement(By.id("codeBox3")).sendKeys("1");
	        driver.findElement(By.id("codeBox4")).sendKeys("1");
	        driver.findElement(By.id("codeBox5")).sendKeys("1");
	        driver.findElement(By.id("codeBox6")).sendKeys("1");
	        
//	      OtpVerify  
	        Thread.sleep(2000);
	        driver.findElement(By.className("btnTwOtpVerify")).click();
//	      Thread.sleep(6000);
	        
//	      PassingPincode  
	        Thread.sleep(5000);
	        WebElement pinCode = driver.findElement(By.id("TWPincode"));
	        pinCode.clear();
	        pinCode.sendKeys("600002");
/*	      Select dropdown = new Select(driver.findElement(By.id("pcode")));    
//	      Thread.sleep(2000);
//	      dropdown.selectByIndex(2);
*/
	        
//	      ChoosingAddressFromDropDown  
	        Thread.sleep(2000);
	        WebElement findElement = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[2]/div[3]/form/div[1]/div[1]/div[2]/ul/li[2]"));
	        findElement.click();
	       
	        
//	      PassingPanDetails
//	      Thread.sleep(2000);
//	        WebDriverWait wait = new WebDriverWait (driver,10);
//	        wait.until(ExpectedConditions.elementToBeClickable(By.id("TWPanNumber")));
//	        WebElement panNum  = driver.findElement(By.id("TWPanNumber"));
//	        panNum.clear();
//	        panNum.sendKeys("ALWPG5809L");
	        
////	        WebDriverWait wait1 = new WebDriverWait(driver,10);
//	        wait.until(ExpectedConditions.elementToBeClickable(By.id("TWCustomerName")));
//	        WebElement tWCustomerName = driver.findElement(By.id("TWCustomerName"));
//	        tWCustomerName.clear();
//	        tWCustomerName.sendKeys("Vinoth");
	        
	        driver.findElement(By.id("datepicker")).click();
	        Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
	        month.selectByVisibleText("Aug");
	        Thread.sleep(5000);
	        
//	      driver.findElement(By.id("datepicker")).click();
	        Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
	        year.selectByValue("1980");
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr[3]/td[6]/a")).click();
	        
//	      driver.findElement(By.id("TWGdr")).click();
	        Thread.sleep(2000);
	        Select tWGdr = new Select(driver.findElement(By.id("TWGdr")));
	        tWGdr.selectByValue("MALE");
	        
//	      PassinsFnam&Email  
	        Thread.sleep(5000);
	        driver.findElement(By.id("TWFatherName")).sendKeys("Santhosh");
	        driver.findElement(By.id("TWEmailId")).sendKeys("abcdf@gmail.com");
	        
//	      ResidentalInformation  
	        Select dropdown = new Select(driver.findElement(By.id("TWRestType")));
	        dropdown.selectByVisibleText("Rented with Family");
	        Select dropdown1 = new Select (driver.findElement(By.id("TWDurMonth")));
	        dropdown1.selectByVisibleText("7-12 Months");
	        
//	      WorkInformation  
	        Select dropdown2 = new Select (driver.findElement(By.id("TWEmpType")));
	        dropdown2.selectByVisibleText("Salaried");
	        
//	      WebElement monthlySal = driver.findElement(By.id("net-month-salary-label"));
//	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	      monthlySal.clear();
//	      monthlySal.sendKeys("25000");
	        Thread.sleep(6000);
	        driver.findElement(By.id("TWMonthSalary")).sendKeys("50000");
	        
	        Select dropdown3 = new Select  (driver.findElement(By.id("TWManFac")));
	        dropdown3.selectByVisibleText("HONDA");
	 
	     
	        Select dropdown4 = new Select(driver.findElement(By.id("TWModeL")));
	        Thread.sleep(2000);
	        dropdown4.selectByVisibleText("CB 200 X BS6");
	        Thread.sleep(2000);
	        driver.findElement(By.id("tw-form-sub")).click();
	        
////	      WebDriverWait wait2 = new WebDriverWait (driver,10);
//	        wait.until(ExpectedConditions.elementToBeClickable
//	        (By.xpath("/html/body/section/div/div/div/div/div/div[2]/div[4]/section/div[4]/div[1]/button[9]")));
//	        
//	      Thread.sleep(5000);
	        driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[2]/div[4]/section/div[4]/div[1]/button[9]")).click();       
	        
	        Thread.sleep(2000);
	        WebElement feedBack = driver.findElement(By.id("exampleFormControlTextarea1"));
	        feedBack.clear();
	        feedBack.sendKeys("Its A Great Website");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id("feedback-sub")).click();
	       
	     
	    }
	}
	
}
