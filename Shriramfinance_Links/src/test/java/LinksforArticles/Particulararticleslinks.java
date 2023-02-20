package LinksforArticles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.SystemUtils;
import org.base.BaseClass;
import org.excel.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.Baseclass.LibGlobal;

import Excelclass.ExcelUtiles;
public class Particulararticleslinks extends LibGlobal{
 	    
	    static  List<String> data= new ArrayList<String>();
	    
	     @DataProvider
	        public Iterator<Object[]> getTestData() {

	            ArrayList<Object[]> testData = ExcelUtiles.getDataFromexcel();
	            return testData.iterator();

	        }
	    
	    
	    @Test(dataProvider = "getTestData")
	    public void execute(String INDEX, String Slug_URL) {
	        


	         
	         try {
	             
	            launchBrowser("chrome");

	            loadUrl(Slug_URL);
	                

	            WebElement Parent_Tag = driver.findElement(By.xpath("//div[@class='eligi_bility']"));
	             
	             List<WebElement> allLinks = Parent_Tag.findElements(By.tagName("a"));
	             
	             
	             for(WebElement link:allLinks){
	                 
	                 
	             String attribute = link.getAttribute("href");
	             
//	             System.out.println(attribute);
	             

	            
	             data.add(attribute);
	             
	   
	             }
	             
	             String join = String.join(", "+"\n", data );
	             System.out.println(join);
	             int parseInt = Integer.parseInt(INDEX);  
	             ExcelUtiles.writeinexcel(join, parseInt);
	             data.clear();
	             
	             
	        } catch (Exception e) {
	            
	            e.printStackTrace();
	            
	        }
	                      
	         driver.quit();
	         
	     }
	    
	    
	    
	}
	

