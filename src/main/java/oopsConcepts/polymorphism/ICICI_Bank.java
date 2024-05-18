package oopsConcepts.polymorphism;

public class ICICI_Bank extends RBI_Bank {
	
	public double getHomeLoanRateOfInterest() {

		System.out.println("I am in the ICICI Bank");

		return 7.5;

	}
	
	
	public double getPersonalLoanRateOfInterest() {

		System.out.println("I am in the ICICI Bank");

		return 11.99;

	}
	
	
	public double getCarLoanRateOfInterent() {
		
		System.out.println("I am in the ICICI Bank");
		
		return 8.5;	
		
	}

}
