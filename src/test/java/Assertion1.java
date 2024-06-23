import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion1 {
	@Test 
	public void testCase1() {
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");

		 String actualText = driver.findElement(By.xpath("//h2[contains(text(),'life')]")).getText();
		 
		 //Equal assertion
		 AssertJUnit.assertEquals(actualText, expectedText); 
		 System.out.println("Equal Assertion Pass");
		 
		 //False assertion
		 AssertJUnit.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'life')]")).isSelected());
		 System.out.println("False Assertion Verified");

		//True assertion
		 AssertJUnit.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'life')]")).isDisplayed());
		 System.out.println("True Assertion Verified");
	}

}
