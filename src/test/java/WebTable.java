import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
//		 WebDriverManager.chromedriver().setup();
//	     WebDriver driver=new ChromeDriver();
//		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		 driver.get("https://money.rediff.com/gainers");
//		 
//	//Create list - All Companies
//		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
//		System.out.println("Total Companies Count :- " + allCompanies.size());
//		
//		//Create list - Current price
//		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
//		System.out.println("Total Current Price Count :- " + currentPrice.size());
//		
//		String expCompName= "Yuken India";
//		
//		for(int i=0; i < allCompanies.size(); i++) 
//		{
//			if (allCompanies.get(i).getText().equalsIgnoreCase(expCompName)) {
//				System.out.println(allCompanies.get(i).getText() + " === " + currentPrice.get(i).getText());
//			}
//		}
	}
}
