package oops;
/*polymorphism means many forms
 * Types of Polymorphism:
 * 1) Compile Time Polymorphism
 *   --> Static Polymorphism
 *   --> Method Overloading(achieve)
 * 
 * 	2)Run Time Polymorphism
 *    --> Dynamic Polymorpisam
 *    ---> Method Overriding
 */
class PolymorphismOverload {
	
// Overloading
	
//	void show() {
//		System.out.println("1");
//	}
//	void show() {
//		System.out.println("2"); // same method name without arguments
//	}
//	void show() { // 
//		System.out.println("1");
//	}
//	void show(int a) {
//		System.out.println("2");// same method with argument
//	}
//	void show(int a, int b) { // no.of arguments
//		System.out.println("1");
//	}
//	void show(int a) {
//		System.out.println("2");// same method no.of arguments
//	}
	void show(int a, String b) { // 10,"bcd"
		System.out.println("1");
	}
	void show(String b,int a) {
		System.out.println("2");// Sequance of arguments
	}
	void show(String s) { // without second data type
		System.out.println("1");
	}
	void show(int a) {
		System.out.println("2");
	}
	public static void main(String[] args) {
		PolymorphismOverload p = new PolymorphismOverload();
		                     p.show(10,"bcd");
	}

}
