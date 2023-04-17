package com.timeout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOut {
  
	@Test(timeOut =2000 )
	public void testmethod1() {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("https://www.hyrtutorials.com/");
		d.quit();
	}
}
