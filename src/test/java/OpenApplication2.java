import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenApplication2 {

	public static void main(String[] args) throws InterruptedException {
		
		
	   WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver1=new EdgeDriver();
		
		driver1.get("https://www.facebook.com/");
		
		Thread.sleep(1000);

		
	}

}
