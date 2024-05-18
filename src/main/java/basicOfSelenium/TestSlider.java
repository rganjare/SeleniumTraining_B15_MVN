package basicOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSlider {
	
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
		
		driver.get("https://jqueryui.com/slider/");
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		System.out.println("Driver switched to iFrame");
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Thread.sleep(2000);
		act.dragAndDropBy(source, 400, 0).perform();
		System.out.println("Slider operation performed");
		
		
		Thread.sleep(2000);
		act.dragAndDropBy(source, -300, 0).perform(); //100
		System.out.println("Slider moved back operation ");
		
		
		Thread.sleep(2000);
		act.contextClick(source).perform();
		System.out.println("Rightclick opertation on Slider");
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Driver has been closed");
		
	}

}
