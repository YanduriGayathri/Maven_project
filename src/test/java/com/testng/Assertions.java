package com.testng;

import static org.testng.Assert.*;

//import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver d;
	   @Test
	   public void TestFacebook() throws Exception {
		   WebDriverManager.chromedriver().setup();
		   d = new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("https:\\www.facebook.com");
		  d.findElement(By.id("email")).sendKeys("HYR Tutorials", Keys.ENTER);
	//Thread.sleep(5000);
	//hard assertions
	System.out.println(d.getTitle());
	String Expected="Log in to Facebook";
	String Actual=d.getTitle();
	
	Assert.assertEquals(Expected, Actual, "title is mismatched");
	System.out.println(d.getTitle());
//	//url Assertion
	String Actualurl=d.getCurrentUrl();
	String Expectedurl="https:\\www.facebook.com";
	assertEquals(Actualurl, Expectedurl, "url is mismatched");
	//tset assertion
	String ActualText=d.findElement(By.id("email")).getAttribute("value");
	String ExpectedText="";
	assertEquals(ActualText, ExpectedText, "user name text is mismatched");
	//border message
	String ActualBorder=d.findElement(By.id("email")).getCssValue("border");
	String ExpectedBorder="1px solid rgb(240, 4, 73)";
	assertEquals(ActualBorder, ExpectedBorder, "user name border is mismatched");
	//error message
	String ActualErrorM=d.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
	String ExpectedErrorM="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
	assertEquals(ActualErrorM, ExpectedErrorM, "error message is mismatched");
	System.out.println(d.getTitle());
	d.quit();
	  }




	  
}
