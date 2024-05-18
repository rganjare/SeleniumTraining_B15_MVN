package basicOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMousehoverAndSelectingOptions {  //ctrl + Shfit + O
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		System.out.println("Navigated to https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Thread.sleep(2000);
	
		Actions act = new Actions(driver); //Constructor 
		
		//Select sel = new Select(driver.findElement(By.xpath("")));
		
		WebElement electronics = driver.findElement(By.xpath("//*[text()=\"Electronics\"]"));
		
		act.moveToElement(electronics).perform();
		System.out.println("Driver moved to Electronics section ");
		
		//Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//*[text()=\"Computer Peripherals\"][@class=\"_1BJVlg\"]"))).perform();
		System.out.println("Driver moved to Computer Peripherals");
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=\"Projectors\"][@class=\"_3490ry\"]")).click();
		System.out.println("Clicked on Projectors");
		
		
		//Thread.sleep(5000);
		driver.quit();   // It will kill the browser 
			
	}

}