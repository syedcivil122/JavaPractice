package practice;

public class OperatorsTest {

	public static void main(String[] args) {
		int i = 20;
		int j = 10;
	
//  Arithmetic Operators    +, -, *, /, %  Operators Symbols
		
		System.out.println("addition:- "+i+j);
		System.out.println(i-j+" subraction");
		System.out.println("multiply: "+i*j);
		System.out.println("division"+i/j);
		System.out.println("remainder "+i%j);
		
		
//   Unary Operators       ++, --  Operators symbols

		System.out.println("********increment********");
		System.out.println(i); //20
		System.out.println(++i); //21 pre-increment
		System.out.println(i++); //21 post-increment
		System.out.println(i); //22
		
		System.out.println("*******decrement********");
		System.out.println(i); //22
		System.out.println(--i); //21 pre-decrement
		System.out.println(i--); //21 post-decrement
		System.out.println(i); //20 value
		
// Relational Operator   == (equal to), != (not equal to), > (greater than), < (less than), >= (greater than or equal to), <= (less than or equal to)  Symbols
		

		int a = 20;
		int b = 6;
		System.out.println("**********relational operator************");
		int k = i++ + ++i +i-- - --i; // practice
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		System.out.println(a<b);  // false
		System.out.println(a>b);  // true
		System.out.println(a<=b); // false
		System.out.println(a>=b); // true
		

/*	Conditional Operator  &&(Conditional AND)  ||(Conditional OR)  Operators Symbols
	
	*   && Operator
	* true - true -> true
	* true - false -> false
	* false - true -> false
	* false - false -> false
	* 
	* || Operator
	* true - true -> true
	* true - false -> true
	* false - true -> true
	* false - false -> false
	*/
		System.out.println("********Conditional operator**********");
		System.out.println(a < b && a==b); //false
		System.out.println(a < b || a==b); 
		
		
// Assignment Operator  =, +=, -=, *=, /=, %=  Operators Symbols
		
      System.out.println("********** Assignment Operators**************");
      a += 5;
      System.out.println(a); // 25
      a -= 5;
      System.out.println(a); // 20
      a *= 5;
      System.out.println(a); // 100
      a /= 5;
      System.out.println(a); // 20
      a %= 5;
      System.out.println(a); // 0
		
	}

}
