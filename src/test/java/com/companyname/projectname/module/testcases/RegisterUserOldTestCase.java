package com.companyname.projectname.module.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.companyname.projectname.module.testBase.TestBase;

public class RegisterUserOldTestCase extends TestBase {
	
	
	@Test 
	public static void RegisterUserOldTestCase() {
		
	//test = report.createTest("loginUserWithCorrectEmailAddress");	
		
	String pagetitle = driver.getTitle();
	//Assert.assertEquals(pagetitle, "Automation Exercise");
	Assert.assertEquals(pagetitle, excel.getCellData("Test_Data", "PageTitle", 5));
	System.out.println("User Navigated to the homepage " + pagetitle);
	test.pass("User Navigated to the homepage " + pagetitle);
	
	driver.findElement(By.xpath(OR.getProperty("signUp"))).click();
	System.out.println("User Clicked on 'Signup / Login' button");	
	test.pass("User Clicked on 'Signup / Login' button");	
	
	String signuptext = driver.findElement(By.xpath(OR.getProperty("newUserSignUp"))).getText();
	//Assert.assertEquals(signuptext, "New User Signup!");
	Assert.assertEquals(signuptext, excel.getCellData("Test_Data", "SignupText", 5));
	System.out.println("New User Signup!' is visible");	
	test.pass("New User Signup!' is visible");	
	
	driver.findElement(By.xpath(OR.getProperty("name"))).sendKeys(excel.getCellData("Test_Data", "Name", 5));
	System.out.println("User entered Name address");
	test.pass("User entered Name address");
			
	driver.findElement(By.xpath(OR.getProperty("signUpEmail"))).sendKeys(excel.getCellData("Test_Data", "Email_Address", 5));
	System.out.println("User entered email address");
	test.pass("User entered email address");
		
	driver.findElement(By.xpath(OR.getProperty("signUpBtn"))).click();
	System.out.println("User clicked on Sign up button");
	test.pass("User clicked on Sign up button");
			
	String enterAccntInfotext = driver.findElement(By.xpath(OR.getProperty("enterInfoAccnt"))).getText();
	Assert.assertEquals(enterAccntInfotext, excel.getCellData("Test_Data", "EnterAcctInfo", 5));
	System.out.println("Enter Account Information is visible");	
	test.pass("Enter Account Information is visible");	
			
	driver.findElement(By.xpath(OR.getProperty("genderMale"))).click();
	System.out.println("User selected the Title");
	test.pass("User selected the Title");
			
	driver.findElement(By.xpath(OR.getProperty("password1"))).sendKeys(config.getProperty("password"));
	System.out.println("User entered the password");
	test.pass("User entered the password");
			
	
	Select sel = new Select(driver.findElement(By.xpath(OR.getProperty("ddb_day"))));
	sel.selectByVisibleText(excel.getCellData("Test_Data", "DDB_Day", 5));
	System.out.println("User selected the Date of Birth");
	test.pass("User selected the Date of Birth");
			
	sel = new Select(driver.findElement(By.xpath(OR.getProperty("ddb_month"))));
	sel.selectByVisibleText(excel.getCellData("Test_Data", "DDB_Month", 5));
	System.out.println("User selected the month in DOB");
	test.pass("User selected the month in DOB");
			
	
	sel = new Select(driver.findElement(By.xpath(OR.getProperty("ddb_Years"))));
	sel.selectByVisibleText(excel.getCellData("Test_Data", "DDB_Year", 5));
	System.out.println("User selected the year in Date of Birth");
	test.pass("User selected the year in Date of Birth");
	
	driver.findElement(By.xpath(OR.getProperty("newsletter"))).click();
	System.out.println("User Clicked on Newsletter");
	test.pass("User Clicked on Newsletter");
	}
	
//	@DataProvider
//	public Object[][] data_Collection() {
//		
//		DataCollection dc = new DataCollection(excel, "Test_Data", "LoginUserWithCorrectEmailAddress");
//			
//		return dc.dataArray();
//		
//	}

}
