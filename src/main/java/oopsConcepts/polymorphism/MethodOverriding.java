package oopsConcepts.polymorphism;

public class MethodOverriding { //Dynamic Binding Or Run time polymorphism

	public static void main(String[] args) {
		
		// All Classes should be having Inheritance relation
		// Classes should have same methods with same Data types
		// Create the object of child class and assign it to the reference variable of Parent class
		
		
		RBI_Bank rb = new ICICI_Bank();
		
		System.out.println(rb.getHomeLoanRateOfInterest());
		System.out.println(rb.getPersonalLoanRateOfInterest());
		System.out.println(new ICICI_Bank().getCarLoanRateOfInterent());
		
		System.out.println("############################################");
		RBI_Bank rb_sbi = new SBI_Bank();
		
		System.out.println(rb_sbi.getHomeLoanRateOfInterest());
		System.out.println(rb_sbi.getPersonalLoanRateOfInterest());
		
		System.out.println("############################################");
		RBI_Bank rb_hdfc = new HDFC_Bank();
		
		System.out.println(rb_hdfc.getHomeLoanRateOfInterest());
		System.out.println(rb_hdfc.getPersonalLoanRateOfInterest());

	}

}
