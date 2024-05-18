package oopsConcepts.inheritance;

import java.util.Date;

public class Class_A {  // Parent Class
	
	static int a = 20;
	
	static String day = "Saturday";
	
	
	public static void getTodaysDate() {
		
		System.out.println(new Date().getTime());
	}

}
