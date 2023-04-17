package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterClass
public class Annotation {
@Test
public void testmethod() {
	System.out.println("Test");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("BeforeMethod");
}
@AfterMethod
public void aftermethod() {
	System.out.println("AfterMethod");
}
@BeforeClass
public void beforeclass() {
	System.out.println("BeforeClass");
}
@AfterClass
public void afterclass() {
	System.out.println("AfterClass");
}
@BeforeTest
public void beforetest() {
	System.out.println("@BeforeTest");
}
@AfterTest
public void Aftertest() {
	System.out.println("@AfterTest");
}
@BeforeSuite
public void beforesuit() {
	System.out.println("@BeforeSuite");
}
@AfterSuite
public void Aftersuit() {
	System.out.println("@AfterSuite");
}





}
