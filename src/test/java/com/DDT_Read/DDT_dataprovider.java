package com.DDT_Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DDT_dataprovider {
	
	@DataProvider(name="loginData")
	public String[][] getData() throws Exception{
		
	
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
	String[][] data = new String[noofRows-1][noofcolumns];
	for (int i = 0; i < noofRows-1 ; i++) {
		for (int j = 0; j < noofcolumns; j++) {
			DataFormatter df = new DataFormatter();
		data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		//System.out.println();
	}
	
	
	wf.close();
	fis.close();
	
//	for (String[] dataArray : data) {
//		System.out.println(Arrays.toString(dataArray));
//
//	}
	
	return data;






	}
}
