package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Excel_Utils {
    
static Excel_Reader reader;

    
    public static  ArrayList<Object[]> getDataFromexcel() {
  
        
        ArrayList<Object[]> myData=new ArrayList<Object[]>();
        try {
            
        
            reader=new Excel_Reader("E:\\selenium\\SEO_content\\practice\\Excel\\Book1.xlsx");
           
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
            String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
            String PageURL = reader.getCellData("Sheet1", "PageURL", rowNum);
            
            String Title = reader.getCellData("Sheet1", "Title", rowNum).toLowerCase();
            if(Title.length()==0) {
                Title = "No excel data found";
            }
            String Description = reader.getCellData("Sheet1", "Description", rowNum).toLowerCase();
            if(Description.length()==0) {
                Description = "No excel data found";
            }
            String keywords = reader.getCellData("Sheet1", "keywords", rowNum).toLowerCase();
    
            if(keywords.length()==0) {
                keywords =  "No excel data found";        
            }
             
            Object ob[]= {INDEX,PageURL,Title,Description,keywords};
                    
            myData.add(ob);
           
        }
        return myData;
   
    }
    
//Title validation
    public static void writeinexcel2(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "E:\\selenium\\SEO_content\\practice\\Excel\\Book1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(5);
        if (value=="FAIL") {
               XSSFCellStyle my_style = wb.createCellStyle();
               XSSFFont my_font=wb.createFont();
               my_font.setColor(XSSFFont.COLOR_RED);
               my_style.setFont(my_font);
               c.setCellValue(value);
                c.setCellStyle(my_style);

        }else {
             c.setCellValue(value);
        }
       
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }
    //Description validation
    public static void writeinexcel3(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "E:\\selenium\\SEO_content\\practice\\Excel\\Book1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(6);
        if (value=="FAIL") {
            XSSFCellStyle my_style = wb.createCellStyle();
            XSSFFont my_font=wb.createFont();
            my_font.setColor(XSSFFont.COLOR_RED);
            my_style.setFont(my_font);
            c.setCellValue(value);
             c.setCellStyle(my_style);

        }else {
             c.setCellValue(value);
        }
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }
    //keywords validation
    public static void writeinexcel4(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "E:\\selenium\\SEO_content\\practice\\Excel\\Book1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(7);
        if (value=="FAIL") {
             XSSFCellStyle my_style = wb.createCellStyle();
             XSSFFont my_font=wb.createFont();
             my_font.setColor(XSSFFont.COLOR_RED);
             my_style.setFont(my_font);
             c.setCellValue(value);
              c.setCellStyle(my_style);

         }else {
              c.setCellValue(value);
         }
       
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }
    //title,description,title
    public static void writeinexcel5(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "E:\\selenium\\SEO_content\\practice\\Excel\\Book1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        
        XSSFCell c = row.createCell(8);
        if (value.length()>0) {
              XSSFCellStyle my_style = wb.createCellStyle();
              XSSFFont my_font=wb.createFont();
              my_font.setColor(XSSFFont.COLOR_RED);
              my_style.setFont(my_font);
              c.setCellValue(value);
               c.setCellStyle(my_style);

          }else {
               c.setCellValue(value);
          }
        
       
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }
    public static void writeinexcel6(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "E:\\selenium\\SEO_content\\practice\\Excel\\Book1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(9);
        if (value.length()>0) {
               XSSFCellStyle my_style = wb.createCellStyle();
               XSSFFont my_font=wb.createFont();
               my_font.setColor(XSSFFont.COLOR_RED);
               my_style.setFont(my_font);
               c.setCellValue(value);
                c.setCellStyle(my_style);

           }else {
                c.setCellValue(value);
           }
     
        
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    

}
    public static void writeinexcel7(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "E:\\selenium\\SEO_content\\practice\\Excel\\Book1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(10);
        if (value.length()>0) {
               XSSFCellStyle my_style = wb.createCellStyle();
               XSSFFont my_font=wb.createFont();
               my_font.setColor(XSSFFont.COLOR_RED);
               my_style.setFont(my_font);
               c.setCellValue(value);
                c.setCellStyle(my_style);

           }else {
                c.setCellValue(value);
           }
        
        
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
}

    public static void writeinexcel9(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "E:\\selenium\\SEO_content\\practice\\Excel\\Book1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(11);
        int H1parseInt = Integer.parseInt(value);
        if (H1parseInt >1) {
            XSSFCellStyle my_style = wb.createCellStyle();
            XSSFFont my_font=wb.createFont();
            my_font.setColor(XSSFFont.COLOR_RED);
            my_style.setFont(my_font);
            c.setCellValue(value);
            c.setCellStyle(my_style);
            

        }else {
             c.setCellValue(value);
        }
        
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }
    public static void writeinexcel10(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "E:\\selenium\\SEO_content\\practice\\Excel\\Book1.xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(12);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }
    
    
}