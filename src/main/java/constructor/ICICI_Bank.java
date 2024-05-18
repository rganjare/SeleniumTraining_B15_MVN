package constructor;

public class ICICI_Bank {
	
	public long accountNo;
	
	public ICICI_Bank() { // Default Constructor
		
		System.out.println("I am in the Default Constructor");
		System.out.println("Code to launch the Browser");
		
	}
	
	
	public ICICI_Bank(long accontNo) { // Argumented Constructor
		
		System.out.println("I am in the Argumented Constructor");
		
		this.accountNo = accontNo;
	}

	
	public long getAccountBalance() {
		
		//SQL query -- Select accountBalance from XYZtable where accountno = accountNo;
		
		long accountBalance = 123456;
		
		System.out.println("Account Balance for Account number "+accountNo + " is: " +accountBalance);
		return accountBalance;
		
	}
}
