package controlStatement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.String;

public class Assignments1 {
//	public void main(String[] args) {
//// Write a program verify any given number is Even or Odd
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter the number");
//		int i = s.nextInt();
//		if(i%2==0) {
//			System.out.println("Even number is : "+i );
//		}
//		else  {
//			System.out.println("Odd number is : "+i);
//			}
//		s.close();
//			System.out.println("end");
//		}
//	}
//
// class Student{
//	 public static void main(String[] args) {
////		 Write a program student result based on the grading system
//		 Scanner s = new Scanner(System.in);
//		 
//		 System.out.println("Enter a student marks: ");
//		 int i = s.nextInt();
//		 if(i<35) {
//			 System.out.println(i+" =  Fail ");
//		 }else if(i==35) {
//			 System.out.println(i + "Pass "+i); 
//		 }else if(i<70) {
//			 System.out.println("third class "+ i);
//			 
//		 }else if(i<85) {
//			 System.out.println("second class "+i);
//		 }else if(i>85){
//			 System.out.println("first class "+i);
//		 }else {
//			 System.out.println("Student details success");
//		 }
//		 s.close();
//		 
//	}
// }
//
//// Write a program print the statement based on day name
//class TeatDay{
//	public static void main2(String[] args) {
//		Scanner s= new Scanner(System.in);
//		
//		System.out.println("Enter the day: ");
//		int i = s.nextInt();
//		if(i ==1 ) {
//			System.out.println("Sunday");
//		}else if(i ==2) {
//			System.out.println("Monday");
//		}else if(i ==3) {
//			System.out.println("Tuesday");
//	   }else if(i ==4) {
//			System.out.println("Wednesday");
//	   }else if(i ==5) {
//			System.out.println("Thusday");
//	   }else if(i ==6) {
//			System.out.println("Friday");
//	   }else if(i ==7) {
//			System.out.println("Saturday");
//	   }else {
//			System.out.println("end");
//	   }
//		s.close();
//		
//}
//}
//
//class Test{
	
	void Test() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a week day: ");
		String day = scanner.nextLine();
		
		switch (day) {
		
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thusday":
		case "friday":
			System.out.println("Uff, its a weekday");
			break;
			
			
		case "saturday":
		case "sunday":
			System.out.println("Ohh!, it's a weekend");
			
		default:
			System.out.println("Invalid entered, please enter a valid of the week");
			
		}
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		Assignments1 t = new Assignments1();
		t.Test();
		
	}
	
}	


