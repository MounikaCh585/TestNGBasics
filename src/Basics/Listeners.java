package Basics;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface all the methods from TestNG Interface
public class Listeners implements ITestListener{
	
  public void onTestSuccess(ITestResult result)
  {
	  System.out.println("I execute after successful testcase"+result.getName());
  }
}
