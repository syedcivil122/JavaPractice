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

public class OvloadingCase3 {

//	Method Overloading - Case 3
	void show(StringBuffer a) {
		System.out.println("Stringbuffer method"); 
	}
	void show(String b) {
		System.out.println("string method"); 
	}
	
//	Method Overloading - Case 4
	void show(int a, float b) {
		System.out.println("int float method"); 
	}
	void show(float a, int b) {
		System.out.println("float int method"); 
	}
	void show(String a, float b) {
		System.out.println("int float method"); 
	}
//	Method Overloading - Case 5
	/*
	 * In general, varags get least priority i.e if no other method matched, then only vararg method will get the chance
	 * because int came in 1.0 version & varags came in 1.5 version.
	 */
	void show(int a) {
		System.out.println("int method");
	}
	void show(int...a) {// varargs allows the method to accept zero or multiple arguments.
		System.out.println("varargs method");
	}
	
	public static void main(String[] args) {
		OvloadingCase3 o=new OvloadingCase3();
       o.show("abc");// string method
       o.show(new StringBuffer("xyz"));// Stringbuffer method
//       o.show(null);// String & StringBuffer are at same level so "null" cannot be referred,ambigious error will occur
       o.show(10,20.5f);
       o.show(20.5f, 10);
//       o.show(10,20);// error: ambiguous for the type
       o.show("abc", 10);
//       o.show(20.5f, 10.4f);// error: no sutable method found for show(float,float)
       o.show(10);
       o.show(12,34,23);// multiple arguments
       o.show();// without arguments execte the varargs method
       
       
	}

}
