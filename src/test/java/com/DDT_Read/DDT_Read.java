package com.DDT_Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class DDT_Read {
	public static void main(String[] args) throws Exception {
		File excelFile = new File("D:\\DDT_HyR.xlsx");
		System.out.println(excelFile.exists());
		FileInputStream fis =new FileInputStream(excelFile);
		XSSFWorkbook wf = new XSSFWorkbook(fis);
		XSSFSheet sheet = wf.getSheet("Sheet1");
		//System.out.println(sheet.getPhysicalNumberOfRows());
		//how maney number of rows in excelsheet
		int noofRows= sheet.getPhysicalNumberOfRows();
		int noofcolumns = sheet.getRow(0).getLastCellNum();
		//System.out.println(sheet.getLastRowNum());
		//how maney number of rows in work book
		for (int i = 1; i < noofRows ; i++) {
			for (int j = 0; j < noofcolumns; j++) {
				DataFormatter df = new DataFormatter();
			System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				}
			System.out.println();
		}
		
		
		wf.close();
		fis.close();
	
	
	
	
	
	
	
	}

}
