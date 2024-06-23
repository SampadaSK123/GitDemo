import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 
		 //JavascriptExecutor
		 JavascriptExecutor jse =(JavascriptExecutor) driver;
		 
		 //Locate web element using javascript
		 jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		 jse.executeScript("document.getElementById('pass').value='abc@gmail.com'");
		 
		 //Scroll down using javascript
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(0,500)");
		 
		//Scroll up using javascript
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(0,-500)");
		 

	}

}
