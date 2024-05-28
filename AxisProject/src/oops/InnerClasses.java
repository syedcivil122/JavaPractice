package oops;
/*
 * Inner - Classes
 * 
 */
public class InnerClasses {
	public static void main(String[] args) {
		System.out.println("In  Main Method: InnerClasses");

	}

}

//  Can we have more than one class in java file?  
//  Answer: yes we will create 
class TestClass {
	public static void main(String[] args) {
		System.out.println("In  Main Method: InnerClasses");

	}
	
}
/*  can we have more than one public class in java file?  
 *   Answer:  in same java file we doesn't create an another public class - No
 *   public class TestClass1 {
	
  }*/

/* How many class files will be genereated when multiple classes are present in java file?
*  Answer: yes we generated the  multiple classes in java file
*  
*/
class TestClass1 {
	public static void main(String[] args) {
		System.out.println("TestClass1");

	}
	
}

class TestClass2 {
	public static void main(String[] args) {
		System.out.println("TestClass2");

	}
	
}

/*
 * can we have main method in all the classes present at root level of java file?
 * Answer: Yes we can have the main method in all the classes, But when we execute the code that time showing which class will be execute
 * 
 */

class TestClass3 {
	public static void main(String[] args) {
		System.out.println("TestClass3");

	}
	
}

class TestClass4 {
	public static void main(String[] args) {
		System.out.println("TestClass4");

	}
	
}

/*
 * if a java file contains more than one class at the root level, are they considered as inner classes?
 * Answer: No, In main class we does't create inner class
 *         There are the normal classes but  just packed in side one single java file
 * 
 */

/*
 * What is an inner class?
 * Answer: Yes, inner class and outer class
 */

/*
 * How many types of innerclasses available? and what are they? important
 * Answer: Thera are four types of inner classes
 *        1) non-static inner classes -----(nested classes)
 *        2)static inner classes   -----(nested classes)
 *        3)local classes
 *        4)anonymous inner classes / anonymous classes
 *        
 * Advantages of inner classes:  Scope will be limited and any class(Encapulation and inheritance concept to help the inner classes etc)
 * 
 */
//public class InnerClasses { // outter class
//	int id =102;
//	public static void main(String[] args) {
//		System.out.println("In  Main Method: InnerClasses");
//
//	}
//	
//	class TestClass5{// inner class
//		
//	}
//
//}

/*
 * Can we have more than one innerclass in a given class?
 * Answer: Yes, we can have more than one inner class but are those inner class name will be uniqe
 * 
 */
//public class InnerClasses { // outter class
//	int id =102;
//	public static void main(String[] args) {
//		System.out.println("In  Main Method: InnerClasses");
//
//	}
//	Multipule inner classes
//	class TestClass5{// inner class
//		
//	}
//  class TestClass6{// inner class
//	
//}
//	class TestClass7{// inner class
//		
//	}
//
//}

/*
 * How can we recognize any generated class file as outerclass or innerclass?
 * 
 * Answer: nameing convention or in editor next host means inner class, next numbers means outerclass
 */

//public class InnerClasses1 { // outter class
int id =102;
//public static void main(String[] args) {
	System.out.println("In  Main Method: InnerClasses");

}
//Multipule inner classes
class TestClass5{// inner class
	
}
class TestClass6{// inner class

}
class TestClass7{// inner class
	
}

}
class Test2 { // outer class
	
}
class Test3 {// outer class
	
}

/*
 * Can wr create  apublic/private/protected inner class?
 * Answer: yes, we can create
 */


public class InnerClasses1 { // outter class
int id =102;
public static void main(String[] args) {
	System.out.println("In  Main Method: InnerClasses");

}
//Multipule inner classes we can add access modifiers
public class TestClass7{// inner class
	
}
private class TestClass8{// inner class

}
protected class TestClass9{// inner class
	
}

}
class Test4 { // outer class
	
}
class Test5 {// outer class
	
}

/*
 * can we create a static/abstract/final inner class?
 * Answer: yes we can create All combination is worked  in innerclass
 */

public class InnerClasses1 { // outter class
int id =102;
public static void main(String[] args) {
	System.out.println("In  Main Method: InnerClasses");

}
//Multipule inner classes we can add access modifiers
public class TestClass7{// inner class
	
}
private class TestClass8{// inner class

}
protected class TestClass9{// inner class
	
}
public static class TestClass7{// inner class
	
}
private abstract class TestClass8{// inner class

}
protected  final class TestClass9{// inner class
	
}


class Test6 { // outer class
	
}
class Test7 {// outer class
	
}
class Test8 {// outer class
	
}
}
/*
*can we create a main method inside the innerclass?
*Answer: No we can't create main method in inner class
 */
public class InnerClasses1 { // outter class
int id =102;
public static void main(String[] args) {
	System.out.println("In  Main Method: InnerClasses");

}
//Multipule inner classes we can add access modifiers
public class TestClass7{// inner class
	public static void main(String[] args) { // we can't create main method in inner class
		System.out.println("In  Main Method: InnerClasses");
	
}
private class TestClass8{// inner class

}
}

/*
 * 
 */

