package collectionsPractice;

import java.util.Arrays;
//import java.util.*;
import java.util.Vector;

public class VPractice {
	
	public static void main(String[] args) {
		// Size - no of elements present in list
		//  default capacity - 10
        //  initial Capacity - Array capacity - 10
		//  size will be increase 100%
		//  generics  1.5
		//  Vector java 1.0
		//  collections 1.2
		// null values allow
		// duplicate values allows
		// insertion order maintain - yes
		// does't maintain sorted order  -no
		// random access element - yes
		// Synchronised - yes
		// multi threading, data is increased exponentially
		
		Vector<String> v1 = new Vector<String>();
		v1.add("syed");
		v1.add("arif");
		v1.add("aa");
		v1.add("bb");
		v1.add("cc");
		v1.add("dd");
		v1.add(null);
		Vector<String> v2 = new Vector<String>();
		v2.add("ee");
		v2.add("ff");
		v2.add("gg");
		v2.add("hh");
		v2.add("ii");
		v2.add("aa");
		v1.addAll(v2);//addingall elements
		v1.set(0, "Satish");//index throw adding the element
		v1.set(0, "Satish");
		System.out.println(v1.indexOf("aa"));
		System.out.println(v1.lastIndexOf("aa"));
		System.out.println(v1.lastElement());
		System.out.println(v1.firstElement());
//		System.out.println(v1.);
//		v1.remove(0);// remove single element
//		v1.removeAll(v2);// removeall elements method
		System.out.println(v1.containsAll(v2));
		System.out.println(v1.contains("cc"));// verifing the element
//		v1.clear();// clear the all data
		
		
//		v1.addAll(0, v2);// addall elements in index 0
//		for(int i=0; i<v2.size();i++) {// adding elements
//			v1.add(v2.get(i));	
//		}
//		System.out.println(v1.get(2));// index element
//		System.out.println("capacity" + v1.capacity());
//		System.out.println("Size" + v1.size());
		System.out.println(v1);
//		Object[] arr = v1.toArray();// array object
//		System.out.println(Arrays.toString(arr));
		
		Vector<String> v3 = new Vector<String>(20);
		v3.add("asd");
		v3.add("ert");
		
		System.out.println(v3.size());
		System.out.println(v3.capacity());
		
		Vector<String> v4 = new Vector<String>(200);
		v4.add("qwe");
		
		System.out.println(v4.size());
		System.out.println(v4.capacity());
		
		Vector<String> v5 = new Vector<String>();
		System.out.println(v5.capacity());
	
	}
	

}
