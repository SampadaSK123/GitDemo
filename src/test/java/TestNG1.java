import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a2() {
		System.out.println("Hello a2 method");
	}
	
	@BeforeTest 
	public void b() {
		System.out.println("Hello b method");
	}

	@BeforeSuite
	public void c() {
		System.out.println("Hello c method");
	}

	@BeforeMethod
	public void d() {
		System.out.println("Hello d method");
	}

	@BeforeClass
	public void e() {
		System.out.println("Hello e method");
	}

	@AfterTest
	public void f() {
		System.out.println("Hello f method");
	}

	@AfterClass
	public void g() {
		System.out.println("Hello g method");
	}

	@BeforeMethod
	public void h() {
		System.out.println("Hello h method");
	}

	
	@AfterSuite
	public void i() {
		System.out.println("Hello i method");
	}

	@Test
	public void a1() {
		System.out.println("Hello a1 method");
	}
}

