package com.companyname.projectname.module.testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestExtentReport {
	
	public static ExtentSparkReporter htmlReporter; // Create HTML report and add configuration
	public static ExtentReports extent;  // Attaching reporter, Creating Test cases and Other System configuration
	public static ExtentTest test; // Maintaining the test cases, Adding log status Pass/Fail/Skip
	
	@BeforeTest
	public static void setReport() {
		
		htmlReporter = new ExtentSparkReporter("./executionReports/extent.html");
		
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("BYMAT Automation Report");
		htmlReporter.config().setReportName("Automation Test Result");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Automation Tester", "Rahul Ganjare");
		extent.setSystemInfo("Build No", "1234");
		extent.setSystemInfo("Organization", "BYMAT Automation");
		
	}
	
	@Test
	public static void doLogin() {
		
		test = extent.createTest("doLogin Test case");
		
		test.info("Entering userName");
		test.info("Entering Password");
		test.info("Click on submit button");
		test.info("Entering email address");
		
	//	test.pass("Test case pass");
		
	}
	
	@Test
	public static void doLogin1() {
		
		test = extent.createTest("doLogin1 Test case");
		
		test.info("Entering userName");
		test.info("Entering Password");
		test.info("Click on submit button");
		test.info("Entering email address");
		
		//test.fail("Test case Fail");
		Assert.fail();
		
	}
	
	@Test
	public static void doLogin2() {
		
		test = extent.createTest("doLogin2 Test case");
		
		test.info("Entering userName");
		test.info("Entering Password");
		test.info("Click on submit button");
		test.info("Entering email address");
		
		//test.skip("Test case Skip");
		
		throw new SkipException("Skipping Test case");
		
	}
	
	@AfterMethod
	public static void updateResults(ITestResult result) {
		
		if(result.getStatus() == ITestResult.SUCCESS) {
			//test.pass("Test case pass");
			
			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName +" Test case Pass", ExtentColor.GREEN);
			test.pass(m);
			
		} else if(result.getStatus() == ITestResult.FAILURE) {
			//test.fail("Test case Fail");
			
			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName+" Test case Failed", ExtentColor.RED);
			test.fail(m);
			
		} else if(result.getStatus() == ITestResult.SKIP) {
			//test.skip("Test case Skip");
			
			String methodName = result.getMethod().getMethodName();
			Markup m = MarkupHelper.createLabel(methodName+" Test case Skipped", ExtentColor.AMBER);
			test.skip(m);
		}
		
	}
	
	@AfterTest
	public static void endReport() {
		
		extent.flush();
		
	}
	
}
