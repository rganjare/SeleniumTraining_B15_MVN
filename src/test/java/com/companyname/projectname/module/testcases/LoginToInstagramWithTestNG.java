package com.companyname.projectname.module.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToInstagramWithTestNG {
	
	public static WebDriver driver;	
	public static Properties config, OR;
	
	@BeforeClass
	public static void loadPropertiesFiles() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\files\\config.properties");
		config = new Properties();
		config.load(fis);
		System.out.println("Config file is been loaded");
		
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\files\\OR.properties");
		OR = new Properties();
		OR.load(fis1);
		System.out.println("OR file is been loaded");
	}
	
	
	@BeforeMethod
	public static void launchBrowser() {
		
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
		
		System.out.println("ChromeDriver is launched");
		
		driver.get(config.getProperty("AppURL"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public static void loginToInstagramwithValidPassword() {

		driver.findElement(By.xpath(OR.getProperty("AllowCookies"))).click();
		System.out.println("Clicked on Allow all cookies button");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("rganjare");
		System.out.println("Entered username");
		
	//	Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("sdds#2344");
		System.out.println("Entered Password");
		
		
	//	Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("LoginBtn"))).click();
		System.out.println("Clicked on Login button");
		
		String actualmsg = driver.findElement(By.xpath(OR.getProperty("errorMsg"))).getText();
		
		
		
	}
	
	@Test
	public static void loginToInstagramWithInvalidCredentials() {

		driver.findElement(By.xpath(OR.getProperty("AllowCookies"))).click();
		System.out.println("Clicked on Allow all cookies button");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("rganjare");
		System.out.println("Entered username");
		
	//	Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("sdds#2344");
		System.out.println("Entered Password");
		
		
	//	Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("LoginBtn"))).click();
		System.out.println("Clicked on Login button");
		
		String actualmsg = driver.findElement(By.xpath(OR.getProperty("errorMsg"))).getText();
		System.out.println(actualmsg);
		
		Assert.assertEquals(actualmsg, "Sorry, your password was incorrect. Please double-check your password.");
			
	}
	
	@Test
	public static void loginToInstagramInvalidPassword() {

		driver.findElement(By.xpath(OR.getProperty("AllowCookies"))).click();
		System.out.println("Clicked on Allow all cookies button");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("rganjare");
		System.out.println("Entered username");
		
	//	Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("sdds#2344");
		System.out.println("Entered Password");
		
		
	//	Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("LoginBtn"))).click();
		System.out.println("Clicked on Login button");
		
		String actualmsg = driver.findElement(By.xpath(OR.getProperty("errorMsg"))).getText();
		System.out.println(actualmsg);
		Assert.assertEquals(actualmsg, "Sorry, your password was incorrect. Please double-check your.");
		
	}
	
	@AfterMethod
	public static void CloseBrowser() {
		driver.quit();
		System.out.println("Browser Closed");
	}
	
}
