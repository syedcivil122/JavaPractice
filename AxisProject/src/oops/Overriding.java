package oops;

public class Overriding {
	void show() {
		System.out.println("1");
	}
	
	void show(int a) {
		System.out.println("int method");
	}

	public static void main(String[] args) {
		Overriding o=new Overriding();
		           o.show();
		           
	
}
}
