package polymorphism;

public class Parent {
	public void Test() {
		System.out.println("Test");
	}
	public void Test1() {
		System.out.println("Test1");
	}
	public void Test2() {
		System.out.println("Test2");
	}
	public void Test3() {
		System.out.println("Test3");
	}
	private void Test4() {
		System.out.println("Test4");
	}
	public final void Test5() {
		System.out.println("Test5");
	}
	public static void Test6() {
		System.out.println("Test6");
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.Test();
		p.Test1();
		p.Test2();
		p.Test3();
		p.Test4();
		p.Test5();
		p.Test6();
	}
	
}
