 package Twowheeler;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tw {

	public static WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uatonlinetw.shriramcity.in/two-wheeler-loan");
		System.out.println(driver.getTitle());
	}

	@Test
	public void TwoWheeler() throws InterruptedException {
		// Clicking Eligibility Section
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div/ul/li[3]/a")).click();
		Thread.sleep(3000);

		// Clicking Documentations Required
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div/ul/li[4]/a")).click();
		Thread.sleep(3000);

		// Clicking Interest & Charges
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div/ul/li[5]/a")).click();
		Thread.sleep(3000);

		// Scroll Down
		JavascriptExecutor SDWN1 = (JavascriptExecutor) driver;
		SDWN1.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);

		// Slide Bar Movement
		WebElement s1 = driver.findElement(By.id("twlamount-slider-input"));
		s1.clear();
		s1.sendKeys(Keys.chord("85000", Keys.TAB));
		Thread.sleep(2000);

		WebElement s2 = driver.findElement(By.id("twlintrest-slider-input"));
		s2.clear();
		Thread.sleep(2000);

		WebElement s22 = driver.findElement(By.xpath("//*[@id=\"twlintrest-slider\"]/div/div[2]/div/div"));
		Actions s21 = new Actions(driver);
		s21.dragAndDropBy(s22, 110, 0);
		s21.perform();
		Thread.sleep(2000);

		WebElement s3 = driver.findElement(By.id("twltenure-slider-input"));
		s3.clear();
		Thread.sleep(2000);

		WebElement s33 = driver.findElement(By.xpath("//*[@id=\"twltenure-slider\"]/div/div[2]/div/div"));
		Actions s31 = new Actions(driver);
		s31.dragAndDropBy(s33, 80, 0);
		s31.perform();
		Thread.sleep(2000);

//Apply Button
		driver.findElement(By.linkText("Apply Now")).click();
		Thread.sleep(3000);

//Mobile No Input Field
		driver.findElement(By.id("TWMobile")).sendKeys("9092347994");
		Thread.sleep(2000);

//Get OTP Button
		driver.findElement(By.id("g-otp")).click();
   	    Thread.sleep(3000);

//OTP Input Fields
		driver.findElement(By.id("codeBox1")).sendKeys("1");
		driver.findElement(By.id("codeBox2")).sendKeys("1");
		driver.findElement(By.id("codeBox3")).sendKeys("1");
		driver.findElement(By.id("codeBox4")).sendKeys("1");
		driver.findElement(By.id("codeBox5")).sendKeys("1");
		driver.findElement(By.id("codeBox6")).sendKeys("1");
		Thread.sleep(3000);
		
//OTP Verify Button
		driver.findElement(By.className("btnTwOtpVerify")).click();
		Thread.sleep(2000);

//Pincode Input Field
		driver.findElement(By.id("TWPincode")).sendKeys("600001");
		Thread.sleep(2000);
		WebElement pincode = driver.findElement(By.xpath("//*[@id=\"pcode\"]"));
		List<WebElement> areapincode = pincode.findElements(By.tagName("li"));
		for (WebElement li : areapincode) {
			if (li.getText().equals("600001, GOVT STANLEY HOSPITAL S.O, CHENNAI")) {
				li.click();
			}
		}

//PAN 
		driver.findElement(By.name("pan_number")).sendKeys("ATGPT2841R");
		Thread.sleep(5000);

//Name
		driver.findElement(By.id("TWCustomerName")).sendKeys("Vignesh");

//	  Date of Birth
		driver.findElement(By.id("datepicker")).click();
		Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("Aug");
		Thread.sleep(5000);
		Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue("1980");
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr[3]/td[6]/a")).click();
		Thread.sleep(2000);
		Select tWGdr = new Select(driver.findElement(By.id("TWGdr")));
		tWGdr.selectByValue("MALE");

//		  Father Name
//		  driver.findElement(By.id("TWFatherName")).clear();
		driver.findElement(By.id("TWFatherName")).sendKeys("Vasu");
		Thread.sleep(2000);

//		  Email Id
//		  driver.findElement(By.id("TWEmailId")).clear();
		driver.findElement(By.id("TWEmailId")).sendKeys("Vicky@gmail.com");
		Thread.sleep(2000);

//		  Residential Information 
//		  Residence Type
//		  driver.findElement(By.id("TWRestType")).clear();
		Select s4 = new Select(driver.findElement(By.id("TWRestType")));
		s4.selectByVisibleText("Rented Staying Alone");
		Thread.sleep(2000);

//		  Age of the Current Stay
//		  driver.findElement(By.id("TWDurMonth")).clear();
		Select s5 = new Select(driver.findElement(By.id("TWDurMonth")));
		s5.selectByVisibleText("> 3 years");
		Thread.sleep(2000);

//		  Work Information
//		  driver.findElement(By.id("TWEmpType")).clear();
		Select s6 = new Select(driver.findElement(By.id("TWEmpType")));
		s6.selectByVisibleText("Self Employed Business");
		Thread.sleep(2000);

//Annual Turnover
		driver.findElement(By.id("TWMonthSalary")).clear();
		driver.findElement(By.id("TWMonthSalary")).sendKeys("500000");
		Thread.sleep(2000);
		
//Vehicle Type	not available	
		Select s66 = new Select(driver.findElement(By.id("TWManFac")));
		s66.selectByVisibleText("HERO MOTOR CORP");
		Thread.sleep(2000);
		
		Select s8 = new Select(driver.findElement(By.id("TWModeL")));
		s8.selectByVisibleText("X PULSE 200 / 4V BS6");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-covered btn-info']")).click();		
		
		
		
		
//Vehicle Type
//		driver.findElement(By.id("TWManFac")).clear();
		Select s7 = new Select(driver.findElement(By.id("TWManFac")));
		s7.selectByVisibleText("HONDA");
		Thread.sleep(2000);

//	Vehicle Model
//		  driver.findElement(By.id("TWModeL")).clear();
		Select s81 = new Select(driver.findElement(By.id("TWModeL")));
		s8.selectByVisibleText("X BLADE SINGLE DISCBS6");
		Thread.sleep(2000);

//Submit Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='tw-form-sub']")).click();
		

// Smile
		Thread.sleep(3000);
		driver.findElement(
		By.xpath("/html/body/section/div/div/div/div/div/div[2]/div[4]/section/div[4]/div[1]/button[8]")).click();
		
		
//Feedback-Box
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.id("exampleFormControlTextarea1"));
		findElement.click();
		findElement.sendKeys("Good Service");

//Final Submit-button		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='submit-button'])[3]")).click();
	    }
         
	    
     	@AfterMethod
	    public void afterMethod() {
        driver.close();
     	}
}
