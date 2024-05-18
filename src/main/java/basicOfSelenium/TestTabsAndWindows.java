package basicOfSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestTabsAndWindows {
	
	public static WebDriver driver; // Interface
	
	public static String browser = "CHROME";
	
	public static void main(String[] args) throws InterruptedException {  // Sel 3.xx.x and Sel 4.xx.x.x
		
		if(browser.equalsIgnoreCase("chrome")) {			
			driver = new ChromeDriver();		
			System.out.println("ChromeDriver is launched");	
		} else if(browser.equalsIgnoreCase("EDGE")) {	
			 driver = new EdgeDriver();		
			System.out.println("EdgeDriver is launched");	
		} else {	 
			System.out.println("Entered browser type "+ browser +" didn't matched, launching firefox by default");
			 driver = new FirefoxDriver();  // Default condition		
			System.out.println("FirefoxDriver is launched");
		}	
		
		driver.get("https://www.online.citibank.co.in/");
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // By default wait
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@class=\"newclose\"]")).click();
		
		driver.findElement(By.xpath("//*[@class=\"newclose2\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@class=\"txtSign\"]")).click();
		
		Thread.sleep(2000); // Hard coded wait... It will halt the execution for this period
			
	   Set<String> windows = driver.getWindowHandles();
	   
	   Iterator<String> itr = windows.iterator();
	   
	   String parent_window = itr.next();
	   String first_window = itr.next();
		
	   System.out.println("parent_window Id is:- " +parent_window); 
	   System.out.println("first_window Id is:- " +first_window);
	   
//		while(itr.hasNext()) {
//			
//			System.out.println("Window Id is:- " +itr.next());
//		}
		
		
		driver.switchTo().window(first_window);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"User_Id\"]")).sendKeys("username");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		Thread.sleep(2000);
		driver.close(); // Close current active window
		
		driver.switchTo().window(parent_window);
		
		driver.findElement(By.xpath("//*[@title=\"NRI Banking\"]")).click();
		
		Thread.sleep(5000);
		driver.quit();  // Kill the browser 
		System.out.println("Driver has been closed");
		
	}

}
