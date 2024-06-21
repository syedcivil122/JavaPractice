package polymorphism;
/*
 * Polymorphism :
 * 1) Compile time Error (Method Overloading)
 * 2) Run time Error (Method Overriding)
 * 
 */
public class OverloadingP {
//	public int add(int a,int b) {
//		return a+b;	
//	}
//	public String add (String s,String st) {
//		return s+st;
//	}
//	public double add(double a, double b) {
//		return a+b;
//	}
	public void laptop(int model,String name) {
		System.out.println("laptop1");
	}
	public void laptop(String name,int model ) {
		System.out.println("laptop2");
	}
	public void laptop(long deviceip, double cost) {
		System.out.println("laptop3");
	}
	public static void main(String[] args) {
		OverloadingP O = new OverloadingP();
		O.laptop(121, "dell");
		O.laptop("Hp", 122);
		O.laptop(25000L, 123.45);
	}

}
