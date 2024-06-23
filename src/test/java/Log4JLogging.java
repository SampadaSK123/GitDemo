import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4JLogging {

	public static void main(String[] args) {
		//Create Logger instance
		Logger logger = Logger.getLogger("Log4JLogging");
		
		//Configure log4j properties file
		PropertyConfigurator.configure("/Users/tushar/eclipse-workspace/SeleniumJavaFramework/Repository/log4j.properties");
		
		//open browser instance
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     logger.info("Chrome browser instance opened");
	     
	     //Maximize the window
	     driver.manage().window().maximize();
	     logger.info("window maximized");
	     
	     //Implicit wait
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   logger.info("implicit wait given");
		   
		  //Open URL
		    driver.get("https://www.facebook.com/");
		    logger.info("Application opened");     
		    
		    //Check if the web element is displayed or not
		    try {
				driver.findElement(By.id("emails")).isDisplayed();
				logger.info("'emails' web element displayed");
			} catch (Exception e) {
				logger.info("Failure - 'emails' web element is not dispalyed");			
				}
		   
	}

}
