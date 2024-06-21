package oops;

public  class AbstractChild extends AbstractionTest {
	
	@Override
	public  void Test2() {
		System.out.println("Test2 method");
	}
	public static void main(String[] args) {
		
	 AbstractChild  a=new AbstractChild();
	 a.Test();
	 a.Test2();
	 AbstractionTest.Test1();
	System.out.println(name);
	}
}
