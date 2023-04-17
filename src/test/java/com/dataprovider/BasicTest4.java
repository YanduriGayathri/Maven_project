package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest4 {
//what is data provider class
	public class basicTest2 {
		@Test(dataProvider ="dp2", dataProviderClass = BasicTest5.class)
		public void TestLogin(String s) {
			System.out.println(s);
				}
		}}
	

