
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG7 {
	
	WebDriver driver;
	 
	@BeforeClass
	 public Object[][] setEnv() {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://facebook.com/");

	    
	    @DataProvider
	    public Object[][] dataSet() throws Exception {
	    	//Specify the location of properties file
	    	File src3 = new File("/Users/tushar/eclipse-workspace/SeleniumJavaFramework/Repository/testdata.properties");
	    	
	    	//create FileInputStream class object to load the file
	    	FileInputStream fis3 = new FileInputStream(src3);
	    	
	    	//create properties class object to read properties file
	    	Properties pro3 = new Properties();
	    	pro3.load(fis3);
	    	
	    	Object arr[][] = new Object[3][2];
	    	arr[0][0] = pro3.getProperty("TestData1");
			arr[0][1] = pro3.getProperty("TestData2");

			arr[1][0] = "TestData2";
			arr[1][1] = "TestData2";

			arr[1][0] = "TestData3";
			arr[1][1] = "TestData3";
			
			return arr;
				
	    }
	    
	    @Test(dataProvider = "dataSet")
	private void enterData(String userName, String password); throws Exception {
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("email")).clear();
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("pass")).clear();
	    	Thread.sleep(2000);
   	driver.findElement(By.id("email")).sendKeys(userName);
    	Thread.sleep(2000);
	    	driver.findElement(By.id("pass")).sendKeys(password);
	    	Thread.sleep(2000);

	    	
	    }
		
	}
	
}
