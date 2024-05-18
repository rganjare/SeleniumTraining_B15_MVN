package basicOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent {
	
	public static WebDriver driver; // Interface  // Control +Shift +O
	
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
		
		driver.get("https://jqueryui.com/spinner/");
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());		

		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform(); 
		System.out.println("Copy all content from the page operation");
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		System.out.println("Driver switched to iFrame");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"spinner\"]")).click();
		System.out.println("Clicked on spinner field");
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		System.out.println("Paste operation is performed");
		
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Driver has been closed");
		
	}

}
