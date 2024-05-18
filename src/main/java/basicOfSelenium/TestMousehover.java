package basicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMousehover {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		System.out.println("Navigated to https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		Actions act = new Actions(driver); //Constructor 
		
		//Select sel = new Select(driver.findElement(By.xpath("")));
		
		act.moveToElement(driver.findElement(By.xpath("//*[@class=\"_1TOQfO\"][@title=\"Login\"]"))).perform();
		System.out.println("Driver moved to Login button");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()=\"Orders\"]")).click();
		System.out.println("Clicked on Orders");
		
		
		Thread.sleep(5000);
		driver.quit();   // It will kill the browser 
			
	}

}