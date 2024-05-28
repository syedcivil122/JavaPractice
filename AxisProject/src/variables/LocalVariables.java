package variables;
/*
Local Variables:
	*Declaration - inside methods, constructors or blocks
	*Scope - inside the methods,constructors or block, not outside
	*When variables - when method,constructor or block
	*Gets Allocated- gets executed variables allocates memory
	*Stored Memory- stack memory
	* Default values - doesnt have any default values, value should be provided before use
	*Access Specifiers - cannot be used private,public,protected with local variable */

public class LocalVariables {//class name LocalVariables
	
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
