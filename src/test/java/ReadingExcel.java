import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of Excel file
		File src = new File("/Users/tushar/documents/excel data.xlsx");
		
		//load the file
		FileInputStream fis = new FileInputStream(src);
		
		//load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load worksheet
        XSSFSheet sh = wb.getSheet("Sheet1");
        
        //print the loaded sheet name
        System.out.println(sh.getSheetName());
        
        //print Selenium from excel sheet
        System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
        
        //print Java from excel sheet
        System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
        
        //print float/double from excel sheet
        System.out.println(sh.getRow(2).getCell(1).getNumericCellValue());
        
        //print integer from excel sheet
        System.out.println((int) sh.getRow(2).getCell(1).getNumericCellValue());
        
        //print total number of rows - 1st way
        System.out.println("Total Rows :- " +  sh.getPhysicalNumberOfRows());
        
        
        //print total number of rows - 2nd way
        System.out.println("Total Rows :- " + (sh.getLastRowNum() + 1));
        
        
        //print total number of columns - 1st way   
       // System.out.println("Total Columns :- " + (sh.getRow(1).getLastCellNum());

        
        //print total number of columns - 2nd way
     //   System.out.println("Total Columns :- " + (sh.getRow(1).getPhysicalNumberOfCells());
        
        
        //Real time implementation
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    
	    //Enter username using excel file
	    String abc = sh.getRow(1).getCell(1).getStringCellValue();
	    driver.findElement(By.id("email")).sendKeys(abc);
	
	}
}
