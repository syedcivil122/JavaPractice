package constructor;

public class PublicConstructor {
	
	// override the default constructor
//	public PublicConstructor() { // default constructor
//		System.out.println("public Constructor");
//	}
	
	public PublicConstructor() { // No argument constructor
		System.out.println("public No argument Constructor");
	}
	
	public PublicConstructor(String s) {
		System.out.println("parameter constructor");
	}
	public static void main(String[] args) {
		PublicConstructor pc = new PublicConstructor("Hello"); // in constructor there calling parameter constructor
		PublicConstructor pc1 = new PublicConstructor(); // no argument constructor
	}

}
