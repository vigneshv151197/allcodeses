package FixedDeposit;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FD {

	public static WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://uatdevfd.stfc.in/");
		System.out.println(driver.getTitle());
	
	}
	
	@Test
	public void FixedDeposite() throws Throwable {
	
//MobileNumber	
	
	WebElement Mob = driver.findElement(By.id("MobileNo"));
	Mob.sendKeys("8489611455");
	
	WebElement pincod = driver.findElement(By.id("pincode"));
	pincod.sendKeys("602001");
//	
//	Thread.sleep(2000);
//	WebElement eMAIL = driver.findElement(By.xpath("//*[@id=\"invest\"]/div/div/div/div[4]"));
//	eMAIL.sendKeys("vicky@gmail.com");
//	
	WebElement Inv = driver.findElement(By.id("invest_now_button"));
	Inv.click();
	
	
	
	}

    
	
	
	
	
}
	
	
	

