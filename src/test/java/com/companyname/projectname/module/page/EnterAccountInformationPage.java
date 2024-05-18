package com.companyname.projectname.module.page;

import java.util.Hashtable;

import com.companyname.projectname.module.testBase.TestBase;
import com.companyname.projectname.module.utilities.CommonMethods;

public class EnterAccountInformationPage extends TestBase {
	
	public HomePage enterAccountCreationInformation(Hashtable<String, String> ht) {
		
		CommonMethods.verifyText("enterInfoAccnt", ht.get("EnterAcctInfo"));

		CommonMethods.selectRadioButton("genderMale");

		CommonMethods.enterTextInInputField("password1", config.getProperty("password"));

		CommonMethods.selectByVisibleText("ddb_day", ht.get("DDB_Day"));

		CommonMethods.selectByVisibleText("ddb_month", ht.get("DDB_Month"));

		CommonMethods.selectByVisibleText("ddb_Years", ht.get("DDB_Year"));

		CommonMethods.clickOnWebElement("newsletter");
		
		return new HomePage(); // I am assuming it's taking me to the Homepage
		
	}

}
