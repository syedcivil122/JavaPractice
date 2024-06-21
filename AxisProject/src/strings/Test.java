package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
//		String s = "hello";
//		String s12 = "hello";
//		String s1 = "Hello";
//		String s2 = new String("hello");
//		String s3 = new String("hello");
//		String s4 = "syed";
//		String s5 = "Arifulla";
//		String s6 = "arifulla";
//		String s7 = "python is a very easy language";
//		String s8 = new String("syed");
//		String s9 = "1";
//		String s10 = "1";
//		String s11 = new String("1");
//		System.out.println(s1==s); //false
//		System.out.println(s2==s3); //false
//		System.out.println(s5==s8); //false
//		System.out.println(s9==s10); //true
//		System.out.println(s==s12); //true
//		System.out.println(s.equals(s12)); //true
//		System.out.println(s.equals(s1)); //false
//		System.out.println(s2.equals(s3)); //true
//		System.out.println(s9.equals(s10)); //true
//		System.out.println(s9.equals(s11)); //true
//		System.out.println(s5.equals(s6)); //false
		
//		 write a program reverse string
		// method:1
//		String S = "Java programming language";
//		
//		for(int i=24;i>=0;i--) {
//			System.out.print(S.charAt(i));
//		}
//		
//		char[] charr = S.toCharArray();  // using char array
//		
//		for(int i=charr.length-1;i>=0;i--) {
//			System.out.println(charr[i]);
//		}
//		
//		// method 2
//		
//		for(int i=S.length()-1;i>=0;i--) { // using character index
//			System.out.println(S.charAt(i));
//		}
//		System.out.println("");
//		
//		// method 3
//		
//		StringBuffer sb = new StringBuffer(S); // using stringbuffer
//		System.out.println(sb.reverse());
//		
//		System.out.println("");
//		// method 4
//		
//		StringBuilder stbr = new StringBuilder(S); // using stringbuilder
//		System.out.println(stbr.reverse());
		
		
//		write a program to remove duplicate elements in strings
		String s ="programing";
		
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for(int i =0; i<s.length();i++) {
			set.add(s.charAt(i));
		}System.out.println(set);
		for(Character c:set) {
			sb.append(c);
		}System.out.println(sb);
	}

	
}
