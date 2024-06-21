package inheritance;

public class Parent { // parent class
	int a ;
	String S;
	long l;
	
	public Parent(int a,String S,long l) { // argument constructor
		this.a=a;
		this.S=S;
		this.l=l;
		System.out.println(a);
		System.out.println("parent default constructor");
	}
	
	public void Test() {
		int a =43;  // local vairable inistlize
		String st = "syed"; // local variable initilize
		System.out.println(a);  // local variable access only in method inside
		System.out.println(st);
		System.out.println("parent method");
	}
	
	public int Test(int a ) {
		return 12;
	}
	
	{
		System.out.println("instance block");
	}
	
	static {
		System.out.println("static block");
	}
public static void main(String[] args) {
	
	Parent p = new Parent(23, "arif", 654323456L);
	p.Test();
	System.out.println(p.a);
	System.out.println(p.S);
	System.out.println(p.l);
}
}
