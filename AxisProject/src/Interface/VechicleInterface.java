package Interface;
/*
 * Illegal modifier for the interface method show2; only public, private, abstract, default, static and
 *    strictfp are permitted
 */
public interface VechicleInterface {
	
	int a =12; // instance vairable
	public static final int b = 0;
	
	public String s = "syed";
	public boolean bl = true;
	static long l = 123456788L;
	final char c = 'v';
	
	public static void m2() { // static method
		System.out.println("static method");
	}
	
	public void show(); // abstract method without implemantation
	
	private void show1() { //private method
		System.out.println("private method");
	}
	
	abstract void show3(); // abstract method
	
	default void show4() { // default method
		System.out.println("default method");
	}
	
	
//	public void m1(); // instance method
//		System.out.println("m1 method");
//	}
	
	public int add(String S) { // concrete method
		return S;
	}
	
	protected void show2();
	
	// Interface cannot have constructors
	public VechicleInterface() {  // Constructor
		System.out.println("constructure");
	}

	{ 
		System.out.println("instance block"); // instance block
	}
	
	static {
		   System.out.println("static block"); // static block
	}
	
	public static void main(String[] args) {
		VechicleInterface v = new VechicleInterface();  // interface cannot create object
	}
	
	
}
