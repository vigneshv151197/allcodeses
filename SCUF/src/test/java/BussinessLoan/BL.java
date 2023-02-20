package BussinessLoan;

import java.awt.AWTException;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BL {

	public static WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uat.shriramcity.in/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void BusinessLoan() throws InterruptedException, AWTException {

//		    Pop-up notification closing
		driver.findElement(By.xpath("//*[@id=\"onloadPopup\"]/div/div/div/a")).click();
		Thread.sleep(3000);

//		    Scroll down 
		JavascriptExecutor SD = (JavascriptExecutor) driver;
		SD.executeScript("window.scrollBy(0,2000)");

//		    Clicking on the Apply button
		driver.findElement(By.xpath("//a[starts-with(@title,'Apply Online for Business Loan')]")).click();

//			Keying Applicant's Name
		driver.findElement(By.id("qkAFName")).sendKeys("Perumal");

//			Keying Mobile Number
		driver.findElement(By.id("qkAFMobile")).sendKeys("9575891017");

//			Keying Email-ID
		driver.findElement(By.id("qkAFEmail")).sendKeys("perumal@gmail.com");

//			Arrow Button
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div[2]/button")).click();

//			Date of Birth
		driver.findElement(By.id("AFDob")).sendKeys("14-12-1997");
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
		Thread.sleep(3000);

//			Gender Selection
		WebElement g = driver.findElement(By.id("AFGenderMale"));
		g.click();
		Thread.sleep(3000);

//			Martial Selection
		WebElement m = driver.findElement(By.id("AFMaritalSingle"));
		m.click();

//			PAN Number
		driver.findElement(By.id("AFPAN")).sendKeys("BADPV0447C");

//			Loan Amount Required
		driver.findElement(By.id("AFLoan_amount")).sendKeys("500000");

//			Residence Pincode
		driver.findElement(By.id("AFResidencePincode")).sendKeys("602001");
		Thread.sleep(5000);

//			Residence City
		driver.findElement(By.id("AFResidenceCity")).sendKeys("THIRUVALLUR");
		Thread.sleep(3000);

//			State
		driver.findElement(By.id("AFState")).sendKeys("Tamil Nadu");
		Thread.sleep(3000);

//			Checkbox
		driver.findElement(By.xpath("//*[@id=\"qkPersonaldetsubmitForm\"]/div[8]/div[1]/div/label/span")).click();
		Thread.sleep(3000);

//			Apply Buttom
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(200));
		WebElement d = driver.findElement(By.xpath("//*[@id=\"qkPersonaldetsubmitForm\"]/div[8]/div[2]/div/button"));
//		wait1.until(ExpectedConditions.visibilityOf(d));
		
		d.click();

//			OTP Verification
		driver.findElement(By.xpath("//*[@id=\"AFotpCode\"]")).sendKeys("11111");

//			OTP Verify button
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div/div/div[2]/div[2]/div[1]/button")).click();

//			Preferred language Selection
//			List<WebElement> listElements= driver.findElements(By.xpath("/html/body/section[1]/div/div/div/div/div/select"));
//			System.out.println(listElements);
//			
//			for(int i=1; i<=listElements.size(); i++)
//			{
//			  WebElement linkElement = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/select/option[1]"+i++));
//			  System.out.println(linkElement.getText());			
//			}		
//			driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/ul/li[2]")).click();

//			Residence Type Selection
		Select findElement = new Select(driver.findElement(By.id("AFResidentType")));
		findElement.selectByVisibleText("Rented with Family");
		Thread.sleep(3000);

//			Number Of Years Living In Current Residence Selection
		Select findElement1 = new Select(driver.findElement(By.id("AFCurrentlvgresidence")));
		findElement1.selectByIndex(3);
		Thread.sleep(3000);

//			Continue Button Selection
		driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-stepper pull-right Residentialdetsubmit')]"))
				.click();
		Thread.sleep(3000);

//			Name of business keying
		driver.findElement(By.id("AFNameofbusiness")).sendKeys("CyclesSales");
		Thread.sleep(3000);

//			Business Type Selection
		Select findElement2 = new Select(driver.findElement(By.id("AFBusinessType")));
		findElement2.selectByVisibleText("Private Limited");
		Thread.sleep(3000);

//			Type Of Business Premises Selection
		Select findElement3 = new Select(driver.findElement(By.id("BusinessTypePremises")));
		findElement3.selectByVisibleText("Administrative Office");
		Thread.sleep(3000);

//			Business pincode Keying
		driver.findElement(By.id("AFBusinesspincode")).sendKeys("600110");
		Thread.sleep(3000);

//			Type Of Collateral Selection
		Select findElement4 = new Select(driver.findElement(By.id("AFCollateralType")));
		findElement4.selectByVisibleText("Agricultural Collateral");
		Thread.sleep(3000);

//			Annual Turnover Keying
		driver.findElement(By.id("AFMonthlySales")).sendKeys("5500000");
		Thread.sleep(3000);

//			Number Of Years in Business Selection
		Select findElement5 = new Select(driver.findElement(By.id("AFNoofyearsincurtbusiness")));
		findElement5.selectByValue("4");
		Thread.sleep(3000);

//			Proof Of Business Radio Button Selection
		driver.findElement(By.id("AFProofbusYes")).click();
		Thread.sleep(3000);

//			Do You Have GST Registered For Your Business ? Radio Button Selection
		driver.findElement(By.id("AFGstYes")).click();
		Thread.sleep(3000);

//			Continue Button Selection
		driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-stepper pull-right businessdetsubmit')]"))
				.click();
		Thread.sleep(3000);

//		    Identity proof Upload		
		WebElement findelement6 = driver.findElement(By.xpath("//input[@id='identityproof']"));
		findelement6.sendKeys("C:\\Users\\v802\\Downloads\\moto.jpg");
		System.out.println("Uploaded file success");
		Thread.sleep(3000);

//			Income proof Upload	
		WebElement findelement7 = driver.findElement(By.xpath("//input[@id='incomeproof']"));
		findelement7.sendKeys("C:\\Users\\v802\\Documents\\vac.pdf");
		System.out.println("Uploaded file success");
		Thread.sleep(3000);

//			String File = "C:\\Users\\v802\\Documents\\sample-boat-400x300.png";
//	        WebElement Inp = driver.findElement(By.xpath("//input[@type='file']"));
//	        Inp.sendKeys(File);

//		String File1 = "C:\\Users\\v802\\Documents\\vac.pdf";
//		WebElement ap = driver.findElement(By.xpath("//input[@type='file']"));
//		ap.sendKeys(File1);

//			Address proof Upload
		WebElement findElement8 = driver.findElement(By.xpath("//input[@id='addressproof']"));
		findElement8.sendKeys("C:\\Users\\v802\\Documents\\sample-boat-400x300.png");
		System.out.println("Uploaded File Successful");

//			Preview Selection
		Thread.sleep(30000);
		driver.findElement(By.xpath("//a[@id='identityproof']")).click();
		Thread.sleep(30000);

//			Preview Selection
		driver.findElement(By.xpath("//a[@id='incomeproof']")).click();
		Thread.sleep(30000);

//			Preview Selection
		driver.findElement(By.xpath("//a[@id='addressproof']")).click();
		Thread.sleep(30000);

//			Multiple Window Handling (Closing the 2nd window & coming back to the main window)
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();

		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child = I1.next();

			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				driver.close();
				System.out.println(driver.switchTo().window(parent).getTitle());
				Thread.sleep(3000);

			}
		}

//			Submit Button Selection
		driver.findElement(By.xpath("//*[@id=\"DocumentsubmitForm\"]/div[3]/div[2]/button")).click();

		/*
		 * // creating object of Robot class Robot rb = new Robot(); WebElement
		 * findElement6 = driver.findElement(By.xpath("//input[@id='identityproof']"));
		 * 
		 * // copying File path to Clipboard StringSelection str=new
		 * StringSelection("C:\\Users\\t262\\Documents\\DSC_4179_copy_11zon.jpeg");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 * 
		 * // press Contol+V for pasting rb.keyPress(KeyEvent.VK_CONTROL);
		 * rb.keyPress(KeyEvent.VK_V);
		 * 
		 * // release Contol+V for pasting rb.keyRelease(KeyEvent.VK_CONTROL);
		 * rb.keyRelease(KeyEvent.VK_V);
		 * 
		 * // for pressing and releasing Enter rb.keyPress(KeyEvent.VK_ENTER);
		 * rb.keyRelease(KeyEvent.VK_ENTER);
		 */
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
