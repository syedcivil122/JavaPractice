package collectionsPractice;

import java.util.Stack;

public class STPractice {
	public static void main(String[] args) {
		/*
		 * LIFO - Last in first out -Stack
		 * FIFO - First in first out - Queue
		 * 
		 * Stack is aclass in java which implements the list interface and extends the vector class and also represents the LIFO principle.
		 * 
		 * initical capacity is 10
		 * default capacity is 10
		 * size will be incresase 100%
		 * synchronised and legasy class and thread safe
		 * duplicate and null values is allow
		 * Special Methods available in stack
		 * 1)push  2)pop  3)peek   4)search
		 */
		
		Stack<String> books = new Stack<>();//
		books.push("Red"); // adding push method
		books.push("Black");
		books.push("white");
		books.push("white");
		books.push(null);
		
		System.out.println(books.isEmpty());
		System.out.println(books.empty());
		System.out.println(books.size());
		System.out.println(books);
		System.out.println(books.search("white"));// search
		System.out.println(books.indexOf("white"));
		System.out.println(books);
	}

}
