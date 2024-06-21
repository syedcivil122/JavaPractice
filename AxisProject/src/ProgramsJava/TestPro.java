package ProgramsJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;

public class TestPro {
//	 Write a program to check the number is positive or negative
	int a = 0;
	public void Number() {
		if(a>0) {
			System.out.println("Positive number");
		}else if(a<0){
			System.out.println("Negative number");
		}else {
			System.out.println("Zero number");
		}
	}
	
//	 Write a program to check the number is even or odd
	int b =123;
	public void EvenOrOdd() {
		if(b%2 == 0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd number");
		}
	}
	
//	Write a program to check the Alphabet is vowel or consonant
	public void Alphabet() {
		char[] alphabet = {'A','E','O','U','I','a','e','o','u','i','q','r','t','y'};
        for(char ch : alphabet) {
        	boolean isvowel = false;
            if (ch == 'A' || ch == 'a' ||
                ch == 'E' || ch == 'e' ||
                ch == 'O' || ch == 'o' ||
                ch == 'U' || ch == 'u' ||
                ch == 'I' || ch == 'i') {
            	isvowel = true;
                
            } if(isvowel) {
            	System.out.println(ch+" is vowel");
            }else {
            	System.out.println(ch+ " is consonamt");
            }
        }
		
	}
	
//	 write a program to find the largest among three numbers using inbuild function
	public void Largest() {
		int a =23,b=45,c=34;
		int result = Math.max(a,Math.max(b,c));
		System.out.println(result);
	}
	
	public void LNum() {
		int a =23,b=45,c=34;
		if(a>=b && a>=c) {
			System.out.println(a);
		}else if(b>=a && b>=c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
	
//	write a program swap a two numbers without using third variable
	public void Swap() {
		int x = 2, y =4;
		System.out.println("x= "+ x+ " \n" + "y= "+ y);
		x = x + y;  // x = 2 + 4 = 6;
		y = x - y;  // y = 6 - 4 = 2;
		x = x - y ; // x = 6 - 2 = 4;
		System.out.println("after swap");
		System.out.println("x= "+ x+ " \n" + "y= "+ y);
		
//   write a program swap a two number using third variable
		int x1 = 4, y1 =6, t;
		
		t = x1;  // 4
		x1 = y1;  // 6
		y1 = t; // 4
		
		System.out.println("after swap");
		System.out.println("x1= "+ x1+ " \n" + "y1= "+ y1);
		
	}
//	Write a program to find frequency word in the string
	public void FrequencyWord() {
		String st = "Test Test Automation Central Central";
	
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String str:st.split(" ")) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
				
			}
		}System.out.println(map);
		
		Set<String> se = new HashSet<String>();
		System.out.println(se.add(st));
		
	}
	
	public void Duplicate() {
		int [] a = {1,3,4,2,3,5,6,7,8,5,4,3,2,1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate value "+a[i]);
				}
			}
		}
		
	}
	
	public void RemoveSpecial() {
		String s = "!Abc123@#$_%";
		
		s = s.replaceAll("[^A-Za-za-z0-9]", "");
		System.out.println(s);
	}

	public static void main(String[] args) {
		TestPro t = new TestPro();
//		t.Number();
//		t.EvenOrOdd();
//		t.Alphabet();
//		t.Largest();
//		t.LNum();
//		t.Swap();
//	t.FrequencyWord();
		t.Duplicate();
		t.RemoveSpecial();
	}

}
