package oopsConcepts.polymorphism;

public class MethodOverloading { // Static Binding Or Compile time polymorphism
	
	// In one class, We can have method with same name but with same or different arguments but their datatypes should be different 

	public static void main(String[] args) {
		
		addition(20, 48);
		
		addition(20, false);
		
		addition(40, 53, "addition of numbers");

	}

	public static void addition() {

		System.out.println("Addition of numbers");

	}

	public static void addition(int a) {

		System.out.println("Addition of number with 10 : " + (a + 10));

	}
	
	public static void addition(String a) {

		System.out.println("Addition of number with 10 : " + (a + 10));

	}

	public static void addition(int a, int b) {

		System.out.println("Addition of number two numbers : " + (a + b));

	}

	public static void addition(int a, boolean b) {

		System.out.println(a);
		System.out.println(b);

	}
	
	public static void addition(int a, int b, int c) {

		System.out.println("Addition of number three numbers : " + (a + b + c));

	}
	
	public static void addition(int a, int b, String message) {

		System.out.println("Addition of number three numbers : " + (a + b) + message);

	}

	
	
}
