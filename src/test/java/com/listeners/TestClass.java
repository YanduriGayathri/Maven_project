package com.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ItestListener.class)
public class TestClass {
@Test
public void testMethod11() {
	System.out.println("I'M inside method1");
}
@Test
public void testMethod2() {
	System.out.println("i'm inside method2");
	Assert.assertTrue(false);
}
@Test(timeOut = 1000)
public void testMethod3() throws Exception {
	Thread.sleep(2000);
	System.out.println("i'm inside method3");
}
@Test(dependsOnMethods = "testMethod3")
public void testMethod4() {
	System.out.println("i'm inside method4");
}

}
