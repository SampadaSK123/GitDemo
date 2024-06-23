import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting the property of chrome browser and passing chromedriver path
//System.setProperty("webdriver.chrome.driver","/Users/tushar/Documents/Software/chromedriver-mac-x64 2");	
		
	WebDriverManager.chromedriver().setup();

		//Launching Chrome Browser Instance
		WebDriver driver=new ChromeDriver();
		
		//Open url using get() method
		driver.get("https://www.facebook.com/");
		
		//Maximize the window
		Thread.sleep(1000);
		driver.manage().window().maximize();
	
		//Delete all cookies
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		
		//Open url using navigate() method
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com/");

		//Refresh the page
		Thread.sleep(1000);
		driver.navigate().refresh();

		//Navigate to back
		Thread.sleep(1000);
		driver.navigate().back();
		
		//Navigate to forward
		Thread.sleep(1000);
		driver.navigate().forward();
		
		//Fetch Current url
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
        //Get Title of the web page
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		//Close the browser
		driver.close();

	}

}
