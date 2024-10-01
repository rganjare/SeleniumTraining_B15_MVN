package oopsConcepts.abstraction;

public class TestAnstraction {

	public static void main(String[] args) {
		
		RBI_Bank rb = new ICICI_Bank();
		
		System.out.println(rb.getPernolLoanRateOfInterest());
		System.out.println(rb.homeLoanRateOfInterest());
		
		System.out.println(RBI_Bank.defaultRateOfInterest);
		System.out.println(RBI_Bank.getCarLoanRateOfInterest() );
		
		new ICICI_Bank().makePayment(0, 0);
		
	}

}
