package basicOfSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
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
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // By default wait
		
		System.out.println(driver.getTitle());
		
		String textBeforeClickingFluentWaitBtn = driver.findElement(By.xpath("//*[text()=\"Click and Wait for \"]")).getText();
		
		System.out.println("Text Before Clicking FluentWait Btn is " +textBeforeClickingFluentWaitBtn);
		
		driver.findElement(By.xpath("//*[text()=\"Click Me - Fluent Wait\"]")).click();
		
		// ************** WebDriverWait example ***************************
		
//		WebDriverWait wb_wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
//		
//		wb_wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id=\"demo\"]"), textBeforeClickingFluentWaitBtn));
//		
//		//String textAfterClickingFluentWaitBtn = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
//		
//		String textAfterClickingFluentWaitBtn = wb_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"demo\"]"))).getText();
		
		// ************** Fluent Wait example ***************************
		
		Wait<WebDriver>	f_wait = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(30))
									.pollingEvery(Duration.ofSeconds(5)) // 5*6
									.ignoring(NoSuchElementException.class);
		
		f_wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id=\"demo\"]"), textBeforeClickingFluentWaitBtn));
		
		//String textAfterClickingFluentWaitBtn = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		String textAfterClickingFluentWaitBtn = f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"demo\"]"))).getText();
		
		System.out.println("Text After Clicking Fluent Wait Btn " +textAfterClickingFluentWaitBtn);
		
		Thread.sleep(5000);
		driver.quit();  // Kill the browser 
		System.out.println("Driver has been closed");
		
	}

}
