import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		//Setting the property of chrome browser and passing chromedriver path
//System.setProperty("webdriver.chrome.driver","/Users/tushar/Documents/Software/chromedriver-mac-x64 2");	
		
	    WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(1000);

		//1st Way
       List<WebElement> birthMonth=driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
       System.out.println("Total dropdown values :- " + birthMonth.size());
       birthMonth.get(8).click();  //Sep

       //2nd way
       WebElement bm = driver.findElement(By.xpath("//select[@name='birthday_month']"));
       Select month = new Select(bm);
		Thread.sleep(1000);
        month.selectByVisibleText("Feb");  //Feb
        Thread.sleep(1000);
        month.selectByValue("12");  //Dec
		Thread.sleep(1000);
		month.selectByIndex(0);  //Jan
		System.out.println(month.getFirstSelectedOption().getText());  //Aug - current selected value

		//3rd Way
		List<WebElement> dropdown = month.getOptions();
		for (int i=0; i < dropdown.size(); i++) {
			if (dropdown.get(i).getText().equalsIgnoreCase("Sep")) {
				dropdown.get(i).click();
			}
		}
		
		//4th way
	bm.sendKeys("Jun");
		
	//5th Way
	Thread.sleep(1000);
	driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
	
	//Check if dropdown support multi selection
	System.out.println(month.isMultiple()); //False
	month.selectByVisibleText("Apr"); //Apr
	month.selectByValue("12"); //Dec
	month.selectByIndex(7); //Aug
	
	//Deselect the multi selected value from dropdown
	month.deselectByVisibleText("Apr"); //Apr
	month.deselectByValue("12"); //Dec
	month.deselectByIndex(7); //Aug
	month.deselectAll(); //Deselect all selected dropdown values
	 
	}
}