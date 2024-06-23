package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {
	
	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;
	
	//Constructor implementation
	public MasterPage() throws Exception {
		
		//configuration properties file implementation
		FileInputStream ip = new FileInputStream(".\\src\\com\\facebook\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);
		
		//locators properties file implementation
		FileInputStream fs = new FileInputStream(".\\src\\com\\facebook\\repository\\locators.properties");
		prop = new Properties();
		prop.load(fs);
		
		//test data properties file implementation
		FileInputStream ts = new FileInputStream(".\\src\\com\\facebook\\repository\\testdata.properties");
		prop = new Properties();
		prop.load(ts);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("IE")) {
			System.setProperty("Webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\com.facebook.drivers\\iedriver.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("No Browser Details Found.");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
	}

