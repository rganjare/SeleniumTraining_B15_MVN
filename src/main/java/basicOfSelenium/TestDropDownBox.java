package basicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDownBox {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		System.out.println("Navigated to wikipedia");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium Testing");
		System.out.println("Entered search criteria");
		
		Thread.sleep(2000);
		Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")));
		
	//	sel.selectByIndex(6);
	//	System.out.println("Selected value from dropdownbox as Index");
		
	//	sel.selectByValue("hi");
	//	System.out.println("Selected value from dropdownbox as selectByValue");
		
		sel.selectByVisibleText("Polski");
		System.out.println("Selected value from dropdownbox as selectByVisibleText");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
		System.out.println("Clicked on search icon");
		
		Thread.sleep(5000);
		driver.quit();   // It will kill the browser 
		
		//driver.close();  // it will close current active window.
			
	}

}
