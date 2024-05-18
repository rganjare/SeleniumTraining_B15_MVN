package basicOfSelenium;

public class Calculator {

	public static void main(String[] args) { //API

//		System.out.println("Addition of two numbers:= " + (4 + 5));
//
//		System.out.println("Sub of two numbers:= " + (14 - 5));
//
//		System.out.println("Multi of two numbers:=" + (14 * 5));
//
//		System.out.println("div of two numbers:= " + (15 / 5));
		
		additionOfTwoNumbers (13, 56);
		
		divOfTwoNumbers(5, 45);

		subOfTwoNumbers(40, 211);
		
		mulOfTwoNumbers(5, 7);
	}

	public static void additionOfTwoNumbers(int a, int b) {  // method/functions
		
		int c = a+b;
		
		System.out.println("Addition of two numbers:= " + c);

	}

	public static void subOfTwoNumbers(int a, int b) { // method
		
		int c = b-a;

		System.out.println("Sub of two numbers:= " + c);

	}

	public static void mulOfTwoNumbers(int a, int b) { // functions

		System.out.println("Multi of two numbers:=" + (a * b));

	}

	public static void divOfTwoNumbers(int a, int b) {

		System.out.println("div of two numbers:= " + (b / a));


	}


}
