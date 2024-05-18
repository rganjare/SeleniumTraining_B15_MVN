package oopsConcepts.abstraction;

public class ICICI_Bank extends RBI_Bank {

	@Override
	public double homeLoanRateOfInterest() {
		System.out.println("I am in the ICICI_Bank");
		
		return 7.0;
		
	}



}
