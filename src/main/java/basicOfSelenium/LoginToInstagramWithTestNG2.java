package basicOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginToInstagramWithTestNG2 {
	
	public static WebDriver driver;	
	public static String browser = "chrome";

//	@BeforeMethod
//	public static void launchBrowser() {
//		
//		if(browser.equalsIgnoreCase("chrome")) {			
//			driver = new ChromeDriver();
//			System.out.println("ChromeDriver is launched");
//			
//		} else if(browser.equalsIgnoreCase("EDGE")) {	
//			 driver = new EdgeDriver();		
//			System.out.println("EdgeDriver is launched");	
//		} 
//		 else {			 
//			System.out.println("Entered browser type "+ browser +" didn't matched, launching firefox by default");		
//			 driver = new FirefoxDriver();  // Default condition		
//			System.out.println("FirefoxDriver is launched");
//			
//		}
//		
//		driver.get("https://www.instagram.com");
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//	}
//	
//	@Test
//	public static void loginToInstagramwithValidPassword() {
//		driver.findElement(By.xpath("//*[text()='Allow all cookies']")).click();
//		System.out.println("Clicked on Allow all cookies button");
//		//Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("rganjare");
//		System.out.println("Entered username");
//		
//	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("sdds#2344");
//		System.out.println("Entered Password");
//		
//		
//	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
//		System.out.println("Clicked on Login button");
//		
//	}
//	
//	@Test
//	public static void loginToInstagramWithInvalidCredentials() {
//		driver.findElement(By.xpath("//*[text()='Allow all cookies']")).click();
//		System.out.println("Clicked on Allow all cookies button");
//		//Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("rganjare");
//		System.out.println("Entered username");
//		
//	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("sdds#2344");
//		System.out.println("Entered Password");
//		
//		
//	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
//		System.out.println("Clicked on Login button");
//		
//	}
//	
//	@Test
//	public static void loginToInstagramInvalidPassword() {
//		driver.findElement(By.xpath("//*[text()='Allow all cookies']")).click();
//		System.out.println("Clicked on Allow all cookies button");
//		//Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("rganjare");
//		System.out.println("Entered username");
//		
//	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("sdds#2344");
//		System.out.println("Entered Password");
//		
//		
//	//	Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
//		System.out.println("Clicked on Login button");
//		
//	}
//	
//	@AfterMethod
//	public static void CloseBrowser() {
//		driver.quit();
//		System.out.println("Browser Closed");
//	}
//	
}
