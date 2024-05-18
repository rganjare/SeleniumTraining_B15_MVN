package basicOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	
	public static WebDriver driver; // Interface
	
	public static String browser = "CHROMEee";
	

	public static void main(String[] args) throws InterruptedException {  // Sel 3.xx.x and Sel 4.xx.x.x
		
//		if(true) {
//			
//		} else {
//			
//		}
		
				//ChromeDriver driver = new ChromeDriver(); // Responsible to launch the Chrome browser
		
				//EdgeDriver driver = new EdgeDriver();
				
				//FirefoxDriver driver = new FirefoxDriver();  // IF else statement
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
			System.out.println("ChromeDriver is launched");
			
		} else if(browser.equalsIgnoreCase("EDGE")) {
			
			 driver = new EdgeDriver();
			
			System.out.println("EdgeDriver is launched");
			
		} 
		 else {
			 
			System.out.println("Entered browser type "+ browser +" didn't matched, launching firefox by default");
			
			 driver = new FirefoxDriver();  // Default condition
			
			System.out.println("FirefoxDriver is launched");
			
		}
		
		
		driver.get("https://bymatautomation.com");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
