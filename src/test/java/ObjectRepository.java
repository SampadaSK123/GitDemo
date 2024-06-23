import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
   //Specify the location of properties file
		File src1 =new File("/Users/tushar/eclipse-workspace/SeleniumJavaFramework/Repository/config.properties");
				File src2 =new File("/Users/tushar/eclipse-workspace/SeleniumJavaFramework/Repository/locators.properties");
				File src3 =new File("/Users/tushar/eclipse-workspace/SeleniumJavaFramework/Repository/testdata.properties");
				
				//Create FileInputStream class object to load the file
				FileInputStream fis1 = new FileInputStream(src1);
				FileInputStream fis2 = new FileInputStream(src2);
				FileInputStream fis3 = new FileInputStream(src3);
				
				//Create properties class object to read properties file
				Properties pro1 = new Properties();
				pro1.load(fis1);
				Properties pro2 = new Properties();
				pro2.load(fis2);
				Properties pro3 = new Properties();
				pro3.load(fis3);
				
				
				
				 WebDriverManager.chromedriver().setup();
			     WebDriver driver=new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.get(pro1.getProperty("URL"));
				 
				 //getProperty method will accept key and return value of that key
				 driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
				 driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
				 Thread.sleep(2000);
				 driver.close();

	

	}
}