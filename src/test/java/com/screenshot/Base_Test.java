package com.screenshot;



import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test {
public static 	WebDriver d;
public static String screenshotsFolderName;
	   @BeforeTest
	  public void Setup() throws Exception {
		   WebDriverManager.chromedriver().setup();
		   d = new ChromeDriver();
		   d.manage().window().maximize();
		  
	   }
	   @AfterTest
	   public void Tear_Down()   {
	  
		d.quit();
		   }
//	   @AfterMethod
//	   public void screenshotcapture(ITestResult result) {
//		   if (result.getStatus() == ITestResult.FAILURE) {
//			   CaptureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpg");
//		}
//		   
//	   }
	   
	   public void CaptureScreenshot(String fileName) {
		   if(screenshotsFolderName == null) {
		   LocalDateTime myDateObj = LocalDateTime.now();
		  
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");

		    screenshotsFolderName = myDateObj.format(myFormatObj);
		    
		   }
		   TakesScreenshot takesScreenshot = (TakesScreenshot) d;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("D:\\test2.png"+fileName );
			try {
				FileUtils.copyFile(sourceFile, destFile);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Screenshot saved successfully");
		}
}
