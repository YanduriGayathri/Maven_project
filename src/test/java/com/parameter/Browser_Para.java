package com.parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Para {
	WebDriver driver;
	@Parameters({"BrowserName","url","username","password",})
	@Test
	public void Open_Browser(String BrowserName,String URL,String User,String Pass) {
		if (BrowserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(BrowserName.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(User);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(Pass);
		driver.quit();
	}
	
}
