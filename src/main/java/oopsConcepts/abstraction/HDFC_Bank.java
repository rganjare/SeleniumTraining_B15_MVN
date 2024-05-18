package oopsConcepts.abstraction;

public class HDFC_Bank extends RBI_Bank {

	@Override
	public double homeLoanRateOfInterest() {
		System.out.println("I am in the HDFC bank");
		
		return 7.7;
	}

}
