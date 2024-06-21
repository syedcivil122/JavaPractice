package methods;

public class MethodStatic1 extends MethodStatic{
	// This is hiding the static method in Parent, not overriding
	@Override
	public static void staticMethod(){
		System.out.println("Test method");
	}
	
	// Overriding the instance method in Parent
	@Override
	public void insideMethod() {
		System.out.println("child insidemethod");
	}
	@Override
	private static void privateStaticMethod() {
		System.out.println("private static method");
	}
	public static void main(String[] args) {
		MethodStatic m2=new MethodStatic();
		m2.staticMethod();
		m2.privateStaticMethod
		m2.insideMethod();
		
		MethodStatic1 m1=new MethodStatic1();
		m1.insideMethod();
		m1.staticMethod();
	}

}
