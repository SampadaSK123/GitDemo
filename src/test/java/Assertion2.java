import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	
	@Test
	public void testCase2() {
		 
		String actualText = "ab";
		String expText = "ab";
		
		int a = 10;
		int b = 20;
		
		//Equal Assertion
		AssertJUnit.assertEquals(actualText, expText, "Actual and Expected are not matching");
		System.out.println("Equal Assertion Pass");
		
		//False Assertion
		AssertJUnit.assertFalse(a>b, "Assertion False is not satisfying");
		System.out.println("False Assertion Pass");

		
		//True Assertion
				AssertJUnit.assertTrue(a>b, "Assertion True is not satisfying");
				System.out.println("False Assertion Pass");
				//Assertion failed, execution will stop here
				//Further line of code will not execute
				System.out.println("True Assertion Pass");
	}
	
	@Test
	public void testCase3() {
		//Assertion is written in testCase2() method
		//Scope of assertion will be limited to testCase2() method only
		System.out.println("Hello testCase3() method");

	}

}

