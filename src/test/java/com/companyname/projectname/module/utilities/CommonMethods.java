package com.companyname.projectname.module.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.companyname.projectname.module.testBase.TestBase;

public class CommonMethods extends TestBase {
	
	public static void verifyPageTitle(String expectedTitle) {	
		String actualPagetitle = driver.getTitle();
		Assert.assertEquals(actualPagetitle,expectedTitle);
		System.out.println("User Navigated to the homepage " + expectedTitle);
		test.pass("User Navigated to the homepage " + expectedTitle);
		
	}
	
	public static void clickOnWebElement(String locatorKey) {
		isElementPresent(locatorKey);
		driver.findElement(By.xpath(OR.getProperty(locatorKey))).click();
		System.out.println("User Clicked on " +locatorKey);	
		test.info("User Clicked on "+locatorKey);	
		
	}
	
	public static void selectRadioButton(String locatorKey) {
		isElementPresent(locatorKey);
		driver.findElement(By.xpath(OR.getProperty(locatorKey))).click();
		System.out.println("Radio button " +locatorKey+" selected");	
		test.pass("Radio button " +locatorKey+" selected");		
		
	}
	
	public static void isElementPresent(String locatorKey) {
		
		driver.findElement(By.xpath(OR.getProperty(locatorKey))).isEnabled() ;
		
	}
	
	public static String getTextFromApplication(String locatorKey) {
		isElementPresent(locatorKey);
		String text = driver.findElement(By.xpath(OR.getProperty(locatorKey))).getText();
		return text;
	}
	
	public static void verifyText(String locatorKey, String expectedText) {
		isElementPresent(locatorKey);
		String actualText = driver.findElement(By.xpath(OR.getProperty(locatorKey))).getText();
		Assert.assertEquals(actualText, expectedText);
		System.out.println(expectedText +" text is verifyed");	
		test.pass(expectedText +" text is verifyed");		
	}

	public static void enterTextInInputField(String locatorKey, String value) {
		isElementPresent(locatorKey);
		driver.findElement(By.xpath(OR.getProperty(locatorKey))).sendKeys(value);
		System.out.println("User entered "+value );
		test.info("User entered "+value);
	}
	
	public static void selectByVisibleText(String locatorKey, String value) {
		isElementPresent(locatorKey);
		Select sel = new Select(driver.findElement(By.xpath(OR.getProperty(locatorKey))));
		sel.selectByVisibleText(value);
		System.out.println("User selected value as: "+value);
		test.info("User selected value as: "+value);
		
	}
	
}
