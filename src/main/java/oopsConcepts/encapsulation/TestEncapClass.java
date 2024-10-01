package oopsConcepts.encapsulation;

public class TestEncapClass {

	public static void main(String[] args) {

		ICICI_Bank ib = new ICICI_Bank();
		
		//long i = 3423345325345453454l;
		
		ib.setAccountBalance(3423345325345453454l);
		
		System.out.println(ib.getAccountBalance());

	}

}
