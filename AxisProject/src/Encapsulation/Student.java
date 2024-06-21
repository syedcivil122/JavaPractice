package Encapsulation;

public class Student {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		System.out.println(t.getA());
		System.out.println(t.getC());
		System.out.println(t.getL());
		System.out.println(t.getS());
		
		
		t.setA(67);
		t.setB(false);
		t.setC('e');
		t.setS("Java");
		t.setL(9876654321L);
		System.out.println();
		
		System.out.println("modify the data");
		System.out.println(t.getA());	
		System.out.println(t.getC());
		System.out.println(t.getL());
		System.out.println(t.getS());
		System.out.println(t.isB());
		
		t.setC('y');
		t.setS("syed");
		t.setA(123);
		System.out.println();
		
		System.out.println(t.getS());
	}

}
