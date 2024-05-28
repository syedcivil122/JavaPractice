package collectionsPractice;

import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ArrayDequePractice {
	/*
	 * ArrayDeue initial capacity is 17
	 * default capacity is 17
	 * internally there works in Array
	 * duplicate values not allow
	 * null values is not allow
	 * Asynchronised
	 * 
	 */
	public void Test() {
		//Array Dueue
		// Addition  -  offer,offerFirst,OfferLast, add,addFirst, addLast
		// retrieval  - peek, peekFirst, peekLast
		// Removal   -  poll,pollFirst,pollLast, remove, removeLast, removeFirst
		
//		PriorityQueue<Integer> pq= new PriorityQueue<>();
		ArrayDeque<String> pq= new ArrayDeque<>();
		pq.offer("Banana");
		pq.offerFirst("Strawberry");
		pq.offerLast("Kiwi");
		pq.add("Cherry");
		pq.addFirst("Apple");
		pq.addLast("Mango");
		
		System.out.println(pq);
		System.out.println(pq.poll()); 
		System.out.println(pq);
		System.out.println(pq.pollFirst()); // 
		System.out.println(pq);
		System.out.println(pq.pollLast());
		System.out.println(pq);
		System.out.println(pq.size());
//		System.out.println(pq.peek());// peek is returning u Head
//		System.out.println(pq.remove()); // remove Head element, but null values get expection error
//		System.out.println(pq.poll()); // remove the Head element, always highest priority element only remove
//		System.out.println(pq.poll()); // 

		System.out.println(pq.contains("Mango"));// verify the element 
		
		
//		pq.clear(); // all element delete
		System.out.println(pq);
				
	}
	
	public void Test1() {
		//LinkedList 
        // initical capacity is zero
		//duplicate values and Null values allow
		// Asynchronised
		// Addition  -  offer,offerFirst,OfferLast, add,addFirst, addLast
		// retrieval  - peek, peekFirst, peekLast
		// Removal   -  poll,pollFirst,pollLast, remove, removeLast, removeFirst
		
//		PriorityQueue<Integer> pq= new PriorityQueue<>();
		LinkedList<String> pq= new LinkedList<>();
		pq.offer("Banana");
		pq.offerFirst("Strawberry");
		pq.offerLast("Kiwi");
		pq.add("Cherry");
		pq.addFirst("Apple");
		pq.addLast("Mango");
		
		System.out.println(pq);
		
		System.out.println(pq.poll()); 
		System.out.println(pq);
		System.out.println(pq.pollFirst()); // 
		System.out.println(pq);
		System.out.println(pq.pollLast());
		System.out.println(pq);
		System.out.println(pq.size());
//		System.out.println(pq.peek());// peek is returning u Head
//		System.out.println(pq.remove()); // remove Head element, but null values get expection error
//		System.out.println(pq.poll()); // remove the Head element, always highest priority element only remove
//		System.out.println(pq.poll()); // 

		System.out.println(pq.contains("Mango"));// verify the element 
		
		
//		pq.clear(); // all element delete
		System.out.println(pq);
				
	}

	
	public static void main(String[] args) {
		ArrayDequePractice ap = new ArrayDequePractice();
//		                   ap.Test();
		                   ap.Test1();
	}

}
