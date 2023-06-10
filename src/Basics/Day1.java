package Basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void AfterExec()
	{
		System.out.println("Im executing after test\n");
	}

    @Parameters({"URL"})
	@Test
	public void method1(String SURL)
	{
		System.out.println("Hello TestNG \n");
		System.out.println(SURL);
	}
	
	@Test
	public void method2()
	{
		System.out.println("Bye TestNG \n");
	}
}
