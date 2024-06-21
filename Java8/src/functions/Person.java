package functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{ // class
	int age;
	String name;
	
	
	public Person(int age, String name) { //constructor
		this.age = age;
		this.name = name;
	}
	
  
	@Override
	public String toString() {   // toString method
		return "Person [age=" + age + ", name=" + name + "]";
	}

	

	public static void main(String[] args) {
//		Person p1 = new Person(25, "rohan");
//		Person p2 = new Person(26, "sonu");
//		Person p3 = new Person(21, "ramesh");
//		List<Person> list = Arrays.asList(p1,p2,p3);
		
		
		List<Person> list = Arrays.asList(new Person(25, "Rahul"),
				                          new Person(23, "Sohail"),
				                          new Person(21, "Amman"),
				                          new Person(26, "Balu"));
		
		
//		Collections.sort(list);
		
		// Sorting by age using Lamda Function
		Collections.sort(list,(p1,p2) -> p1.age - p2.age );
//		list.forEach(System.out::println);  // forEach single line 
		for(Person byage:list) {
			System.out.println("Sorted by age: "+byage);
		}
		
		System.out.println();
		
		// Sorting by name using Lamda Function
		Collections.sort(list,(p1,p2) -> p1.name.compareTo(p2.name));
//		list.forEach(System.out::println);
		for(Person byName:list) {
			System.out.println("Sorted by name: "+byName);
		}
		
	}


	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
//		return this.age - o.age;
		return this.name.compareTo(name);
	}
	
}
