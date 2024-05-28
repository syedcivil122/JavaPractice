package collectionsPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueuePractice {
	/* First in First out
	 * Priority queue by default capacity is - 11
	 * initical capacity also - 11
	 * allow duplicate elements
	 * null values not allowed
	 * Asynchronised
	 * 
	 */
	public static void main(String[] args) {
		//Priority Queue
		// Addition  -  offer, add
		// retrieval  - peek
		// Removal   -  poll, remove
		
//		PriorityQueue<Integer> pq= new PriorityQueue<>();
		PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(8);
		pq.offer(4);
		pq.add(2);
		pq.add(12);
		pq.add(1);
		
		System.out.println(pq);
		
//		System.out.println(pq.peek());// peek is returning u Head
//		System.out.println(pq.remove()); // remove Head element, but null values get expection error
//		System.out.println(pq.poll()); // remove the Head element, always highest priority element only remove
//		System.out.println(pq.poll()); // 
		
		System.out.println(pq.contains(8));// verify the element 
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
//		pq.clear(); // all element delete
		System.out.println(pq);
		
		
	}
	

}
