package oops;
/*
 * Method Overloading:
 * 1)same name
 * 2)same class
 * 3)different arguments
 *    --> No.of arg
 *    --> Seq of arg
 *    -->Type of arg
 */
public class PolymorphismOverloadImportantTopics {
/* 1) Can we achieve Method Overloading by changing the return type of method only?
*	  Answe: In java, method overloading is not possible by changing the return type of the method 
*           only because of ambiguity.
*
**/	
	
	void show(int a) { // 
		System.out.println("1");
	}
	String show(int a) {
		System.out.println("2");
	}
	
/*
 * 2)  Can we overload java main() Method?
 *   Answer: Yes, we can have any no.of main methods in a class by method overloading.
 *           This is because JVM always calls main() method which receives string array as arguments only.
 */
	
	public static void main(String[] args) {
		  System.out.println("1"); // first output execute
		PolymorphismOverloadImportantTopics pt = new PolymorphismOverloadImportantTopics();
		              pt.main(20);                   
	}
	public static void main(int a) {//overload main method
		System.out.println("3");// second output execute
	}

}
