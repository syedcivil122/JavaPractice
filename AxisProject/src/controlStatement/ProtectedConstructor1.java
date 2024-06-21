package controlStatement;

import constructor.ProtectedConstructor;

public class ProtectedConstructor1 extends ProtectedConstructor {
	protected ProtectedConstructor1() {
		System.out.println("differnt package protected constructor");
	}
	protected ProtectedConstructor1(int a) {
		super();
		System.out.println("differnt package protected constructor");
	}
	public static void main(String[] args) {
		ProtectedConstructor1 p = new ProtectedConstructor1();
		
		// The following line will cause a compilation error
		ProtectedConstructor p1= new ProtectedConstructor(); // we can't access protected constructor in different package
	
	}

}
