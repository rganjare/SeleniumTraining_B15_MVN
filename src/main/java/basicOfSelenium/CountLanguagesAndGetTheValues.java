package basicOfSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountLanguagesAndGetTheValues {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		System.out.println("Navigated to wikipedia");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium Testing");
		System.out.println("Entered search criteria");
		
		Thread.sleep(2000);
		Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")));
				
//		System.out.println("***************** Printing all values from the DropDown box**************************");
//			//List<WebElement> listOflanguages = driver.findElements(By.tagName("option"));
//		  List<WebElement> listOflanguages = sel.getOptions();
//		  		  
//		  System.out.println("Total number of languages in dropdown box are:" +listOflanguages.size());
//		  		
//		  for(int i = 0; i<listOflanguages.size(); i++) {
//			  
//			  System.out.println("Language Value:- "+listOflanguages.get(i).getAttribute("value"));
//			  System.out.println("Language Name:- " +listOflanguages.get(i).getText());
//			  
//		  }
		
		
//		  System.out.println("***************** Printing all links from the WebPage**************************");
//		  List<WebElement> listOflinksFromWebPage = driver.findElements(By.tagName("a"));  
//		  
//		  System.out.println("Total number of links available on the Web page are:" +listOflinksFromWebPage.size());
//		  
//		  for(int i = 0; i<listOflinksFromWebPage.size(); i++) {
//			  System.out.println("*******************************************");
//			  System.out.println("Link Name:- " +listOflinksFromWebPage.get(i).getText());
//			  System.out.println("Link Value:- "+listOflinksFromWebPage.get(i).getAttribute("href"));
//			    
//		  }
		
		
		System.out.println("***************** Printing all links from perticuler Section**************");
		
		WebElement section = driver.findElement(By.xpath("//*[@class=\"other-projects\"]"));
		  
		List<WebElement> getLinksfromSection = section.findElements(By.tagName("a"));  
		
		System.out.println("Total number of links available in the section are:" +getLinksfromSection.size());
		  
		  for(int i = 0; i<getLinksfromSection.size(); i++) {
			  System.out.println("*******************************************");
			  System.out.println("Link Name:- " +getLinksfromSection.get(i).getText());
			  System.out.println("Link Value:- "+getLinksfromSection.get(i).getAttribute("href"));
			    
		  }	
		
		Thread.sleep(5000);
		driver.quit();   // It will kill the browser 
		
		//driver.close();  // it will close current active window.
			
	}

}
