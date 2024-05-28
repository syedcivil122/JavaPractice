package practice;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // scanner Object
		System.out.println("What is your name");
		String name = scanner.nextLine();
		System.out.printf("Hey %s , How are you \n", name);
		String status = scanner.nextLine();
		System.out.println("What is your age");
		int age = scanner.nextInt();
		System.out.println("thankyou for the information");
		scanner.close();
	}

}
