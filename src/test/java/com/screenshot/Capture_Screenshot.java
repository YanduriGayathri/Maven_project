package com.screenshot;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture_Screenshot extends Base_Test{
	
	   @Test(testName = "OrangeHRM")
	  public void OrangeHRM() throws Exception {
		  
		   d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		   d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		   d.findElement(By.xpath("//button[@type='submit']")).click();
		   d.quit();
	   }
	   @Test(testName = "GitHUB")
	   public void GitHUB()   {
		d.get("https://github.com/login");
		//d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		d.findElement(By.id("login_field")).sendKeys("youngstoner4511@gmail.comm");
		d.findElement(By.id("password")).sendKeys("Sree@2601900");
		d.findElement(By.xpath("//*[@name='commit']")).click();
		System.out.println(d.getCurrentUrl());
		Assert.assertEquals(d.getCurrentUrl(),"https://github.com/login" );
		
		d.quit();
		   }
	   @Test(testName = "Reddit")
	   public void Reddit() {
			d.get("https://www.reddit.com/login/");
			d.findElement(By.id("loginusername")).sendKeys("youngstoner451@gmail.com");
			d.findElement(By.id("loginPassword")).sendKeys("Sree@260190");
			d.findElement(By.xpath("//*[@name='commit']")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.linkText("Forgot password?")).click();
			d.quit();
		}
}
