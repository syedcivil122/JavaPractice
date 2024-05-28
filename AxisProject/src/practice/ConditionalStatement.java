package practice;

import java.util.Scanner;

/* Different types of Conditional Statement in Java there are;-  if, if-else, switch
 * 
	Syntax;-                  |
	-----------               |  if(condition){
	if(condition) {           |      //statements
		//statements          |   }
	}                         |   else{
	                          |      //statements
                              |    }
                              
*/
public class ConditionalStatement {
	public static void main(String[] args) {
		int i = 10;
		if(i<0) {
			System.out.println("the given number is Negative number");
		}else {
			System.out.println("the given number is Positive number");
		}
		
//    output is else condition execute
		int j =-10;
		if(j<0) {
			System.out.println("the given number is Negative number");
		}else {
			System.out.println("the given number is Positive number");
		}
		
// Nested if -else Condition Statement
		
		String examStatus ="Pass";
		if(examStatus == "Pass") {
			System.out.println("Wait for further rounds");
			String round1Status = "Pass";
			if(round1Status == "Pass") {
				System.out.println("you have clear round 1 interview, please wait for 2nd round");
				String round2Status = "Pass";
				if(round2Status == "Fail") {
					System.out.println("you have claer round 2 interview, please wait for HR round");
				}
				else {
					System.out.println("You are not clear 2nd round,You can goto home");
				}
			}
			else {
				System.out.println("You are not clear 1nd round,You can goto home");
			}
		}
		
		else {
			System.out.println("You can goto home");
		}
		
//		WAP check if a number is postive or negative
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		
		if(number>0) {
			System.out.println("this is a positive number");
		}else if(number<0) {
			System.out.println("this is a negative number");
		}else {
			System.out.println("this is zero number");
		}scanner.close();
		
//		WAP Java program to check if a given character is a vowel or consonant.
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = scanner1.next().charAt(0);
		
		if(c =='a'||c =='e'|| c =='i' || c =='o' || c =='u' || c =='A' 
				|| c == 'E' || c =='I' || c =='O' || c == 'U') {
			System.out.println(c + " is a vowel");
		}else {
			System.out.println(c + "is a consonant");
		}scanner1.close();
		
//  WAP find the largest three numbers
		
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter a largest number:");
		int num1= scann.nextInt();
		System.out.println("first largest number");
		int num2 = scann.nextInt();
		System.out.println("second largest number");
		int num3 = scann.nextInt();
		System.out.println("third largest number");
		
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1+ "num1 is largest number");
		}else if(num2>=num1 && num2>=num3) {
			System.out.println(num2 + "num2 is largest number");
		}else {
			System.out.println(num3+ "num3 is largest number");
		}scann.close();
//	   WAP even number or odd number
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}sc.close();
		
//     WAP to grade marks
		
//		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number");
		int marks = sc.nextInt();
		
		if(marks>=90) {
			System.out.println("Grade A");
		}else if(marks>=80) {
			System.out.println("Grade B");
		}else if(marks>=70) {
			System.out.println("Grade C");
		}else if(marks>=60) {
			System.out.println("Grade D");
		}else {
			System.out.println("Grade F");
		}sc.close();
		
//   WAP palindrom
		
//		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		String reveres = new StringBuilder(str).reverse().toString();
		
		
		if(str.equals(reveres)) {
			System.out.println("the string is palindrome");
		}else {
			System.out.println("the string is not palindrome");
		}sc.close();
			}		
}
