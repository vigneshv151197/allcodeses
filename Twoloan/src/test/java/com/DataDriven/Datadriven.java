package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class Datadriven {
		
	public static void main(String [] args) throws Throwable {
		
		File f = new File("C:\\Users\\v802\\eclipse-workspace\\Twoloan\\DataExcel\\Vickysunday.xls‪");
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheetAt = wb.getSheetAt(0);
		
		int rowSize = sheetAt.getPhysicalNumberOfRows();
		for (int i=0; i < rowSize; i++) {
		HSSFRow row = sheetAt.getRow(i);
			 
		int cellSize = row.getPhysicalNumberOfCells();
		for (int j= 0; j< cellSize; j++) {
		HSSFCell Cell = row.getCell(j);
				 
		CellType ct = Cell.getCellType();
		
		if (ct.equals(ct.STRING)) {
		String stringcellvalue = Cell.getStringCellValue();
		System.out.println(stringcellvalue);
		}
		
		else if (ct.equals(CellType.NUMERIC)) {
		double d = Cell.getNumericCellValue();
		long l = (long) d;
		String valueOf = String.valueOf(1);
		System.out.println(valueOf);
		
		}
	}
}			
		
		System.out.println("Particular Data");	
		double v = wb.getSheetAt(0).getRow(0).getCell(1).getNumericCellValue();
		long h = (long) v;
		System.out.println(h);
		
		HSSFCell createCell = wb.getSheetAt(0).createRow(5).createCell(0);
		createCell.setCellValue("Vicky");

		FileOutputStream fos = new FileOutputStream(f);	
		wb.write(fos);
		wb.close();
	}		
}