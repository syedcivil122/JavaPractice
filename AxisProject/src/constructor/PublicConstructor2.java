package constructor;
// we can access with in the same package public constructor types
public class PublicConstructor2 extends PublicConstructor{
	public static void main(String[] args) {
		PublicConstructor p = new PublicConstructor(); // extends parent constructor types
		PublicConstructor p1 = new PublicConstructor("Hello"); // extends parent constructor types
		
		PublicConstructor2 p3 = new PublicConstructor2(); 
		
		
	}
}
