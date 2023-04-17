package com.parameter;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Parameter {
	
	
		WebDriver driver;
		@Parameters({"url"})
	    @Test
	    public void opengoogle(String url) {
	    	WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
		@Parameters({"search"})
	    @Test
	    public void sendkeys(String box) {
	    	driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(box,Keys.ENTER);	
	    }
	}


