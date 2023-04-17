package com.DDT_Read;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data {
	@Test(dataProvider = "loginData", dataProviderClass = DDT_dataprovider.class)
	public void TestLogin(String userName, String Password) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://adactinhotelapp.com/");
		d.findElement(By.id("username")).sendKeys(userName);
		d.findElement(By.id("password")).sendKeys(Password);
		d.findElement(By.id("login")).click();
		org.testng.Assert.assertEquals(d.getCurrentUrl(), "https://adactinhotelapp.com/SearchHotel.php");

		d.quit();
	}

}
