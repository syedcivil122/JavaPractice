package polymorphism;

public class Child extends Parent{
	@Override
	public void Test1() {
		System.out.println("Test1");
	}
	@Override
	public void Test2() {
		System.out.println("Test2");
	}
	@Override
	public void Test3() {
		System.out.println("Test3");
	}
	@Override
	public void Test4() {
		System.out.println("Test4");
	}
	@Override
	public void Test5() {
		System.out.println("Test5");
	}
	@Override
	public void Test6() {
		System.out.println("Test6");
	}
	
	public static void main(String[] args) {
	  Child c=new Child();
	  c.Test1();
	  c.Test2();
	  c.Test3();
	  c.Test4();
	  c.Test5();
	  c.Test6();
	}
	
}
