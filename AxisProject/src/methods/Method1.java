package methods;

public class Method1 {
	
	public void Test() { // instance vairable
		System.out.println("Test method..");
	}
	
	public int id() { // instance vairable
		return 12;
		
	}
	
	private void privateMethod() {
		System.out.println("private method");
		
	}
	
	public final void finalMethod() { 
		System.out.println("final method");
	}
	public void normalMethod() {
		System.out.println("normal method");
	}
	
	public static void main(String[] args) {
		Method1 m=new Method1(); // object
		m.finalMethod();  // final object
		m.privateMethod(); // private method
		m.Test(); // normal method
		System.out.println(m.id()); // return statements
	}

}
