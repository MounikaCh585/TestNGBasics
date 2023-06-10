package Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {

	@Test(groups= {"smoke"})
	public void WebLoginHloan()
	{
		System.out.println("WebLogin of Home Loan Department\n");
	}
	
	@Test(dataProvider="getData")
	public void MobileLoginHloan(String username, String password)
	{
		System.out.println("MobileLogin of Home Loan Department\n");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void APILoginHloan()
	{
		System.out.println("APILogin of Home Loan Department\n");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		
		data[0][0]="First Username";
		data[0][1]="First Password";
		
		data[1][0]="Second Username";
		data[1][1]="Second Password";
		
		data[2][0]="Third Username";
		data[2][1]="Third Password";
		return data;
	}
}
