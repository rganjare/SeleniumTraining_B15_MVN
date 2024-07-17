package com.companyname.projectname.module.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.companyname.projectname.module.page.EnterAccountInformationPage;
import com.companyname.projectname.module.page.HomePage;
import com.companyname.projectname.module.page.SignUpOrLoginPage;
import com.companyname.projectname.module.testBase.TestBase;
import com.companyname.projectname.module.utilities.CommonMethods;

public class RegisterUser1 extends TestBase {

	@Test(dataProvider = "data_Collection")
	public static void registerUser1(Hashtable<String, String> ht) { 
		// Data Driven Framework
		CommonMethods.manageConsent();
		
		CommonMethods.verifyPageTitle(ht.get("PageTitle"));

		CommonMethods.clickOnWebElement("signUp");

		CommonMethods.verifyText("newUserSignUp", ht.get("SignupText"));

		CommonMethods.enterTextInInputField("name", ht.get("Name"));

		CommonMethods.enterTextInInputField("signUpEmail", ht.get("Email_Address"));

		CommonMethods.clickOnWebElement("signUpBtn");

		CommonMethods.verifyText("enterInfoAccnt", ht.get("EnterAcctInfo"));

		CommonMethods.selectRadioButton("genderMale");

		CommonMethods.enterTextInInputField("password1", config.getProperty("password"));

		CommonMethods.selectByVisibleText("ddb_day", ht.get("DDB_Day"));

		CommonMethods.selectByVisibleText("ddb_month", ht.get("DDB_Month"));

		CommonMethods.selectByVisibleText("ddb_Years", ht.get("DDB_Year"));

		CommonMethods.clickOnWebElement("newsletter");

	}

}
