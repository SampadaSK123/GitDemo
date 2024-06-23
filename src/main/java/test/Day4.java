package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void WebLoginHomeLoan()
	{
		//Selenium
		System.out.println("Webloginhome");
		Assert.assertTrue(false);
	}
	
	private boolean AssertTrue(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Parameters({"usrname","paswrd"})
	@Test
	public void MobileLoginCarLoan(String usrname, String pswrd)
	{
		//Appium
		System.out.println("Mobileloginhome");
		System.out.println(usrname);
		System.out.println(pswrd);


	}

	@Test(dataProvider="getData")
	public void APILoginCarLoan(String username, String psword)
	{
		//Rest API 
		System.out.println("APIloginhome");
		System.out.println(username);
		System.out.println(psword);

	}
      @DataProvider
      public Object[][] getData()
      {
    	  Object[][] data=new Object[3][2];
		   data[0][0]="SampadaSK";
	       data[0][1]="1234";
	       data[1][0]="PankajPK";
	       data[1][1]="5678";
	       data[2][0]="TushTP";
          data[2][1]="1092";
          return data;

      }

}
