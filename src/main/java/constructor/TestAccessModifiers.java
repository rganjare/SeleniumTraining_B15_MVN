package constructor;

import accessModifiers.AccessModifiers_PublicClass;

public class TestAccessModifiers extends AccessModifiers_PublicClass{

	public static void main(String[] args) {
		
		AccessModifiers_PublicClass amp = new AccessModifiers_PublicClass();
		
		amp.accessModifiers_PublicClass_PublicMenber();
	//	amp.accessModifiers_PublicClass_DefaultMenber();
	//	amp.accessModifiers_PublicClass_ProtectedMenber();
		
		AccessModifiers_PublicClass.accessModifiers_PublicClass_ProtectedMenber_static();
		AccessModifiers_PublicClass.accessModifiers_PublicClass_PublicMenber_Static();
		
		
		
		// Default ACM
		
//				AccessModifiers_DefaultClass amd = new AccessModifiers_DefaultClass();
//				
//				amd.accessModifiers_DefaultClass_PublicMenber();
//				amd.accessModifiers_DefaultClass_DefaultMenber();
//				amd.accessModifiers_DefaultClass_ProtectedMenber();
				
				
//				AccessModifiers_DefaultClass.accessModifiers_DefaultClass_PublicMenber_Static();
//				AccessModifiers_DefaultClass.accessModifiers_DefaultClass_DefaultMenber_static();
//				AccessModifiers_DefaultClass.accessModifiers_DefaultClass_ProtectedMenber_static();
//		
		
	}

}
