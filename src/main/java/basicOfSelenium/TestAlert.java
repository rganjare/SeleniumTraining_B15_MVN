package basicOfSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println("Navigated to https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		System.out.println(alt.getText());
		
		Thread.sleep(2000);
		alt.accept();
		
		
	//  alt.dismiss();
		
	//	alt.sendKeys("Delete Customer ID");
	//  alt.accept();
		
		
		Thread.sleep(5000);
		driver.quit();   // It will kill the browser 
			
	}

}