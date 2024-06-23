import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Alert {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/alerts");
		 
		 //Alert Handling
		 Thread.sleep(2000);
		 driver.findElement(By.id("confirmButton")).click();
		 Thread.sleep(2000);
		 
		 //Verify Alert Text
		 String alertText = driver.switchTo().alert().getText();
		 String expAlertText = "Do you confirm action?";
		 Assert.assertEquals(alertText, expAlertText);
		 System.out.println("Alert Text Verified");
		 
		 //Accept the alert
		 driver.switchTo().alert().accept();
		 System.out.println("Alert accepted");
		 Thread.sleep(2000);

         //Dismiss the Alert
		 driver.findElement(By.id("confirmButton")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().dismiss();
		 System.out.println("Alert dismissed");

	}

}
