package collectionsPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapPractice {
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap<>();
		
		// Addition of elements in Map
		m.put(123456, "Hyderabad");
		m.put(13456, "chennai");
		m.put(467890, "mumbai");
		m.put(35678, "bangalore");
		
		// Retriving of keys from the map
		Set<Integer> keys = m.keySet(); 
		for(Integer key:keys) {
			System.out.println(key);//values
		}
		
//		Retrival of values from the map
		Collection<String> values = m.values();
		for(String value:values) {
			System.out.println(value);// keys
		}
		
//		Retrival of value from map based on a key
		System.out.println(m.get(13456));
		
		for(Integer key:keys) {
			System.out.println(key + "  >>>> "+m.get(key)); //keys and value pair
		}
		
//		Deletion of element from the map
		m.remove(123456, "Hyderabad");
		System.out.println(m);
		
		System.out.println(m.containsKey(467890)); // verify the keys
		System.out.println(m.containsValue("bangakore"));// verify the values
		
		System.out.println(m);
		m.put(13456, "Egmore");// updating the value
		System.out.println(m);
		
		int i =5; // initilisation
		i=10; // re-initilisation
		System.out.println(i);
		
		m.putIfAbsent(35678, "Delhi"); // key is already available that time value is not insert, when key is not in object that time only crate the element
		System.out.println(m);
		
		m.replace(13456, "vijaywada"); // update the value 
		System.out.println(m);
		
		System.out.println(m.size());
		
//		m.clear(); // delete the all elements
		System.out.println(m);
		
		Set<Entry<Integer, String>> entries =m.entrySet();// entry set use for key values execute
		for(Entry<Integer, String> entry: entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " >>>>>> " + value);
		}
	}


}
