package oops;
/*
 *                                      Object
 *                                        |
 * ----------------------------------------------------------------------------------                       
 * |           |              |           |         |          |            |        |
 *string   stringbuffer  Stringbuilder  Number   Character    Boolean     void     ......
 *                                        |
 *           -------------------------------------------------
 *           |       |        |        |         |           |
 *         Byte    Short   Integer   Long      Float       Double
 *
 */
public class OverridingCase1 {
//	Case1
//	Do overriding method must have same return type(or subtype) ?
//	Answer: from java 5.0 onwards it is possible to have different return type foa a overriding method 
//	in child class, but child return type should be sub-type of parents return type.
//	   --> This phenomena is known as covariant return type.
	
 Object show() {// Co vairent return type
	 System.out.println("1");
	return null;
 }
// String show() {
//		System.out.println("string");
//		return null;
//	}
 
/*Case 2: Overriding and Access Modifier
* the access modifier for an overriding method can allow more but not less access than tje overridden method
*  Ex: a protected instance method in the sub class can be made public can be made public but notprivate in the sub class
*        doing so, will generate compile-time error
*/
 public static void main(String[] args) {
	 OverridingCase1 c =  new OverridingCase1();
     c.show();
}
}
