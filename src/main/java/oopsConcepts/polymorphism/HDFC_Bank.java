package oopsConcepts.polymorphism;

public class HDFC_Bank extends RBI_Bank {
	
	public double getHomeLoanRateOfInterest() {

		System.out.println("I am in the HDFC Bank");

		return 7.9;

	}
	
	
	public double getPersonalLoanRateOfInterest() {

		System.out.println("I am in the HDFC Bank");

		return 12.49;

	}

}
