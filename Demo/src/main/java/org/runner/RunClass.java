package org.runner;

import java.util.ArrayList;
import java.util.Iterator;

import org.baseclass.BaseClass;
import org.excel.Excel_Utility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class RunClass extends BaseClass {
	
	
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {

	    ArrayList<Object[]> testData = Excel_Utility.getDataFromexcel();
	    return testData.iterator();

	}

	@Test(dataProvider = "getTestData")
	
	private void launch() {
		// TODO Auto-generated method stub

//	public static void main(String[] args) {
		
	
	
	
	
	launchBrowser("chrome");
		
	}
		
//	}
		

}
