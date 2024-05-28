package practice;

public class Oops {
	
	int a = 12;
	String s = "syed";
	static long mobile = 123456789L;
	
	public void testString() {
		String s1 = "arif",s2;
		       s2 = s+s1;
		       System.out.println(s2);
		       
	}
	public void test1() {
		int b = 43,c;
		    c = a+b;
		    System.out.println(c);
		    System.out.println(mobile);
	}
	public void test2() {
		
		int a = 14;
		System.out.println(a);
		
	}
	
	{
		int a = 14;
		System.out.println("block - "+a);
	}
	
	static {
		String st = "arifullah";
		System.out.println("static block:- "+st);
	}
	
	final
		
	}
	
	public static void main(String[] args) {
		Oops op=new Oops();
		op.testString();
		op.test1();
//		op.test2();
		 System.out.println(mobile);
	}

}
