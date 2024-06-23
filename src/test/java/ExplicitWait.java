import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
 
		 //Enter Username
		 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 //fetch input box attribute value
		 System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		 //Get height of input box
		 System.out.println(driver.findElement(By.id("email")).getSize().getHeight());
		 //Get width of input box
		 System.out.println(driver.findElement(By.id("email")).getSize().getWidth());
		 
		 //Use Explicit Wait to check if password field is visible
		 WebDriverWait wt = new WebDriverWait(driver, 30);
		 wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");

	}

}
