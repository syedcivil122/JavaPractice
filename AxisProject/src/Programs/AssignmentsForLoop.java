package Programs;

public class AssignmentsForLoop {

	public static void main(String[] args) {
		
// Write A program print 1 to 100 values
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		
		
// Write a program even numbers 200 to 500
		System.out.println("=====Even numbers===========");
		for(int i=200; i<=500;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
// Write a program print the numbers which are divisible by 7 for th range of 150 to 200
		System.out.println("print the numbers which are divisible by 7 for th range of 150 to 200");
		
		for(int i=150; i<=200; i++) {
			if(i%7==0) {
				System.out.println(i);
			}
		}
		
// Write a program even number sum
		int sum = 0;
		for(int i=40; i<80;i++) {
			if(i%2==0) {
				sum +=i;
				
			}
			
		}System.out.println(sum);
		
// Write a program odd numbers reverse
		System.out.println("reverse odd numbers between 200 to 25");
		for(int i=200; i>=25; i--) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
	
	
}
