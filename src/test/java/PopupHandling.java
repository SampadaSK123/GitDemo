import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/browser-windows");
		 
		 //Step 1 - Tab Handling
		 Thread.sleep(2000);
		 driver.findElement(By.id("tabButton")).click();
		 
		 //Get the total no of open tabs/windows
		 Set<String> allWindowsID = driver.getWindowHandles();
		 System.out.println(allWindowsID);
		 
		 Iterator<String> abc = allWindowsID.iterator();
		 String win1 = abc.next();
		 String win2 = abc.next();
		 
		 //Print the title of parent window
		 driver.switchTo().window(win1);
		 System.out.println("Parent Window ID :- " + win1); // Alphanumeric ID of parent window
		 System.out.println(driver.getTitle()); // Title of parent window
		 
		 
		 //Print the current url of child tab
		 Thread.sleep(2000);
		 driver.switchTo().window(win2);
		 Thread.sleep(2000);
		 System.out.println("Child Window ID :- " + win2); // Alphanumeric ID of child tab
		 System.out.println(driver.getCurrentUrl()); // Current url of child tab
		 driver.close();
		 
		 //Step 2- Windows/Popup handling
		 Thread.sleep(2000);
		 driver.switchTo().window(win1);
		 driver.switchTo().window(win1);
		 driver.findElement(By.id("windowButton")).click();
		 
		 //Print the title of the child window
		 Set<String> allWindowsID2 = driver.getWindowHandles();
		 System.out.println(allWindowsID2);
		 Iterator<String> abc1 = allWindowsID2.iterator();
		 String win3 = abc1.next();
		 String win4 = abc1.next();
		 Thread.sleep(2000);
		 driver.switchTo().window(win4);
		 Thread.sleep(2000);

		 System.out.println("Child Window ID :- " + win4); // Alphanumeric ID of child window
		 System.out.println(driver.getTitle()); // get title of child window
		 System.out.println(driver.getCurrentUrl()); // Current url of child window
		 Thread.sleep(2000);
         driver.quit(); ///Close Parent window as well as all associated window
         System.out.println("Windows Popup and Tab Handled"); 
	}
}
