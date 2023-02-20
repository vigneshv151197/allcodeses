package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.LibGlobal;

public class Employmentdetails extends LibGlobal{
	
		public Employmentdetails() {
		
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(id="TWEmpType")
		private WebElement Employmenttype;
	
		public WebElement getEmploymenttype() {
			return Employmenttype;
		}
		
		@FindBy(id="TWMonthSalary")
		private WebElement Salary;
	
		public WebElement getSalary() {
			return Salary;
		}
	
}
