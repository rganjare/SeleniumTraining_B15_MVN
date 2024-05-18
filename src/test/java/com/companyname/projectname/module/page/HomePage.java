package com.companyname.projectname.module.page;

import java.util.Hashtable;

import com.companyname.projectname.module.testBase.TestBase;
import com.companyname.projectname.module.utilities.CommonMethods;

public class HomePage extends TestBase {
	
	public HomePage verifyHomePageTitle(Hashtable<String, String> ht) {
		
		CommonMethods.verifyPageTitle(ht.get("PageTitle"));
		
		return this;
	}
	
	//POM :- Whichever method taking you to the next page, that method should be responsible to 
	//       return the object of the page where it's navigating. 
	
	// Page chaining
	
	public ProductsPage ClickOnProductsPage() {
		
		CommonMethods.clickOnWebElement("productPage");
		
		return new ProductsPage();
		
	}
	
	public CartPage ClickOnCartPage() {
		
		CommonMethods.clickOnWebElement("cartPage");
		
		return new CartPage();
		
	}
	
	public SignUpOrLoginPage ClickOnSignUpOrLoginnPage() {
		
		CommonMethods.clickOnWebElement("signUpOrLoginPage");
		
		return new SignUpOrLoginPage();
		
	}
	
	public ContactUsPage ClickOnContactUsPage() {
		
		CommonMethods.clickOnWebElement("contactUsPage");
		
		return new ContactUsPage();
		
	}
	
	
	
	

}
