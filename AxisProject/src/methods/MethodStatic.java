package methods;

public class MethodStatic {
	
	public static void staticMethod() {
		System.out.println("normal static method..");
	}
	
	public void insideMethod() {
		System.out.println("inside method..");
//		public void instanceMethod() { // method inside method we can't create
//			System.out.println("instance method..");
//		}
	}
	private static void privateStaticMethod() {
		System.out.println("private static method");
	}
	
	
	public static void main(String[] args) {
		MethodStatic ms=new MethodStatic();
		ms.staticMethod();
		ms.privateStaticMethod();
		ms.insideMethod();
		
		
	}
	

}
