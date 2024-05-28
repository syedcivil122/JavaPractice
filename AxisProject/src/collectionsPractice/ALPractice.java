package collectionsPractice;

import java.util.ArrayList;

public class ALPractice {
	
	public static void main(String[] args) {
		ArrayList<Integer> all = new ArrayList<Integer>(200);// Arraylist instance
		all.add(5);
		all.add(0, 8);
		all.add(0, 7);
		all.add(5);
		all.add(0, 8);
		all.add(5);
		all.add(0, 8);
		all.add(5);
		all.add(0, 8);
		all.add(5);
		all.add(0, 8);
		all.set(0, 25); //update the element
		System.out.println(all.get(4));
//		System.out.println(all.remove(8));
		
		
		System.out.println(all.indexOf(8));
		System.out.println(all);
		System.out.println(all.size());
		
		for(int i=0; i<all.size();i++) {
			System.out.print(all.get(i));
		}
		System.out.println();
	}

}
