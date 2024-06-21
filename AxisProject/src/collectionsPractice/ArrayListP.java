package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListP {
	public void Array() {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(13);
		a1.add(43);
		a1.add(14);
		a1.add(56);
		a1.add(114);
		a1.add(43);
		a1.add(14);
		a1.add(56);
		a1.add(114);
		a1.add(16);
		
		
		System.out.println(a1);
		for(int arr:a1) {
			System.out.println(arr);
		}
		
	System.out.println("==================integer Array closed====================");
//		ArrayList<String> a2= new ArrayList<String>(); default capacity
		ArrayList<String> list= new ArrayList<String>(20);
		list.add("Apple");
		list.add("banna");
		list.add("berry");
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		ArrayList<String> list1= new ArrayList<>();
		list1.add("11");
		list1.add("22");
		list1.add("33");
		list1.add("44");
		list1.add("55");
		list.addAll(list1);
		int size = list.size();
		System.out.println("size: "+size);
		for(String arl:list) {
			System.out.println(arl);
		}
		
		list.add(10, "12212");
		System.out.println(list.contains("cc"));
		System.out.println(list.hashCode());
		System.out.println(list.isEmpty());
		System.out.println(list.clone());
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		System.out.println(list.lastIndexOf("55"));
		System.out.println(list.subList(3, 12));
		System.out.println(list.remove(1));
		
		System.out.println("==================String Array closed====================");
	
		ArrayList<Character> list3= new ArrayList<>(5);
		list3.add('a');
		list3.add('b');
		list3.add('c');
		list3.add('d');
		list3.add('e');
		list3.add('e');
		list3.add('e');
		
		for(char c:list3) {
			System.out.println(c);
		}
		list3.clear();
		System.out.println("list3: "+list3);
		System.out.println(list3.isEmpty());
		int size1= list3.size();
		System.out.println(size1);
	}	
	public void ReversArrayList() {
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(43);
		l.add(24);
		l.add(15);
		l.add(100);
		l.add(9);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println("reverse " +l);
			
	}
	
	public void Maximun() {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(23);
		A.add(12);
		A.add(43);
		A.add(24);
		A.add(15);
		A.add(100);
		
	int max = Collections.max(A);
	System.out.println("Maximun value: "+max);
	int min = Collections.min(A);
	System.out.println("Minimum value: "+min);
	
	ArrayList<String> A1 = new ArrayList<>();
	A1.add("syed");
	A1.add("cde");
	A1.add("rahil");
	A1.add("anada");
	A1.add("rohan");
	A1.add("semi");
	
	String max1 = Collections.max(A1);
	System.out.println("String Maximun value: "+max1);
	String min1  = Collections.min(A1);
	System.out.println("String Minimum value: "+min1);
		
	ArrayList<Character> A2 = new ArrayList<>();
	A2.add('s');
	A2.add('d');
	A2.add('f');
	A2.add('y');
	A2.add('w');
	A2.add('i');
	
	Character max2 = Collections.max(A2);
	System.out.println("Character Maximun value: "+max2);
	 Character min2 =  Collections.min(A2);
	System.out.println("Character Minimum value: "+min2);
	}
	
	
       
	public static void main(String[] args) {
		ArrayListP a =new ArrayListP();
//		a.Array();
//		a.ReversArrayList();
		a.Maximun();
	}
	
		
		
	

}
