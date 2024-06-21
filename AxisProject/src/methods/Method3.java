package methods;

public class Method3 {
	public static void main(String[] args) {
		Method2 m2=new Method2();
		m2.normalMethod(); //child  normalmethod
		m2.finalMethod(); // childs finalmethod
		
		Method1 m1=new Method1();
		m1.normalMethod(); // normal method
		m1.finalMethod(); // final method
		
		m2.pravaiteMethod();
		m1.pravaiteMethod();
	}

}
