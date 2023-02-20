package org.excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Excel_Utils {



    static Excel_Reader reader;

    public static ArrayList<Object[]> getDataFromexcel() {
        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            String Excel_Name="C:\\Users\\v802\\eclipse-workspace\\Excel\\Excel_Data\\Data1.xlsx";
            reader = new Excel_Reader(Excel_Name);
            System.out.println(Excel_Name);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {

        	 String MobileNumber = reader.getCellData("Sheet1", "MobileNumber", rowNum);
             String EnterPincode = reader.getCellData("Sheet1", "EnterPincode", rowNum);		
             String EmailID = reader.getCellData("Sheet1", "EmailID", rowNum);
             String invest_button = reader.getCellData("Sheet1", "invest_button", rowNum);
  
                 Object ob[] = { MobileNumber,  EnterPincode,  EmailID,  invest_button};
                 myData.add(ob);        
           
        }
        return myData;

    }
    public static void writeinexcel(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\v802\\eclipse-workspace\\Excel\\Excel_Data\\Data1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(14);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }

    public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\v802\\eclipse-workspace\\Excel\\Excel_Data\\Data1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(15);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }



}
