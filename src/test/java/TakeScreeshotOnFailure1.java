import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;

public class TakeScreeshotOnFailure1 {
	
	WebDriver driver;
	
	//ITestResult will provide us the test case execution status and test name
	public void captureScreenShot(ITestResult result) throws Exception {
		
		if (ITestResult.FAILURE == result.getStatus()) {
			 
			//Create ref of TakeScreenshot Interface and type casting
			TakeScreenshot ts = (TakeScreenshot) driver;  //Typecasting of 2 interfaces
			
			//Use getScreenshotAs() to capture the screenshot in file format
			//getScreenshotAs() method return type = FILE
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			//Copy the file to specific location
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + "method() screenshot captured");	
		}
	}

}
