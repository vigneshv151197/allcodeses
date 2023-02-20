package Excel_Utils;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

import Excel_Reader.Excelreader;

public class Excelutils {

	static Excelreader reader;

	public static ArrayList<Object[]> getDataFromexcel() {
	    ArrayList<Object[]> myData = new ArrayList<Object[]>();
	    try {
	        String s = "‪C:\\Users\\v802\\Downloads\\Data1.xlsx";
	        System.out.println(s);
	        reader = new Excelreader(s);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
	Object ob[] = { };
	myData.add(ob);
	    }
	    return myData;

	}
	
	
}



	
