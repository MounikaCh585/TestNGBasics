package Basics;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Day3 {
	
	@BeforeClass
	public void BfClass()
	{
		System.out.println("\nWill execute first before anyof the methods in this class executes\n");
	}
	//@Parameters({"C_URL"})
	@Test
	public void WebLoginCloan(String SCURL)
	{
		System.out.println("WebLogin of Car Loan Department\n");
		//System.out.println(SCURL);
	}
	
	@BeforeMethod
	public void BfMethod()
	{
		System.out.println("\nWill execute before each method of this class\n");
	}
	
	@Test
	public void MobileLoginCloan()
	{
		System.out.println("MobileLogin of Car Loan Department\n");
	}
	
	@Test
	public void MobileSigninCloan()
	{
		System.out.println("MobileSignin of Car Loan Department\n");
	}
	
	@AfterMethod
	public void AfMethod()
	{
		System.out.println("\nWill execute After each method of this class\n");
	}
	@Test(groups= {"smoke"})
	public void MobileSignOutCloan()
	{
		System.out.println("MobileSignOut of Car Loan Department\n");
	}

    
	@Test()
	public void APILoginCloan()
	{
		System.out.println("APILogin of Car Loan Department\n");
		
	}
}
