package inheritance;

public class Child1 extends Parent{
	public Child1() {
		super(11, "data", 786666666L);
		System.out.println("super class");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent(22, "java", 99999999L);
		System.out.println(p.a);
		System.out.println(p.S);
		p.Test();
		p.Test(10);
		
		Child1 c = new Child1();
	System.out.println(c.a);
	System.out.println(c.S);
	System.out.println(c.l);
	}

}
