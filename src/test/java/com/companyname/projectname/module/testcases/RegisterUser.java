package com.companyname.projectname.module.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.companyname.projectname.module.testBase.TestBase;
import com.companyname.projectname.module.utilities.CommonMethods;

public class RegisterUser extends TestBase {
	
	
	@Test(dataProvider = "data_Collection")
	public static void registerUser(Hashtable<String, String> ht) {
		
	//test = report.createTest("registerUser");	
		
//	String pagetitle = driver.getTitle();
//	//Assert.assertEquals(pagetitle, "Automation Exercise");
//	Assert.assertEquals(pagetitle, excel.getCellData("Test_Data", "PageTitle", 5));
//	System.out.println("User Navigated to the homepage " + pagetitle);
//	test.pass("User Navigated to the homepage " + pagetitle);
	
	CommonMethods.verifyPageTitle(ht.get("PageTitle"));
	
//	driver.findElement(By.xpath(OR.getProperty("signUp"))).click();
//	System.out.println("User Clicked on 'Signup / Login' button");	
//	test.pass("User Clicked on 'Signup / Login' button");	
	
	CommonMethods.clickOnWebElement("signUp");
	
//	String signuptext = driver.findElement(By.xpath(OR.getProperty("newUserSignUp"))).getText();
//	//Assert.assertEquals(signuptext, "New User Signup!");
//	Assert.assertEquals(signuptext, excel.getCellData("Test_Data", "SignupText", 5));
//	System.out.println("New User Signup!' is visible");	
//	test.pass("New User Signup!' is visible");	
	
	//CommonMethods.verifyText("newUserSignUp", excel.getCellData("Test_Data", "SignupText", 5));
	CommonMethods.verifyText("newUserSignUp", ht.get("SignupText"));
	
//	driver.findElement(By.xpath(OR.getProperty("name"))).sendKeys(excel.getCellData("Test_Data", "Name", 5));
//	System.out.println("User entered Name address");
//	test.pass("User entered Name address");
	
	//CommonMethods.enterTextInInputField("name", excel.getCellData("Test_Data", "Name", 5));
	
	CommonMethods.enterTextInInputField("name", ht.get("Name")); // Data Driven
			
//	CommonMethods.enterTextInInputField("name", ht.get("Name")); // Data Driven
//	driver.findElement(By.xpath(OR.getProperty("signUpEmail"))).sendKeys(excel.getCellData("Test_Data", "Email_Address", 5));
//	System.out.println("User entered email address");
//	test.pass("User entered email address");
	
	//CommonMethods.enterTextInInputField("signUpEmail", excel.getCellData("Test_Data", "Email_Address", 5));
	CommonMethods.enterTextInInputField("signUpEmail", ht.get("Email_Address"));	
	
//	driver.findElement(By.xpath(OR.getProperty("signUpBtn"))).click();
//	System.out.println("User clicked on Sign up button");
//	test.pass("User clicked on Sign up button");
	
	CommonMethods.clickOnWebElement("signUpBtn");
			
//	String enterAccntInfotext = driver.findElement(By.xpath(OR.getProperty("enterInfoAccnt"))).getText();
//	Assert.assertEquals(enterAccntInfotext, excel.getCellData("Test_Data", "EnterAcctInfo", 5));
//	System.out.println("Enter Account Information is visible");	
//	test.pass("Enter Account Information is visible");	
	
	//CommonMethods.verifyText("enterInfoAccnt", excel.getCellData("Test_Data", "EnterAcctInfo", 5));
	CommonMethods.verifyText("enterInfoAccnt", ht.get("EnterAcctInfo"));
			
//	driver.findElement(By.xpath(OR.getProperty("genderMale"))).click();
//	System.out.println("User selected the Title");
//	test.pass("User selected the Title");
	
	CommonMethods.selectRadioButton("genderMale");
			
//	driver.findElement(By.xpath(OR.getProperty("password1"))).sendKeys(config.getProperty("password"));
//	System.out.println("User entered the password");
//	test.pass("User entered the password");
			
	CommonMethods.enterTextInInputField("password1", config.getProperty("password"));
	
//	Select sel = new Select(driver.findElement(By.xpath(OR.getProperty("ddb_day"))));
//	sel.selectByVisibleText(excel.getCellData("Test_Data", "DDB_Day", 5));
//	System.out.println("User selected the Date of Birth");
//	test.pass("User selected the Date of Birth");
	
	//CommonMethods.selectByVisibleText("ddb_day", excel.getCellData("Test_Data", "DDB_Day", 5));
	CommonMethods.selectByVisibleText("ddb_day", ht.get("DDB_Day"));
			
//	sel = new Select(driver.findElement(By.xpath(OR.getProperty("ddb_month"))));
//	sel.selectByVisibleText(excel.getCellData("Test_Data", "DDB_Month", 5));
//	System.out.println("User selected the month in DOB");
//	test.pass("User selected the month in DOB");
			
	//CommonMethods.selectByVisibleText("ddb_month", excel.getCellData("Test_Data", "DDB_Month", 5));
	CommonMethods.selectByVisibleText("ddb_month", ht.get("DDB_Month"));
//	sel = new Select(driver.findElement(By.xpath(OR.getProperty("ddb_Years"))));
//	sel.selectByVisibleText(excel.getCellData("Test_Data", "DDB_Year", 5));
//	System.out.println("User selected the year in Date of Birth");
//	test.pass("User selected the year in Date of Birth");
	
	//CommonMethods.selectByVisibleText("ddb_Years", excel.getCellData("Test_Data", "DDB_Year", 5));
	CommonMethods.selectByVisibleText("ddb_Years", ht.get("DDB_Year"));
	
//	driver.findElement(By.xpath(OR.getProperty("newsletter"))).click();
//	System.out.println("User Clicked on Newsletter");
//	test.pass("User Clicked on Newsletter");
	
	CommonMethods.clickOnWebElement("newsletter");
	
	}
	


}
