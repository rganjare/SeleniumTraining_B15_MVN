package accessModifiers;

public class AccessModifiers_PublicClass {

	public void accessModifiers_PublicClass_PublicMenber() {

		System.out.println("I am in the accessModifiers_PublicClass_PublicMenber");
		
		accessModifiers_PublicClass_PrivateMenber();

	}

	void accessModifiers_PublicClass_DefaultMenber() {

		System.out.println("I am in the accessModifiers_PublicClass_DefaultMenber");

	}

	protected void accessModifiers_PublicClass_ProtectedMenber() {

		System.out.println("I am in the accessModifiers_PublicClass_ProtectedMenber");

	}

	private void accessModifiers_PublicClass_PrivateMenber() {

		System.out.println("I am in the accessModifiers_PublicClass_PrivateMenber");

	}
	
	// Static methods
	
	public static void accessModifiers_PublicClass_PublicMenber_Static() {

		System.out.println("I am in the accessModifiers_PublicClass_PublicMenber_static");

	}

	static void accessModifiers_PublicClass_DefaultMenber_static() {

		System.out.println("I am in the accessModifiers_PublicClass_DefaultMenber_static");

	}

	protected static void accessModifiers_PublicClass_ProtectedMenber_static() {

		System.out.println("I am in the accessModifiers_PublicClass_ProtectedMenber_static");

	}

	private static void accessModifiers_PublicClass_PrivateMenber_static() {

		System.out.println("I am in the accessModifiers_PublicClass_PrivateMenber_static");

	}
	
}
