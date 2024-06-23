package test;

import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void WebLoginCarLoan()
	{
		//Selenium
		System.out.println("Weblogincar");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");

	}

	@Test(groups= {"Smoke"})
	public void APILoginCarLoan()
	{
		//Rest API 
		System.out.println("APIlogincar");

	}

}
