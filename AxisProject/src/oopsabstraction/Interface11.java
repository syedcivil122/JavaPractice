package oopsabstraction;

//   Interface:
// It is used to achieve abstraction
// It supports multiple inheritance
// it is udsed to achieve loose coupling

public interface Interface11 {
	
	int a = 12;
	
	void show(); // abstract method
	
	default void test() { // default method
		System.out.println("default method");
	}
	
	static void test1() { // static method
		System.out.println("static method");
		
	}
	
//	Interface11 i = new Interface11(); we can't craete interface object
	

}
