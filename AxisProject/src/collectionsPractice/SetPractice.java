package collectionsPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
	/*
	 * Hashset internal implement HasMap
	 * default capacity is Zero
	 * initial capacity is 16
	 * duplicate values not allow
	 * Allow null value
	 * Asynchronised
	 * Sortedorder No
	 * 
	 */
	public void Test() {
		// HashSet -> HasnMap -> Array of nodes(key, value)
		//Set<Integer> hs = new HashSet<>();
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(2);
		hs.add(13);
		hs.add(19);
		hs.add(20);
		hs.add(25);
		hs.add(10);
		
		hs.remove(19);// data is remove
		System.out.println(hs.remove(1)); // false
		
		System.out.println(hs.contains(20));// true
		
		for(Integer element : hs) {
			System.out.println(element);
		}
		
		
		System.out.println(hs);
		
	}
	
	public void Test1() {
		
/*   LinkedHashSet internal implemantation is LinkedHashMap
 *   link of nodes(key ,value)
 *   default capacity is 16
 *   initial capacity is 16
 *   duplicate values not allow
 *   Allow null value
 *   Asynchronised
 *   Sortedorder No
 * 
 * Set has three implentation HashSet, LinkedHashSet, and TreeSet (TreeSet only not allowed the Null values)
*/
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(10);
		hs.add(2);
		hs.add(13);
		hs.add(19);
		hs.add(20);
		hs.add(25);
		hs.add(10);
		
		hs.clear();
		hs.remove(19);// data is remove
		System.out.println(hs.remove(1)); // false
		
		System.out.println(hs.contains(20));// true
		
		for(Integer element : hs) {
			System.out.println(element);
		}
		
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
	}
	
public void Test2() {
		
	/* TreeSet -> internal implenmatation is Treemap -> binary tree
	 * Sorted Order or ascending order 
	 * default capacity is Zero
	 * initial capacity is Zero
	 * duplicate values not allow
	 * Allow null value
	 * Asynchronised
	 * Sortedorder Yes
	 */
		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(10);
		hs.add(2);
		hs.add(13);
		hs.add(19);
		hs.add(20);
		hs.add(25);
		hs.add(10);
		
		System.out.println(hs.first());// lowest element 
		System.out.println(hs.last());// highest element
//		System.out.println(hs.pollFirst());// lowest element remove
//		System.out.println(hs.pollLast());// highest element remove
		System.out.println(hs);
		System.out.println(hs.subSet(4, 45).remove(13));// 
		System.out.println(hs);
		System.out.println(hs.descendingSet());
		
//		hs.clear();
//		hs.remove(19);// data is remove
//		System.out.println(hs.remove(1)); // false
		
		System.out.println(hs.contains(20));// true
		
		for(Integer element : hs) {
			System.out.println(element);
		}
		
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
	}
	public static void main(String[] args) {
		SetPractice S = new SetPractice();
//		            S.Test();
//		            S.Test1();
		            S.Test2();
	}

}
