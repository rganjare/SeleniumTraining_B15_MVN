package com.companyname.projectname.module.page;

import java.util.Hashtable;

import com.companyname.projectname.module.testBase.TestBase;
import com.companyname.projectname.module.utilities.CommonMethods;

public class SignUpOrLoginPage extends TestBase {

	public SignUpOrLoginPage verifySignUpOrLoginPageTitle(Hashtable<String, String> ht) {

		CommonMethods.verifyPageTitle(ht.get("SignUpPageTitle"));
		
		return this;
	}

	public ProductsPage loginToYourAccount(Hashtable<String, String> ht) {
		
		CommonMethods.enterTextInInputField("login-email", ht.get("loginEmail"));
		CommonMethods.enterTextInInputField("login-password", ht.get("loginpwd"));
		CommonMethods.clickOnWebElement("login-button");
		
		return new ProductsPage();
		
	}
	
	public EnterAccountInformationPage newUserSignUp(Hashtable<String, String> ht) {

		//CommonMethods.verifyPageTitle(ht.get("PageTitle"));

		CommonMethods.clickOnWebElement("signUp");

		CommonMethods.verifyText("newUserSignUp", ht.get("SignupText"));

		CommonMethods.enterTextInInputField("name", ht.get("Name"));

		CommonMethods.enterTextInInputField("signUpEmail", ht.get("Email_Address"));

		CommonMethods.clickOnWebElement("signUpBtn");
		
		return new EnterAccountInformationPage();

	}
	
}
