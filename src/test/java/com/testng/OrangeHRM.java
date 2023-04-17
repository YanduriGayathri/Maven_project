package com.testng;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver d;
	   @BeforeTest
	  public void LaunchApp() throws Exception {
		   
		   WebDriverManager.chromedriver().setup();
		   d = new ChromeDriver();
		   d.manage().window().maximize();
		   d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
}
	   @Test
	   public void  EnyterLoginDetails() {
		   d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		   d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		   d.findElement(By.xpath("//button[@type='submit']")).click();
	   }
}