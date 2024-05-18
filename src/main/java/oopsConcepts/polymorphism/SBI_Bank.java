package oopsConcepts.polymorphism;

public class SBI_Bank extends RBI_Bank {
	
	public double getHomeLoanRateOfInterest() {

		System.out.println("I am in the SBI Bank");

		return 7.0;

	}
	
	
	public double getPersonalLoanRateOfInterest() {

		System.out.println("I am in the SBI Bank");

		return 11.50;

	}
	
	

}
