package Programs;

import java.util.Scanner;

public class Strings {
	
	public static void main(String[] args) {
		
	
	String s = "  Hello world";
	System.out.println(s.length());
	System.out.println(s.endsWith("d"));
	System.out.println(s.startsWith("H"));
	System.out.println(s.indent(12));
	System.out.println(s.indexOf("d"));
	System.out.println(s.repeat(7));
	System.out.println(s.hashCode());
	System.out.println(s.concat(" syed"));
	System.out.println(s.lastIndexOf("d"));
	System.out.println(s.replace("o", "a"));
	System.out.println(s.replaceAll("D", "s"));
	System.out.println(s.strip());
	System.out.println(s.substring(11));
	System.out.println(s.split("ello"));
	System.out.println(s.translateEscapes());
	}

}

class GreaterSix {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,45,55,34,96};
		
		int largest = numbers[0];
		
		for (int i=1; i<numbers.length; i++) {
			if (numbers[i]>largest) {
				largest = numbers[i];
			}
		}
		System.out.println("largest number"+ largest);
	}
}

//WAP even numbers

class EvenNumbers {
	
	public static void main(String[] args) {
		int n =90;
		
		if(n %2==0) {
			System.out.println("number is even-"+n);
		}else {
			System.out.println("number is odd");
		}
	}
}

class EvenNumbers1{
	public static void main(String[] args) {
		
		int start = 1;
		int end = 100;
		
		System.out.println("even numbers between"+ start +"and"+end);
		
		for(int i=start; i<end; i++) {
			if(i%2==0) {
				System.out.println("even numbers is: "+i);
			}
			else {
				System.out.println("odd numbers"+i);
			}
		}
	}
}


// WAP the two numbers
class SwapNumbers{
	public static void main(String[] args) {
		
		int a=10, b=20;
	    int t;
		
		t=a;
		a=b;
		b=t;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}

// WAP swap the two numbers without using third vairable

class SwapNumbers1 {
	public static void main(String[] args) {
		
		int a =10, b=20;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
	}
}

//  WAP multipilcation tables

class Multiple {
	public static void main(String[] args) {
		
		int no =2;
		
		
		for(int i=1; i<=10; i++ ) {
			
			System.out.println(no+"X"+no+"="+no*i);
		}
	}
}

// WAP input method

class UserInput {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter a name: ");
		String name= s.next();
		
		System.out.println("Enter a gender: ");
		char gender=s.next().charAt(0);
		System.out.println("Enter Mobile no: ");
		long mob=s.nextLong();
		System.out.println("Enter a age: ");
		int age=s.nextInt();
		System.out.println("Name "+name + ", Age "+age +", Gender "+ gender+" ,mobileno "+ mob);
		
	}
}

class Number {
	public static void main(String[] args) {
		
		for(int i=1; i<20; i++) {
			System.out.println(i);
		}
	}
}

class ReverseNumbers {
	public static void main(String[] args) {
		for(int i=20; i>=1; i--) {
			System.out.println(i);
			
		}
	}
}

class ReverseString {
	public static void main(String[] args) {
		String s="Arifullah";
		for (int i=8; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}
}

class EvennumberOrNot {
	public static void main(String[] args) {
		int a = 35;
		
		if(a%2==0) {
			System.out.println("yes it is even number: "+ a);
		}else {
			System.out.println("not a even number: "+a);
		}
	}
}

class Palindrom {
	public static void main(String[] args) {
		String s ="Arifullah",
		rev ="";
		for(int i=4; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
		if(s.equals(rev)) {
			System.out.println("palindrome= yes ");
		}else {
			System.out.println("palindrome = no");
		}
	}
}


