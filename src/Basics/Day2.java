package Basics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"smoke"})
	public void method1()
	{
		System.out.println("Hello TestNG from Day2 class \n");
	
	}
	
	@BeforeTest
	public void method2()
	{
		System.out.println("\nIm executing before test\n");
	}
}
