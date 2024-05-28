package loans;

import java.util.ArrayList;
import java.util.HashMap;

//class Practice { default class
public class Practice { // public class we can access any where same package, different class, different projects
	/*	 
	 * Types of Vairables: 3 types
	 * 1) Instance Vairables: we use in class level or global level
	 * 2) Static Vairables: instance vairable we add static keyword that is static vairables
	 * 3) Local Vairables: local vairables we use in method level
	 * 
	 *  Primitive datatype store in variables
	 */
	
	public int A = 12; // public vairable
	private int a; //private vairable
	protected int b = 12; // inisilization
	long l = 123456678L;
	float fa = 1.12f;
	double d = 12.34;
	short s = 1234;
	char c = 's';
	boolean bl = true;
	
//	Static Vairables
	static int a1 ; // decclaration
	static long sl = 12345678L; // initilization
	static float sf = 1.23f; //initilization
	static char sc = 'a';
	static boolean sb = false;
	
	/*
	 * Non- Primitive Data types store in vairables
	 * 
	 */
	
	String S = "syed"; // initilization
	Long L = 123445677L;
	Integer I = 12;
	Boolean B = true;
	Byte By = 123;
	Double D = 12.1244;
	Character C ='a';
	int[] arr = {1,2,3,4,5};
	char[] carr = {'a','b','r','e','y'};
	String[] Sary = {"asd","ert","tyu","wer"};
	
	
	static String SS = "syed"; // initilization
	static Long SL = 123445677L;
	static Integer SI = 12;
	static Boolean SB = true;
	static Byte SBy = 123;
	static Double SD = 12.1244;
	static Character SC ='a';
	static int[] Sarr = {1,2,3,4,5};
	static char[] Scarr = {'a','b','r','e','y'};
	static String[] SSary = {"asd","ert","tyu","wer"};
	
/* Constructors there are three types of constructor
 * 1) default constructor
 * 2) no-argument constructor
 * 3) paramiterised constructor
 * 
 */
	public Practice() { // default constructor
		
	}
	
	public Practice(int a, String S, long l) { // argument constructor
		this.a = a;
		this.S = S;
		this.l = l;
		HashMap<K, V>
		int[] Z = new int[6];
		System.out.println(Z);
		ArrayList<Integer> A = new ArrayList<Integer>(10);
		System.out.println(A);
		A.add(12);
		A.add(14);
		A.add(16);
		System.out.println(A);
		A.ensureCapacity(20);
		System.out.println(A);
	}
	
	/* 
	 * Methods
	 */
	
	public void Test() {// method
		int a = 12;
		String S = "arif";
		long l = 1234566L;
//		static int a = 12: we does't not creat static vairables in side the method 
		System.out.println(a);// instance variable calling
		System.out.println(S);
		System.out.println(l);
		
		System.out.println("InstanceMethod clling static Va " + Practice.SD);
	}
	
	static public void Test2(){
		System.out.println("static Method " + Practice.a1);
		System.out.println("static Method " + Practice.SSary);
		System.out.println("static Method " + Practice.SL);
	}
	
	/*
	 * Blocks there are two types of blocks
	 * 1) instance block
	 * 2) static block
	 */
	{// blocks   
		
		long l =123455L;
		System.out.println("this is a block "+l);
	}
	
	static{
		String S = "arif";
		System.out.println("this is a static block "+S);
	}
	
	public static void main(String[] args) {
		Practice p =new Practice(12, "syed", 1234567L);// create object with class name and in constructor we call parameters
		System.out.println("parameter constructor " +p.a + " " + p.S + " " + p.l);
		System.out.println("static vairables: " +Practice.SS);
		p.Test();// calling method
		System.out.println();
	}
	

}
