import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://paytm.com/");
		 driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		 //Find the total number of frames present
		 int allFrames = driver.findElements(By.tagName("iframe")).size();
		 System.out.println("Total Frames :- "+ allFrames);
		 
		 //Go inside each frame and check if the element is present
		 for ( int i = 0; i < allFrames; i++) {
			 driver.switchTo().frame(i);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[contains(text(),'close')]")).click();
		 }
	}
}

