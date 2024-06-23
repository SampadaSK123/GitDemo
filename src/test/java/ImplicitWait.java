import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");

	    //Implicit wait use to check if element is present on page or DOM
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how to calculate");
	    
	   //Handling Auto suggestion
	   List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	    
	   for (int i = 0; i < AllSuggestions.size(); i++) {
		   String expResult = "how to calculate bmi";
		    if (AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)) 
		   {
			  AllSuggestions.get(i).click();
			  break;
		   }
	   }
	}

}
