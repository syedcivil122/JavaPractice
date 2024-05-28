package collectionsPractice;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;

public class LinkedListPractice {
	/*
	 * Impotrant points
	 * 
	 * default capacity is Zero
	 * initial capacity is Zero
	 * internallity there works multiple node structure
	 * allow duplicate values - yes
	 * allow null values - yes
	 * does it maintain insertion order - yes
	 * it is Asynchronised
	 * it is good for add and remove 
	 * 
	 * there are two type of linkedlist 1) single linkedlist  2)double linkedlist we use in java
	 */
	
	public static void main(String[] args) {
		
//		Iterable<Integer> il = new LinkedList<>(); 
//		Collection<Integer> cl = new LinkedList<>();
//		Queue<Integer> ll = new LinkedList<>();
//		Deque<Integer> ql = new LinkedList<>();
//		List<Integer> ll = new LinkedList<>();
		
		ArrayList<String> al = new ArrayList<>();
		al.add("S1");
		al.add("S2");
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Y1");
		ll.add("Y2");
		ll.add("Y3");
		ll.add(1, "Y4");
		ll.addAll(0, al);
		ll.add(null);
		ll.add("Y3");
		ll.add(null);
		ll.add("AA");
		
		ll.set(2, "SS");
		ll.remove(1);
		System.out.println(ll);
		ll.remove("Y2");
		System.out.println(ll);
//		ll.clear();
		System.out.println(ll.get(3));
		System.out.println(ll.contains("YY"));
		System.out.println(ll.size());
		
		System.out.println(ll);
	}

}
