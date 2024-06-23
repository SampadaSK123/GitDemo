import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotOnFailure2 {
	
	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();
	
	@Test
	public void doLogin() throws Exception {
		WebDriverManager.chromedriver().setup();
	     t1.driver=new ChromeDriver();
		 t1.driver.manage().window().maximize();
		 t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 t1.driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 t1.driver.findElement(By.id("pass")).sendKeys("abc@gmail.com");
		 
		 //Pass wrong id so that test case will fail
		 t1.driver.findElement(By.id("email_wrong")).sendKeys("abc@gmail.com");
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) {
		t1.captureScreenshot(result2);
	}
	

}
