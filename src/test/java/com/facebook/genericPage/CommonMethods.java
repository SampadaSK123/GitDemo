package com.facebook.genericPage;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods extends MasterPage {
	
	public CommonMethods() throws Exception {
		super();
	}
	
	//Get text of Web Element
	public void getWebElementText(String xpathkey) {
		String getTextOfWebElement = driver.findElement(By.xpath(or.getProperty(xpathkey))).getText();
		System.out.println(getTextOfWebElement);
	}

	
	//Click Method
	public void click(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
		
	}
	
	//Enter Data
	public void enterData(String xpathkey, String testdata) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
	}
	
    //Clear Data
	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	}
	
	//Mouse Hover
	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();
	}

	
}
