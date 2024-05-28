package variables;

/*
Static Variables:
	*Declaration - with static keyword in a class but outside the methods, constructors or blocks
	*Scope - simular to instance variable inside all methods,constructors or block,  including static
	*When variables - when we run program & .class file is loaded
	*Gets Allocated- when we run file gets unloaded variable gets destroyed
	*Stored Memory- non-heap memory or static memory
	* Default values - there have default values, like int value - 0, boolean value - false, object value - null
	*Access Specifiers - can be used private,public,protected 
	* How to Access: 1) it can be called directly 2) by using class name(A.b) 3) by using object reference name
	*                                                                    */

public class StaticVariables {
	
	int a=10; //Instance variables
	static int b=20; //static variables
	
	void add() { // method
		int c =30,d;  //local variable
		    d = a+b+c;
		    System.out.println(d); //printing the value statement
		
	}
	
	void mul() {     // method
		int e =40,f; //local variable
		    f = a*b*e; 
		    System.out.println(f);  //printing execute statement
		
	}
	
	public static void main(String[] args) {   
		LocalVariables l=new LocalVariables(); //object 
		               l.add(); //calling the method data
		               l.mul(); //calling the method data
	}
	



}
