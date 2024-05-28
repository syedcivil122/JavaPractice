package practice;

public class ConstructorTest {
	
	int i;
	String s;
	long l;
	
	public ConstructorTest() { //no-argument constructor
		
	}
	public ConstructorTest(int i,String s,long l) {// parameterized constructor
		this.i=i;
		this.s=s;
		this.l=l;
		
	}
	public static void main(String[] args) { 
		ConstructorTest c=new ConstructorTest(10,"syed",25000L);
		System.out.println("student1 "+ c.i+ " "+c.s+" "+c.l);
		System.out.println("student2 "+ c.i+ " "+c.s+" "+c.l);
		
		ConstructorTest c1=new ConstructorTest(); //no-argument constructor object
		System.out.println(c1.i);
		System.out.println(c1.s);
		System.out.println(c1.l);
		
		ConstructorTest c2=new ConstructorTest();
		
	}

}
