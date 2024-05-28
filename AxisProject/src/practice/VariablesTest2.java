package practice;

//Syntax:-accessModifier class-keyword className
public class VariablesTest2 { 
//  GlobalVairables is instanceVairables & StaticVairables
	int price; // defaluteValue is Zero
	String s = "syed Arifullah"; //instanceVairable (Non-staticVairable)
	static int id = 1172; //staticVairable

/* method syntax:- accessModifier static-keyword returnType methodName()
	{
	   we can call method body or block of code 
	
     }*/
public static void test1(int age,String location) //declare or define the parameterVairable
{ // method body
	System.out.println("parameterVairables:- "+"age: "+age+", "+"location: "+location);
	System.out.println("staticVairable in methodlevel execute: "+id);
}
	
//syntax:- accessModifier static-keyword returnType mainMethod(object[] arguments)	
	public static void main(String[] args) { 
		System.out.println("staticVairable in mainMethodlevel execute: "+id);
		// DataType variableName = variableValue;
		// Define & initialization
		int pincode; //declaration or defining //LocalVairables
		pincode = 516004; // initialization
		pincode = 516224; // reassigning or re-initialization
		System.out.println("localVairable: "+pincode); //printingNextLine output
		
		test1(25,"Hyderabad");  // parametersVairables
		
//syntax;-className Vairable=new-keyword constructor should be className();
		VariablesTest2 v=new VariablesTest2(); // object we access the instanceVairables 
		System.out.println("instanceVairable take defaultZeroValue: "+v.price); // to call the instanceVairables in objectLevel
		System.out.println("staticVairable in objectlevel execute: "+v.id); // to call static vairable
	}
 // we can also create instanceVairables inside the class level
	long mobile = 234512343L; //instanceVairable

}
