package Articleslinks;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Articlesauthors {
	
	public static void main(String[] args) {
		WebDriver driver;

	    WebDriverManager.chromedriver().setup();

	    driver = new ChromeDriver();

	    driver.manage().window().maximize();

	    driver.get("http:uat.shriram.com");

	List<WebElement> links = driver.findElements(By.tagName("a"));

	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e2) {
	        e2.printStackTrace();
	    }

	    Iterator<WebElement> it = links.iterator();

	    int count = 1;

	    while (it.hasNext()) {

	        System.out.println(count++);

	        String url = it.next().getAttribute("href");
	        
	        System.out.println(url);
	        
	    }
	}

	
	
}
