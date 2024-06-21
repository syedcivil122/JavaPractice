package methods;

public class Method2 extends Method1{
	//  This is not an override. It's a new method in Child.
//	private void pravaiteMethod() {
//		System.out.println("childs privateMethod..");
//	}
	
//	// we can't override the praviate Methods . 
		@Override
		private void pravaiteMethod() {
			System.out.println("childs privateMethod..");
		}
		
	@Override
	public void normalMethod() { // we override the normal method
		System.out.println("childnormal method");
	}
	
	// This would cause a compilation erro
	@Override
	public final void finalMethod() { // we can't override final method
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
		Method2 m2=new Method2(); // object
		m2.normalMethod(); // child normal method
		m2.pravaiteMethod(); // childs privateMethod..
		
		Method1 m1=new Method1();
		m1.finalMethod(); // final method
		m1.pravaiteMethod();// pravaiteMethod
		m1.normalMethod(); // normalMethod
	}
	
}
