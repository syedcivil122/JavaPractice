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
public class OverloadingCase1 {
	
//		 Method Overloading - Case 1
		void show(int a) {// Automatic promotion
			System.out.println("int method");
		}
//		void show(String a) {
//			System.out.println("string method");
//		}
//		
//		Method Overloading - Case 2
		void show(Object a) {
			System.out.println("int method");
		}
		void show(String b ) {// 
			System.out.println("string method");
		}
		public static void main(String[] args) {
			OverloadingCase1 o = new OverloadingCase1();
			o.show('a');// Automatic promotion
			o.show("abc");// String method
			
		}
}
