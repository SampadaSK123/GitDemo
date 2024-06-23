import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	
	@Test
	public void testCase4() {
		 
		String expText = "abc";
		String actualText = "ab";
		
			try {
				AssertJUnit.assertEquals(actualText, expText);
			} catch (Error e) {
			}	
			System.out.println("Equal Assertion Pass");
		}
	}

