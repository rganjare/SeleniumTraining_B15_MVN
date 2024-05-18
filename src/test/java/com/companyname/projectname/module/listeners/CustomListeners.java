package com.companyname.projectname.module.listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.companyname.projectname.module.testBase.TestBase;
import com.google.common.io.Files;

public class CustomListeners extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
	
	}

	public void onTestSuccess(ITestResult result) {
		
		test.pass(testCaseName +" test case is Pass.");
		
	}

	public void onTestFailure(ITestResult result) {
		
		test.fail(testCaseName +" test case is failed. " + result.getThrowable().getMessage());	
	
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		File dest = new File(System.getProperty("user.dir") + "/src/test/resources/screenShots/" 
			+ timeStamp+ ".png");	
		try {
			Files.copy(scrFile, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.fail("<b><font color=red>" +" Screenshot of failure " + "</font></b></br>", 
				MediaEntityBuilder.createScreenCaptureFromPath(dest.getAbsolutePath()).build());
		
	}

	public void onTestSkipped(ITestResult result) {
		
		test.skip(testCaseName +" test case is skipped as it's Run mode is set to No.");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	

}
