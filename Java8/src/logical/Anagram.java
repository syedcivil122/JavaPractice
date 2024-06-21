package logical;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String name1= "begiN";
		String name2 = "beinG";
		
		String str1 = name1.toLowerCase();  //begin
		String str2 = name2.toLowerCase();  //being
		
		if(str1.length()==str2.length()) {  //if length equal, then only has a possibility to be anagram
			char[] ch1=str1.toCharArray();  //[b,e,g,i,n]
			System.out.println();
			char[] ch2=str2.toCharArray();  //[b,e,i,n,g]
			
			Arrays.sort(ch1);   // b e g i n
			Arrays.sort(ch2);   // b e g i n
			
			Boolean result=Arrays.equals(ch1, ch2);
			if(result==true) {
				System.out.println("it is anagram");
			}else {
				System.out.println("it is not anagram");
			}
			
		}else {
			System.out.println("not anagram");
		}
	}

}
