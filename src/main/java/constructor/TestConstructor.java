package constructor;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//new ICICI_Bank();

		//ChromeDriver driver = new ChromeDriver();
		
		ICICI_Bank ib = new ICICI_Bank(34535353);
		
		ib.getAccountBalance();
		
	}

}
