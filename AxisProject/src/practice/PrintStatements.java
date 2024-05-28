package practice;

public class PrintStatements {
/* ********Formating*********************
   %b   boolean
   %c   character 
   %d   integer
   %e   scientific notation
   %f   floating point
   %s   string
   %tc  complete data and time
   %n   a newline on the platform
   %%   the character %
 */
	public static void main(String[] args) {
//		Print, Printf,  Println
		System.out.println("Hello world"); // println is execute the data in nextline
		System.out.print("Python language "); // same line
		System.out.printf("the current year is %d and the month is %s %n",2024, "May");// f  formating string
		
		// error type of output is shows red colour
		System.err.println("Hello"); // ln means nextLine
		System.err.print("Java language %e");
		System.err.printf("I am  %s I completed graduate in %d year I got %f percentage ", "syed", 2018, 64.0);// f means formating

	}

}
