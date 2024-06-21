package ExceptionHandling;

import java.io.PrintStream;

public class Except1 {
	
		public int Arthamatic(int a, int b) {
			return a+b;	
		}
		
	
	public void Armat() {
		System.out.println("Armat method..");
		try {
			int a =12;
			int b =0;
			int c =a/b;
			System.out.println(c);
		}catch (ArithmeticException e){
			e.printStackTrace();	
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}System.out.println("arthamatic end...");
	}
	
	public void ArrayIndex() {
		System.out.println("Arrayindexoutofbound");
		try {
			int[] a = {2,3,4,5,67};
//			System.out.println(a[0]);
//			System.out.println(a[1]);
//			System.out.println(a[3]);
//			System.out.println(a[5]);
			for(int i=0;i<a.length;i++) {
				System.out.println(a[5]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}System.out.println("ArrayIndexOutOfBound end..");
	}
	
	public void NullPoint() {
		System.out.println("NullPointException");
		try {
			Integer a = null;
			int b = 12;
			int c = a+b;
			System.out.println(c);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}System.out.println("NullPointException end..");
	}
	
	public void NumberFormat() {
		System.out.println("NumberFormatException");
		
		String S1 = "Hello";
		try {
			int num = Integer.parseInt(S1);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}finally {System.out.println("Finally block");};
		
			String[] S = {"abc","1234","apple","banana","","12345666"};
			for(String str:S) {
				System.out.println("ArrayString "+str);
			
			try {
				int num = Integer.parseInt(str.trim());
			}catch (ArithmeticException | NumberFormatException e) {// multi catch block
				e.printStackTrace();
		   }finally {
			   System.out.println("finally block");
		   }
	}
	}
	
	public void TRyBlock() {
		int a = 1,b=2;
		try {
			int c = a+b;
			System.out.println(c);
		}
	}
		
			public static void main(String[] args) {	
				Except1 e=new Except1();
				System.out.println(e.Arthamatic(12, 13));
//				e.Armat();		
//				e.ArrayIndex();
//				e.NullPoint();
				e.NumberFormat();
//				e.TRyBlock();
		}
	}

