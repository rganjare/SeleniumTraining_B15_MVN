package oopsConcepts.abstraction;

public abstract class RBI_Bank {  
	
	int a = 10;
	
	public static double defaultRateOfInterest = 6.5;
	
	
	public abstract double homeLoanRateOfInterest();
	
	
	public double getPernolLoanRateOfInterest(){  // Non Static Method
		
		System.out.println("I am in the RBI_Bank");
		
		return 6.6;
		
	}
	
	public static double getCarLoanRateOfInterest(){  // Static Method
		
		System.out.println("I am in the RBI_Bank");
		
		return 9.6;
		
	}
	

}
