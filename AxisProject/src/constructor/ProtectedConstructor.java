package constructor;

public class ProtectedConstructor {
	// default Pro
	protected  ProtectedConstructor() {
		System.out.println("Protected Constructor");
	}
	
	protected ProtectedConstructor(int a) {
		System.out.println(" protected parameter constructor");
	}
	
	public static void main(String[] args) {
		ProtectedConstructor p= new ProtectedConstructor();
		ProtectedConstructor p1 = new ProtectedConstructor(12); // paramter constructor
	
	}

}
