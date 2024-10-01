package com.companyname.projectname.module.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.companyname.projectname.module.testBase.TestBase;
import com.companyname.projectname.module.utilities.CommonMethods;

public class RegisterUser2 extends TestBase {

	@Test(dataProvider = "data_Collection")
	public static void registerUser2(Hashtable<String, String> ht) { 
		// POM Design Pattern Test case
		CommonMethods.manageConsent();
		hp.verifyHomePageTitle(ht)
		.ClickOnSignUpOrLoginnPage()
		.verifySignUpOrLoginPageTitle(ht)
		.newUserSignUp(ht)
		.enterAccountCreationInformation(ht); 

	}
}
