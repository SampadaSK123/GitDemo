import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseSimulation1 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","/Users/tushar/Documents/chromedriver");
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div/div[1]/img")).click();
		 Thread.sleep(2000);

		 // Create electronics web element ref
		 WebElement electro=driver.findElement(By.xpath("//*[text()='Electronics']"));
		 //Mouse simulation using actions class
		 Actions act = new Actions(driver);
		 //Mouse hover to electronics
		 Thread.sleep(2000);
		 act.moveToElement(electro).build().perform();
		 
		 //click on cancel of dialouge box
		  //Thread.sleep(2000);
	   //   driver.findElement(By.xpath("/html/body/div[3]/div/span\n")).click();
		//  Thread.sleep(2000);

		 // Keyboard operations
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
         WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion'"));
		 Thread.sleep(2000);
         act.sendKeys(fash, Keys.ENTER).build().perform();
         System.out.println("Fashion option clicked");
         
         //Right click on web page
		 Thread.sleep(2000);
         act.contextClick().build().perform();
         	 
	}

}
