package collectionsPractice;

import java.util.LinkedList;
/*
 * Arraylist:
1)Enter 10 Integers: 1 8 9 2 6 6 1 3 5 5  
   your unique sorted elements: [1,2,3,5,6,8,9]

2)Enter 10 integers; 1 1 1 1 1 1 1 1 1 2
  your unique sorted elements; [1,2]

3) Enter 5 strings: Neso Neso Academy Academy Neso
   your unique sorted elements: [Academy , Neso]

4) Read N element from the user input user


convert array to arraylist:

String [] colours={"Red","Green","Blue"}
list=Arrays.asList(colours);
Syso(list)

List<String> l = new ArrayList<>();
Collections.addll(l,colours)
syso(l)

for(String a:l){

 * 
 */
public class LinkedArry {
	public void linked() {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		l.add(21);
		l.add(32);
		l.add(3, 142);
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.indexOf(2));
//		l.remove(16);
		l.remove(2);
		System.out.println(l);
		
	}
	public static void main(String[] args) {
		LinkedArry a=new LinkedArry();
		a.linked();
	}

}
