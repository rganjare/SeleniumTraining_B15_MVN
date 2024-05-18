package basicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButton {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println("Navigated to automationtesting");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		
		driver.findElement(By.xpath("//*[@value=\"FeMale\"]")).click();
		System.out.println("selected the FeMale radio button");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		System.out.println("selected the checkbox2");
		
		
		
//		driver.findElement(By.id("checkbox2")).click();
//		
//		driver.findElement(By.name("radiooptions")).click();
//		
//		driver.findElement(By.className("")).click();
	
		Thread.sleep(5000);
		driver.quit();   // It will kill the browser 
		
		//driver.close();  // it will close current active window.
		
		//TagName[@Attibute Type ="Attribute Value"]
		
		//*[@id="checkbox2"]
		
		
		
			
	}

}