package Encapsulation;

public class Teacher {
	private int a = 12;
	private String s= "Hello";
	private long l = 123456789L;
	private boolean b = true;
	private char c = 'a';
	
	public Teacher() {
		
	}
	
	public Teacher(int a, String s, long l, boolean b, char c) {
		super();
		this.a = a;
		this.s = s;
		this.l = l;
		this.b = b;
		this.c = c;
	}

	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public long getL() {
		return l;
	}

	public void setL(long l) {
		this.l = l;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public static void main(String[] args) {
		Teacher t=new Teacher();
		System.out.println(t.a);
		System.out.println(t.s);
		System.out.println(t.l);
		System.out.println(t.b);
		System.out.println(t.c);
		
	}

}
