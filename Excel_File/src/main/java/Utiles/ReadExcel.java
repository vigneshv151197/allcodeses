package Utiles;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
public static void main(String[] args) {
	   getRowCount();
}
	

	public static void getRowCount()  {
		
		
		try {
			String pp = System.getProperty("user.dir");
			XSSFWorkbook wb = new XSSFWorkbook(pp+ "/EXCEL/Data.xlsx");
			XSSFSheet sh = wb.getSheet("Sheet1");
		   
	//	    int rowCount = sheet.getPhysicalNumberOfRows();
			
			
			
		} catch (IOException e) {
			System.out.print(e.getMessage());
			System.out.print(e.getCause());
			e.printStackTrace();
		}
	
		}	
	
	
	
	
	
	
	
}