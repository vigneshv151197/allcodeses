package Goldloan;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gl {

	public static WebDriver driver;

 	@BeforeMethod
 	public void beforeMethod() {
 		WebDriverManager.chromedriver().setup();
 		driver =  new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		driver.get("https://digital.novactech.in/gold-loan-apply-online?token=e85629a515c815eae9fff6023416d9f6");
 		System.out.println(driver.getTitle());
 	}
 	
 	
 	@Test
 	public void Goldloancustomers() throws InterruptedException {
// 		Scroll down
 		Thread.sleep(3000);
		JavascriptExecutor SD = (JavascriptExecutor) driver;
		SD.executeScript("window.scrollBy(0,100)");

//      Agree		
		Thread.sleep(3000);
 		driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div[1]/div[1]/label/span[2]")).click();		
		
//      Get Loan
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div[1]/div[2]/div")).click();		
		
//		OTP
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("/html/body/section/div[4]/div/div[1]/div/div/div[2]/div/div[1]/div/div/div/div[3]/form/ul/li[1]/div/input")).click();		
		
 		 //OTP Input Fields
 		driver.findElement(By.xpath("(//input[@class='form-control otp number-valid'])[1]")).sendKeys("1");
 		driver.findElement(By.xpath("(//input[@class='form-control otp number-valid'])[2]")).sendKeys("1");
 		driver.findElement(By.xpath("(//input[@class='form-control otp number-valid'])[3]")).sendKeys("1");
 		driver.findElement(By.xpath("(//input[@class='form-control otp number-valid'])[4]")).sendKeys("1");
 		driver.findElement(By.xpath("(//input[@class='form-control otp number-valid'])[5]")).sendKeys("1");
 		driver.findElement(By.xpath("(//input[@class='form-control otp number-valid'])[6]")).sendKeys("1");
 		Thread.sleep(3000);		
 		
//      Verify Button
 		driver.findElement(By.id("stage-v-g")).click();			
 		Thread.sleep(2000);
 		
//      Accept 		
// 		Thread.sleep(3000);
// 		driver.findElement(By.id("bank-next-2")).click();
 		
 // Confirm your Pledged Loan Amount		
 		JavascriptExecutor DS = (JavascriptExecutor) driver;
		DS.executeScript("window.scrollBy(0,100)");		
 		Thread.sleep(2000);
 		driver.findElement(By.id("bank-next-2")).click();			
 		Thread.sleep(2000);
 		
 	
 		
 		
 	}	
}
