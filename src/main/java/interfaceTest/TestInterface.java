package interfaceTest;

public class TestInterface {

	static WebDriverTest driver ;
	
	public static void main(String[] args) {
		
		System.out.println("######## ChromeDriverTest #################");
		 driver = new ChromeDriverTest();
		
		driver.click();
		driver.getTitle();
		driver.getText();
		driver.sendKeys();
		
		System.out.println("######## EdgeDriverTest #################");
		
		driver = new EdgeDriverTest();
		
		driver.click();
		driver.getTitle();
		driver.getText();
		driver.sendKeys();
		
		System.out.println("######## FireFoxDriverTest #################");
		
		driver = new FireFoxDriverTest();
		
		driver.click();
		driver.getTitle();
		driver.getText();
		driver.sendKeys();
		
		
	}

}
