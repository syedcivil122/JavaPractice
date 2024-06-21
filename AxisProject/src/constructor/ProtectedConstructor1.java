package constructor;
// protected with n the same package we can access able
public class ProtectedConstructor1 {
	public ProtectedConstructor1() {
		System.out.println("Child protected constructor");
	}
	public static void main(String[] args) {
		ProtectedConstructor p =new ProtectedConstructor(); // no arument constructor
		ProtectedConstructor p1 =new ProtectedConstructor(15); // parameter constructor
		ProtectedConstructor1 p2 = new ProtectedConstructor1(); // defult constructor or no arument constructor
	}

}
