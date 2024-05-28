package variables;
/*
Instance Variables:
	*Declaration - inside the class but outside the methods, constructors or blocks
	*Scope - inside all methods,constructors or block, within a class (not inside the static method)
	*When variables - when object is created variables allocated: object gets destroyed variables releases memory
	*Gets Allocated- gets executed variables allocates memory
	*Stored Memory- heap memory
	* Default values - there have default values, like int value - 0, boolean value - false, object value - null
	*Access Specifiers - can be used private,public,protected 
	* How to Access: it can be called directly but in static method- A obj=new A()
	*                                                                   obj.a(); */

public class InstanceVariables {
	
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
