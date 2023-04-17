package com.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaproject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

 WebDriver driver = new ChromeDriver();
 driver.get("https://adactinhotelapp.com/");
 driver.findElement(By.id("username")).sendKeys("yandurii");
 driver.findElement(By.id("password")).sendKeys("Gaya3@12");
 driver.findElement(By.id("login")).click();
 Thread.sleep(1000);
WebElement locatElement = driver.findElement(By.id("location"));
 Select locationList=new Select(locatElement);
 //List<WebElement> locationOption=locationList.getOptions();
 locationList.selectByIndex(2);
 Thread.sleep(3000);
 locationList.selectByValue("Brisbane");
 Thread.sleep(3000);
 locationList.selectByVisibleText("London");
 Thread.sleep(3000);
 locationList.selectByValue("Adelaide");
 Thread.sleep(1000);
 locationList.selectByValue("New York");
 Thread.sleep(1000);
 locationList.selectByValue("Los Angeles");
 Thread.sleep(1000);
 locationList.selectByValue("Paris");
 WebElement hotelElement = driver.findElement(By.id("hotels"));
 Select hotelList=new Select(hotelElement);
 hotelList.selectByValue("Hotel Creek");
 hotelList.selectByValue("Hotel Sunshine");
 hotelList.selectByValue("Hotel Hervey");
 hotelList.selectByValue("Hotel Cornice");
 WebElement RoomElement = driver.findElement(By.id("room_type"));
 Select RoomList=new Select(RoomElement);
 RoomList.selectByValue("Standard");
 RoomList.selectByValue("Double");
 RoomList.selectByValue("Deluxe");
 RoomList.selectByValue("Super Deluxe");
 WebElement numberofElement = driver.findElement(By.id("room_nos"));
 Select numberList=new Select(numberofElement);
 numberList.selectByValue("1");
 numberList.selectByValue("2");
 numberList.selectByValue("3");
 numberList.selectByValue("4");
 numberList.selectByValue("5");
 numberList.selectByValue("6");
 numberList.selectByValue("7");
 numberList.selectByValue("8");
 numberList.selectByValue("9");
 numberList.selectByValue("10");
 //WebElement CheckInDate=driver.findElement(By.id("datepick_in"));
// Select CheckInDatelist = new Select (CheckInDate);
// CheckInDatelist.selectByValue("25/01/2023");
// Thread.sleep(1000);
// WebElement CheckOutDate=driver.findElement(By.id("datepick_in"));
// Select CheckOutDatelist = new Select (CheckOutDate);
// CheckOutDatelist.selectByValue("26/01/2023");
// Thread.sleep(1000);
 WebElement AdultsperRoom=driver.findElement(By.id("adult_room"));
 Select AdultsperRoomList = new Select (AdultsperRoom);
 AdultsperRoomList.selectByValue("1");
 Thread.sleep(1000);
 AdultsperRoomList.selectByValue("2");
 Thread.sleep(1000);
 AdultsperRoomList.selectByValue("3");
 Thread.sleep(1000);
 AdultsperRoomList.selectByValue("4");
 Thread.sleep(1000);
 WebElement ChildrenperRoom=driver.findElement(By.id("child_room"));
 Select ChildrenperRoomList = new Select (ChildrenperRoom);
 ChildrenperRoomList.selectByValue("0");
 Thread.sleep(1000);
 ChildrenperRoomList.selectByValue("1");
 Thread.sleep(1000);
 ChildrenperRoomList.selectByValue("2");
 Thread.sleep(1000);
 ChildrenperRoomList.selectByValue("3");
 Thread.sleep(1000);
 ChildrenperRoomList.selectByValue("4");
 Thread.sleep(1000);
 driver.findElement(By.id("Submit")).click();
 Thread.sleep(1000);
 WebElement radio=driver.findElement(By.id("radiobutton_0"));
 radio.click();
 radio.isSelected();
 Thread.sleep(1000);
 driver.findElement(By.id("continue")).click();
 Thread.sleep(1000);
 driver.findElement(By.id("first_name")).sendKeys("sreekanth");
 Thread.sleep(1000);
 driver.findElement(By.id("last_name")).sendKeys("reddy");
 Thread.sleep(1000);
 driver.findElement(By.id("address")).sendKeys("8/241 near kphb hyderebad");
 Thread.sleep(1000);
 driver.findElement(By.id("cc_num")).sendKeys("3141592653589793");
 Thread.sleep(1000);
 WebElement CreditCard=driver.findElement(By.id("cc_type"));
 Select CreditCardList = new Select(CreditCard);

 CreditCardList.selectByValue("AMEX");
 Thread.sleep(1000);
 CreditCardList.selectByValue("VISA");
 Thread.sleep(1000);
 CreditCardList.selectByValue("MAST");
 Thread.sleep(1000);
 CreditCardList.selectByValue("OTHR");
 Thread.sleep(1000);
 WebElement SelectMonthDate=driver.findElement(By.id("cc_exp_month"));
 Select  SelectMonthList = new Select(SelectMonthDate);
 SelectMonthList.selectByValue("1");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("2");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("3");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("4");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("5");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("6");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("7");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("8");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("9");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("10");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("11");
 Thread.sleep(1000);
 SelectMonthList.selectByValue("12");
 Thread.sleep(1000);
 WebElement ExpiryYear=driver.findElement(By.id("cc_exp_year"));
 Select ExpiryYearList = new Select(ExpiryYear);
 ExpiryYearList.selectByValue("2011");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2012");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2013");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2014");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2015");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2016");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2017");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2018");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2019");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2020");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2021");
 Thread.sleep(1000);
 ExpiryYearList.selectByValue("2022");
 Thread.sleep(1000);
 driver.findElement(By.id("cc_cvv")).sendKeys("667");
 Thread.sleep(1000);
 driver.findElement(By.id("book_now")).click();
 Thread.sleep(1000);
 driver.findElement(By.id("search_hotel")).click();










 
 	}

}
