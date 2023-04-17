package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGs {
	WebDriver d;
	   @Test
	  public void TestGoogle() throws Exception {
		   WebDriverManager.chromedriver().setup();
		   d = new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("https:\\www.google.com/");
		  d.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
	String expectedTitle="HYR Tutorials - Google Searchhh";
	String actualTitle=d.getTitle();
	Assert.assertEquals(expectedTitle, actualTitle,"Title is missmatched");
	Thread.sleep(1000);
d.quit();
	  }
	   @Test
	   public void TestFacebook() throws Exception {
		   WebDriverManager.chromedriver().setup();
		   d = new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("https:\\www.facebook.com/");
		  d.findElement(By.id("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		  System.out.println(d.getTitle());
		  Thread.sleep(1000);
		  d.quit();
		  }
	  }



	   

