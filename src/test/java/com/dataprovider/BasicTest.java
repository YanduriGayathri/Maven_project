package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
@Test(dataProvider ="loginTestData" )
public void TestLogin(String userName, String password) {
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://adactinhotelapp.com/");
	d.findElement(By.id("username")).sendKeys(userName);
	d.findElement(By.id("password")).sendKeys(password);
	d.findElement(By.id("login")).click();
	d.quit();
}
@DataProvider(name="loginTestData")
public Object[][] login() {
	Object[][] data =new Object[2][2];
	data[0][0]="yanduri11";
	data[0][1]="Gaya3@12";
	
	data[1][0]="Yanduri";
	data[1][1]="123";
	return data;
	
	
	
}
}
