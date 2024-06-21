package oops;

public abstract class AbstractionTest {
	
	static String name = "hello";
	public void Test() {
		System.out.println("Test");
	}
	public int add(int a,int b) {
		return a+b;
	}
	public AbstractionTest() {
		System.out.println("abstract Constructor");
	}
	
	public AbstractionTest(int c, String S) {
		System.out.println("agrument constructor");
	}
	
	public static void Test1() {
		System.out.println("static method");
	}
	
	{
		System.out.println("instance block");
	}
	
	static{
		System.out.println("static block");
	}
	
	public abstract void Test2();
	
	public static void main(String[] args) {
//		AbstractionTest ab = new AbstractionTest(); we can't create object for abstract class
	}
	
}
