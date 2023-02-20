package SMSGL;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GL {
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
 		WebDriverManager.chromedriver().setup();
 		driver =  new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		driver.get("https://digital.novactech.in/personal-loan-apply?token=3036ad531231991d667a8b826493769e");
 		System.out.println(driver.getTitle());
 	}
	
	@Test
	public void Aadharupload() throws Throwable  {

//		Aggre
		driver.findElement(By.xpath("(//span[@class='checkmark'])[1]")).click();
		Thread.sleep(3000);
	
//		Submit
		driver.findElement(By.xpath("(//div[@class='btn-fixed'])[1]")).click();
		Thread.sleep(3000);	
	
	
	}
}
