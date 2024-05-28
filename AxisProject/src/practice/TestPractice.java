package practice;

import java.io.InputStream;
import java.util.Scanner;

public class TestPractice {
//	WAP to find greater between two or three numbers
	int a = 10;
	int b = 20;
	int c = 300;
	
//	void greater() {
//		if(a>b) {
//			System.out.println("a is greater "+a);
//		}
//		else if(a<b) {
//			System.out.println("b is greater "+b);
//		}
//		
//	}
//	
//	void greater1 () {
//		if(a>b && a>c) {
//			System.out.println("graeter a "+a);
//		}else if(b>a && b>c ) {
//			System.out.println("greater b "+b);
//		}
//		else {
//			System.out.println("greater c"+c);
//		}
//	}
	
	void greater2() {
		if(a<b)
		{System.out.println("aaa");
			if(a>c) 
			{
				System.out.println("graeter a"+a);
			}
			else
			{
				System.out.println("greater c");
			}
			
		}else if(b>c) {
			System.out.println("b is greater");
		}else {
			System.out.println("---");
		}
	}
	
//	WAP even and odd numbers
	void evenOrOdd() {
		int i =90;
		if(i%2==0) {
			System.out.println("even number");
		}
		else{
			System.out.println("odd");
		}
	}
	
// WAP check for Odd number
	int i=3;
	void odd() {
	if(i%2==1) {
		System.out.println("odd number");
	}else {
		System.out.println("no");
	}
	}
//	WAP to SWAP two numbers
	void swap() {
		int a =10,b=20;
		int c;
		c = a;
		a=b;
		b=c;
		
		System.out.println(a  );
		System.out.println(b  );
		
	}
	void swap1() {
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public void scan() {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter a name");
		scanner.next();
		System.out.println("Enter a Gender");
		scanner.next().charAt(0);
		System.out.println("Enter a Age");
		scanner.nextInt();
		System.out.println("enter a mobile number");
		scanner.nextLong();
		System.out.println("enter a fees");
		scanner.nextDouble();
		System.out.println("thank yousyed");
		scanner.close();
	}
	
	void palin() {
		String s ="madam";
		int i= 121;
		if( "madam"==s) {
			System.out.println("yes palindrom");
		}else {
			System.out.println("no");
		}
		
		if(122==i) {
			System.out.println("yes palind");
			
			}else {
				System.out.println("no");
		}
	}
void rev() {
	int[] A = {1,5,3,2,5,6};
	for(int j=0;j<A.length;j++) {
		System.out.println(A[j]);
		
	}System.out.println("reverse");
	for(int j=A.length-1;j>=0;j--) {
		System.out.println(A[j]);
		
	}
	
	String s = "Arifullah";
	for(int i=0;i<=s.length()-1;i++) {
		System.out.println(s.charAt(i));
	}
	System.out.println("reverse string");
	for(int i=8;i>=0;i--) {
		System.out.println(s.charAt(i));
	}
	
}

void maximumTest() {
	int[] a = {2,23,45,67,54,32,21};
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(max<a[i]) {
			max= a[i];	
		}
	}System.out.println("max "+max);
	
	int[] b = {2,23,45,67,54,32,21};
	int max1=b[0];
	for(int i=1;i<b.length;i++) {
		if(max1>b[i]) {
			max1= b[i];	
		}
	}System.out.println("min "+max1);

}

	
	
	public static void main(String[] args) {
		TestPractice t = new TestPractice();
//		t.greater();
//		t.greater1();
//		t.greater2();
//		t.evenOrOdd();
//		t.odd();
//		t.swap1();
//		t.scan();
//		t.palin();
//		t.rev();
		t.maximumTest();
	}
}
