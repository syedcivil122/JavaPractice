package practice;

public class DataTypes {
	public static void main(String[] args) {
		
	
	
//	there are two types of datatypes are there 
//	1)primative datatype
//    2) non-primitive data type or (object datatype)

//	primative datatype:
		int a = 12; // int data type
		byte bt = 13; //byte datatype
		char b = 's'; // character datatype
		long c = 123466999L; //long datatype
		short d = 4523; //short dtatatype
		float e = 12.4f; //float datatype
		double g = 123.56; //double data type
		boolean le = true; //true or false boolean data type
		
		
		System.out.println("int data type "+ a);
		System.out.println("byte data type "+ bt);
		System.out.println("char data type "+ b);
		System.out.println("long data type "+ c);
		System.out.println("short data type "+ d);
		System.out.println("float data type "+ e);
		System.out.println("double data type "+ g);
		System.out.println("boolean data type "+ le);
		int in = 14;
		int sum = a+b;
		
		System.out.println("int data type "+ sum );
		
		char ca = 'e'+'s';
		     
		
		System.out.println(" char data type "+ ca);
		
		
//    non-primitive dataType ;
         String s = "Syed";
         int[] arr = {2,4,5,7,8};
         Integer i= 123;
         
         
         
         for(i=0; i<arr.length; i++) {
        	 System.out.println(arr[i]);
         }
         
         System.out.println("array data type "+ arr);
         
         
         String s1 = "arifullah";
        
         System.out.println(s.concat(s1));
         System.out.println(s+s1);
         String s3 = s+s1;
         System.out.println(s3);
         
         
	}
         
		
				
}
