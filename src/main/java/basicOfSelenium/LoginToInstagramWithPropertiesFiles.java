package basicOfSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToInstagramWithPropertiesFiles {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//FileInputStream fis = new FileInputStream("D:\\BYMAT_Automation\\WorkSpace\\OnlineTraining\\SeleniumTraining_B15\\src\\files\\config.properties");
		
		System.out.println(System.getProperty("user.dir"));
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\files\\config.properties");
		Properties config = new Properties();
		config.load(fis);
		System.out.println("Config file is been loaded");
		
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\files\\OR.properties");
		Properties OR = new Properties();
		OR.load(fis1);
		System.out.println("OR file is been loaded");
		
		
		System.out.println(config.getProperty("Browser"));
		System.out.println(config.getProperty("AppURL"));
		
		System.out.println(OR.getProperty("AllowCookies"));
		System.out.println(OR.getProperty("LoginBtn"));
		
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
		
	//	Thread.sleep(2000); // Hard coded wait // Java utility
		
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
		
		
	//	Thread.sleep(5000);
		driver.quit();
		System.out.println("Browser Closed");

	}

}
