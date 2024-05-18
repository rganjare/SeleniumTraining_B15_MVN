package com.companyname.projectname.module.testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.companyname.projectname.module.excelReading.DataCollection;
import com.companyname.projectname.module.excelReading.ExcelReader;
import com.companyname.projectname.module.page.HomePage;

public class TestBase {  // Heart of the Framework Or Engine of the framework
	
	public static WebDriver driver;	
	public static Properties config, OR;
	public static ExcelReader excel;
	
	public static ExtentSparkReporter spark; // Create HTML report and add configuration
	public static ExtentReports report;  // Attaching reporter, Creating Test cases and Other System configuration
	public static ExtentTest test; // Maintaining the test cases, Adding log status Pass/Fail/Skip   

	public static String testCaseName;
	
	public static Hashtable<String, String> run_mode = new Hashtable<>();
	
	public static HomePage hp = new HomePage();
	
	@BeforeSuite
	public void init() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\files\\config.properties");
		config = new Properties();
		config.load(fis);
		System.out.println("Config file is been loaded");
		
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\files\\OR.properties");
		OR = new Properties();
		OR.load(fis1);
		System.out.println("OR file is been loaded");
		
		excel = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/testData/Master_sheet.xlsx");
		System.out.println("Excel file is been loaded");
		
		readRunMode();
		
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/src/test/resources/executionReports/" + 
				"ExtentReportResult_" +"_"+timeStamp+ "_.html");
		report.attachReporter(spark);
		System.out.println("Execution report setup");
		
		
	}
	

	@BeforeClass
	public void getTestCaseName() {
		
		testCaseName = this.getClass().getSimpleName();
		
		//this.getClass().getSimpleName();
		
		test = report.createTest(testCaseName);		
		
		if(run_mode.get(testCaseName).equalsIgnoreCase("Y")) {
			test.info("Executing Test case :" +testCaseName);
		} else {
			throw new SkipException("Skipping the Test case as it's Run mode is set to No");
		}
		
	}
	
	@BeforeMethod
	public void launchBrowser() {
		
		if(config.getProperty("Browser").equalsIgnoreCase("chrome")) {			
			driver = new ChromeDriver();
			System.out.println("ChromeDriver is launched");
			
		} else if(config.getProperty("Browser").equalsIgnoreCase("EDGE")) {	
			 driver = new EdgeDriver();		
			System.out.println("EdgeDriver is launched");	
		} 
		 else {			 
			System.out.println("Entered browser type "+ config.getProperty("Browser") +" didn't matched, launching firefox by default");		
			 driver = new FirefoxDriver();  // Default condition		
			System.out.println("FirefoxDriver is launched");
		}
			
		driver.get(config.getProperty("App_URL"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	
	@DataProvider
	public Object[][] data_Collection() {	
		DataCollection dc = new DataCollection(excel, "Test_Data", testCaseName);			
		return dc.dataArray();	
	}
	
	
	@AfterMethod
	public void CloseBrowser() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
		//report.flush();
		System.out.println("Browser Closed");
	}
	
	@AfterSuite
	public void CloseReporter() throws InterruptedException {
		
		report.flush();
		
	}
	
	public void readRunMode() {
		int rows = excel.getRowCount("Test_Cases");
		
		for(int i = 2; i<=rows ; i++) {
		
		String key = excel.getCellData("Test_Cases", "TestCaseName", i);
		
		String value = excel.getCellData("Test_Cases", "Run_Mode", i);
		
		run_mode.put(key, value);
		
		}
		
		System.out.println("HashTable Run Mode :- " +run_mode);
		
	}
	
	
}
