package oopsabstraction;
/*
 * OOPS(Object Oriented Programing System)
 * --> Class
 * --> Objects and methods
 * 
 * ------------------------------------
 * interfarence(IS A Realation)        |
 * HAS A Relationship                  |
 * Pollimorpisam                       |-------->   Code Reusaibility
 *    ---> Overloading                 |
 *    ---> Overridding                 |
 *                                     |
 * -------------------------------------   
 * 
 * ------------------------------------
 * Abstraction                         |
 * Data Hiding(Interface)              |-------->  security 
 * Encapsulation                       |
 * Tightly coupled classes             |
 * ------------------------------------
 * 
 */
public class Car extends Vechicle {
	
	public void start() {
		System.out.println("car start with key");
		
	}
	public static void main(String[] args) {
//		Vechicle a = new Vechicle();
		Car a = new Car();// 
		
	}
	


}
