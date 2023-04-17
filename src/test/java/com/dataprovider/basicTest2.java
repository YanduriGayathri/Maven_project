package com.dataprovider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class basicTest2 {
//	@Test(dataProvider ="dp2" )
//	public void TestLogin(String s) {
//		System.out.println(s);
//			}
//	@DataProvider(name="dp2")
//	public String[] dp1() {
//		//single dimensional array
//		String[] data=new String[] {"abcd","xyz","pqr"};
//	return data;
//
//}}
//---------------------------------------------
//public class basicTest2 {
//	@Test(dataProvider ="dp1" )
//	public void TestLogin(Integer i) {
//		System.out.println(i);
//			}
//	@DataProvider()
//	public Integer[] dp1() {
//		//single dimensional array
//		Integer[] data=new Integer[] {
//		        1,
//		        2,
//		       3
//	};
//	return data;
//
//}}
//--------------------------------------------------
//public class basicTest2 {
//	@Test(dataProvider ="dp1" )
//	public void TestLogin(Object i) {
//		System.out.println(i);
//			}
//	@DataProvider()
//	public Object[] dp1() {
//		//Object is accepted any type of data
//		Object[] data=new Object[] {
//		        1,
//		        2,
//		       "hello"
//	};
//	return data;
//
//}}
//--------------------------------------------------------

//public class basicTest2 {
//	@Test(dataProvider ="dp1" )
//	//public void TestLogin(String[] s) {
//		public void TestLogin(String username, String password) {
//		//System.out.println(s[0]+" >> "+s[1]);
//	System.out.println(username+" >>"+password);
//			}
//	@DataProvider()
//	public String[][] dp1() {
//		//it is stored srings of data
//		String[][] data=new String[][] 
//				{{"abc", "111"},
//				{"cbc", "222"},
//				{"bbbb", "333"}};
//	return data;
//
//}}
//-------------------------------------------------
//public class basicTest2 {
//	@Test(dataProvider ="dp1" )
//	public void TestLogin(String[] s) {
//		for(int i=0; i<s.length; i++) {
//			System.out.println(s[i]);
//		}
//		System.out.println(">>>>>>>>");
//	
//			}
//	//zaged array
//	@DataProvider()
//	public String[][] dp1() {
//		//it is stored srings of data
//		String[][] data=new String[][] 
//				{{"abc", "111","222","ccc"},
//				{"cbc", "222"},
//				{"bbbb", "333","12335"}};
//	return data;
//
//}}
//------------------------------------------
//public class basicTest2 {
//	@Test(dataProvider ="dp1" )
//	public void TestLogin(Object[] s) {
//		for(int i=0; i<s.length; i++) {
//			System.out.println(s[i]);
//		}
//		System.out.println(">>>>>>>>");
//	
//			}
//	//zaged array
//	@DataProvider()
//	public Object[][] dp1() {
//		//zajed array
//		Object[][] data=new Object[][] 
//				{{"abc", 111, 222,"ccc"},
//				{"cbc", 222},
//				{"bbbb", 333, 12335}};
//	return data;
//
//}}
//------------------------------------------
public class basicTest2 {
	@Test(dataProvider ="dp1" )
	public void TestLogin(String s) {
		System.out.println(s);
				}
	//zaged array
	@DataProvider()
	public  Iterator<String>  dp1() {
		List<String> data= new ArrayList<>();
		data.add("Gayathri");
		data.add("Yanduri");
		return data.iterator();
		
		
}}



