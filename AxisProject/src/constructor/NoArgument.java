package constructor;

/*
*    Summary:
* Public Constructors: Accessible from any other class.
* Protected Constructors: Accessible within the same package and subclasses.
* Default Constructors: Accessible only within the same package.
* Private Constructors: Accessible only within the same class, useful for singleton patterns or factory methods.
* 
*/

public class NoArgument {
	
	// default constructor
	public NoArgument(){ // Constructor should be class name
		System.out.println("default constructor");	
	}
	
	//  No Agrument Constructor
	public NoArgument() { //  Override the default constructor
		System.out.println("No Agrument Constructor");
	}
	
	// parameter Constructor
	public NoArgument(int a) {
		System.out.println("parameter Constructor..");
	}
	
	public static void main(String[] args) {
		NoArgument a=new NoArgument(12); // parameter constructor	
	}

}
