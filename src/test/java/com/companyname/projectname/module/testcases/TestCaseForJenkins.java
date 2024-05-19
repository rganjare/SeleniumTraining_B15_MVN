package com.companyname.projectname.module.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.companyname.projectname.module.testBase.TestBase;

public class TestCaseForJenkins extends TestBase {

	@Test(dataProvider = "data_Collection")
	public static void testCaseForJenkins(Hashtable<String, String> ht) { // POM Design Pattern Test case

		hp.verifyHomePageTitle(ht)
		.ClickOnSignUpOrLoginnPage()
		.verifySignUpOrLoginPageTitle(ht)
		.newUserSignUp(ht)
		.enterAccountCreationInformation(ht); 

	}

}
