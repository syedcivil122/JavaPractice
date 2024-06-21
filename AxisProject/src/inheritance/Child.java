package inheritance;

public class Child {
	
	public String St() { // instance method
		return "hello";
	}
	
	public void child() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.child();
		System.out.println(c.St());
		
		Parent p= new Parent(121, "lokesh", 454333433L);
		p.Test();
		p.Test(234);
		System.out.println(p.a);
		System.out.println(p.S);
		System.out.println(p.l);
		
	}
	
	

}
