import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
	
	//1st way by comment it
	//@Test 
	public void a() {
		System.out.println("a test method");
	}
	
	//2nd way - widely used in market
	@Test(enabled = false)
	public void  b() {
		System.out.println("b test method");
	}

	
	@Test(enabled = true)
	public void c() {
		System.out.println("c test method");
	}

	
	//InvocationCount - 2 times
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("d test method");
	}
	
	
	//3rd way - InvocationCount - 0 times  
		@Test(invocationCount = 0)
		public void e() {
			System.out.println("e test method");
		}
		
		
	//Conditional skipping
		@Test
		public void f() {
			System.out.println("f test method");
			throw new SkipException("Skipping f test method");

			
		}

}
