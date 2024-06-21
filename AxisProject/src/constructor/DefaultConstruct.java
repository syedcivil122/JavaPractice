package constructor;

public class DefaultConstruct {
	public DefaultConstruct() {
		System.out.println(" default constructor child class");
	}
	public static void main(String[] args) {
		DefaultConstonstructor1 d=new DefaultConstonstructor1(); //default constructor within same package
		DefaultConstruct d1 = new DefaultConstruct(); 
	}

}
