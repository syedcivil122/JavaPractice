package oops;


public class OverridingChild extends Overriding{
	
		void show() {
			System.out.println("2");
		} 
		void show(String a) {
			System.out.println("String method");
		}
		public static void main(String[] args) {
			Overriding o=new Overriding();
			           o.show();
			           o.show(12);
			           
		OverridingChild x=new OverridingChild();
		x.show();
		x.show("as");
		OverridingCase1 ov=new OverridingCase1();
		ov.show();
		}
	}
	


