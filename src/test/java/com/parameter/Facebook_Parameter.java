package com.parameter;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Parameter {
	WebDriver driver;
	@Parameters({"url", "Username" , "Password"})
	@Test
	public void Open_Browser(String URL , String Usertext , String Passtext) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Usertext);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(Passtext);
		driver.quit();
	}

}
