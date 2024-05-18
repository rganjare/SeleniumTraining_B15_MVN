package com.companyname.projectname.module.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.companyname.projectname.module.testBase.TestBase;

public class TestCaseForGit extends TestBase {

	@Test(dataProvider = "data_Collection")
	public static void testCaseForGit(Hashtable<String, String> ht) { // POM Design Pattern Test case

		hp.verifyHomePageTitle(ht)
		.ClickOnSignUpOrLoginnPage()
		.verifySignUpOrLoginPageTitle(ht)
		.newUserSignUp(ht)
		.enterAccountCreationInformation(ht); 

	}

}
