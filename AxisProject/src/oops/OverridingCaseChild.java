package oops;

public class OverridingCaseChild extends OverridingCase1 {
	String show() {
		System.out.println("string");
		return null;
	}
//	Object show() {// Co vairent return type
//		 System.out.println("1");
//		return null;
	public static void main(String[] args) {
		OverridingCaseChild o=new OverridingCaseChild();
		           o.show();
		OverridingCase1 c =  new OverridingCase1();
		               c.show();
	}
	
}
