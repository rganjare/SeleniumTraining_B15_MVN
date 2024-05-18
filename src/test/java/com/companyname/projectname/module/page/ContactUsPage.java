package com.companyname.projectname.module.page;

import java.util.Hashtable;

import com.companyname.projectname.module.utilities.CommonMethods;

public class ContactUsPage {
	
	public ContactUsPage verifyContactUsPageTitle(Hashtable<String, String> ht) {

		CommonMethods.verifyPageTitle(ht.get("PageTitle"));
		
		return this;
	}

	public HomePage getInTouch(Hashtable<String, String> ht) {
		
		
		return new HomePage(); // I am assuming it's taking me to the Homepage
	}

}
