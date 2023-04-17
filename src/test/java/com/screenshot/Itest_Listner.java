package com.screenshot;



import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itest_Listner extends Base_Test implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getTestContext().getName()+"_"+result.getMethod().getMethodName());
		CaptureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpg");
	}
	
	  
}
