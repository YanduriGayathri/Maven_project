package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest3 {
	//few sets of data it is called partially data dataprovider
// partially used data provider
	public class basicTest2 {
		@Test(dataProvider ="dp1" )
		public void TestLogin(String s) {
			System.out.println(s);
				}
		@DataProvider(indices = {0,2})
		public String[] dp1() {
			//single dimensional array
			String[] data=new String[] {"Gayi","sitha","paru","srinu"};
		return data;
	
	}
		}}
	

