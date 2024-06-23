import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test(priority = -10)
	public void a() {
		System.out.println("Hello a method");
	}
	
	@Test(priority = 2)
	public void  b() {
		System.out.println("Hello b method");
	}

	
	@Test(priority = 0)
	public void c() {
		System.out.println("Hello c method");
	}

	
	@Test
	public void d() {
		System.out.println("Hello d method");
		
	}
}
