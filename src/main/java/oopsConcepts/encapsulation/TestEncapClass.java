package oopsConcepts.encapsulation;

public class TestEncapClass {

	public static void main(String[] args) {

		ICICI_Bank ib = new ICICI_Bank();
		
		ib.setAccountBalance(25000);
		
		System.out.println(ib.getAccountBalance());

	}

}
